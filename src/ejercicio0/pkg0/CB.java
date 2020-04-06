
package ejercicio0.pkg0;
public class CB extends CA{
      public int z;

    public CB(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }
    
      
    public int suma2(){
        return suma() +z;
    }
}
