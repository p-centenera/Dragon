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

    void H(int n){
        if (n>0){
          
            left(90);
            HI(n-1);
            right(90);
            forward(5);
            H(n-1);
            left(90);
            forward(5);
            right(90);
            H(n-1);
            right(180);
            forward(5);
            left(90);
            HI(n-1);
            left(90);
        }
    } 
     void HI(int n){
        if (n>0){
            right(90);
            H(n-1);
            left(90);
            forward(5);
            HI(n-1);
            right(90);
            forward(5);
            left(90);
            HI(n-1);
            left(180);
            forward(5);
            right(90);
            H(n-1);
            right(90);       
            }
     }  
     
     public void run() {
          // Establecer el tamaño (en píxeles) de la tortuga.
         setSize(10);
         // Bajar la pluma de la tortuga para que deje un
         // rastro al momento de desplazarse.
         penDown();
         //Directa(8);
         H(3);
  } 
    public static void main(String[] args) {
         // TODO code application logic here
         new App().start(); 
     }
 }
