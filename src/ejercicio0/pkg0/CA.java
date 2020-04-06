/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0.pkg0;
import inerfases.IC;
/**|
 *
 * @author Ander
 */
public class CA  implements IC{
    public int x;
    public int y;
    public CA(  int x, int y) {
        
      this.x=x;
      this.y=y;
    }
    
  public CA(){
      this(0,0);
  }

   
    public int suma(){
        return x+y;
    }

    @Override
    public int Mayor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
