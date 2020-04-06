/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0.pkg0;

/**
 *
 * @author Ander
 */
public class Numeros extends CA implements Comparable<Numeros>{
    public int Numero;

    public Numeros(int Num) {
        
        this.Numero = Num;
    }

    @Override
    public int compareTo(Numeros o) {
         if(Numero==o.Numero){
        return 0;
    }else if(Numero<o.Numero){
        return -1;
    }else{
        return 1;
    }
     }
    
  
}
