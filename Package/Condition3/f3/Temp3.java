/*Condtion 3 :
Two different folders having two different packages but with having same classes.
=> gives error
Solution:
class qualify with package name
*/
package p3;
import p1.*;
import p2.*;

class Temp3
{
void show()
  {
    System.out.println("package p3 from f3");
  }
  public static void main(String[] args) {
    new p1.Temp1().show();
    new p2.Temp1().show();
    new Temp3().show();
  }
}
