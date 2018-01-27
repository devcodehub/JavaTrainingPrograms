/*Condition 5:
One class having a another class which is parallel to it and it is also getting a same class from another package.
=> Priority is always goes to local
Solution:
class qualify with package name
*/
package p2;
import p1.*;

public class Temp2
{
public void show()
  {
    System.out.println("package p2 from f2");
  }
  public static void main(String[] args) {
    new Temp2().show();
    new Temp1().show(); // this is prints parallel class
    new p1.Temp1().show();
  }
}
