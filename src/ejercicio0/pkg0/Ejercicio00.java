
package ejercicio0.pkg0;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;


public class Ejercicio00  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rl=new Random();
        CB a = new CB(1,1,1);  
        System.out.println("suma es: "+a.suma2());
        
        ArrayList<Numeros> Array =new ArrayList<>();
        for(int i=0;i<16;i++){
            Array.add(new Numeros(rl.nextInt(100)));
        }
        
        Collections.sort(Array);
        System.out.println("Números en orden");
        for(Numeros n: Array){
            System.out.println(n.Numero);
        }
    }
    
}
