import acm.graphics.GTurtle;
public class Dragon extends GTurtle{
    void Directa(int n){
       if (n==0)
          forward(5);
       else{
           Directa(n-1);
           right(90);
           Inversa(n-1);
       }
   } 
    void Inversa(int n){
       if (n==0)
          forward(5);
       else{
            Directa(n-1);
            left(90);
            Inversa(n-1);
       }
    }
  public void run() {
         // Establecer el tamaño (en píxeles) de la tortuga.
        setSize(10);
        // Bajar la pluma de la tortuga para que deje un
        // rastro al momento de desplazarse.
        penDown();
        Directa(8);
 } 
   public static void main(String[] args) {
        // TODO code application logic here
        new Dragon().start(); 
    }
}
