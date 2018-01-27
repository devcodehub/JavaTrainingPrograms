/*Child package must be import explicitly....
We can not access of child package with implicitly import
*/


package p2.p2sub1.p2sub2;     // making here sub packages and execute it through all package name
import static p1.sub1.sub2.Temp1.*;
import p1.sub1.sub2.*;
public class Temp2
{

  public static void main(String[] args) {

  show();
  System.out.println(x);
  new Temp1().display();
  new Temp1();
  }
}
