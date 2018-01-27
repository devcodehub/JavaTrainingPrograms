/*Condtion 4 :
Using the class of one package into the package into the default package
=> gives error
Solution:
Never keep any .java file to any package.
*/

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
