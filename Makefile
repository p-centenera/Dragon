CLASSPATH := lib/acm-jtf.jar
SRC=src
CLASSDEST=bin
APP=app.jar
JAVA=$(shell find $(SRC) -type f -name '*.java')
CLASSES=$(patsubst $(SRC)/%, $(CLASSDEST)/%, $(JAVA:%.java=%.class))
JARDEST=lib
GENSRC=build/ 
PPAL=Dragon

build/setup:
	-mkdir -p $(CLASSDEST)
	-mkdir -p $(GENSRC)
compilar: limpiar build/setup
	javac -g -cp $(CLASSDEST) -d $(CLASSDEST) -classpath $(CLASSPATH) -sourcepath $(SRC) $(SRC)/*.java
jar:compilar
	jar cvfm $(APP) manifest.mf -C $(CLASSDEST) .
ejecutar: jar
	java   -jar $(APP) 
limpiar:
	rm -rf $(CLASSDEST)
	rm -rf $(GENSRC)
cjavadoc: compilar
	find . -type f -name "*.java" | dxargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8
