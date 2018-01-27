/*If you import any class statically then all the static things of that class can be used
directly(without any a class name) into another package.
*/

package p2;
//import static p1.Temp1.x;     for partucular import only x
//import static p1.Temp1.show;  for partucular import only staic show
import static p1.Temp1.*;       // This is import only static this of Temp1 class
import p1.*;              // Normall import use non-static things and static things via class name

public class Temp2
{

/* void show()                    if we put this jvm gives main priority to this show..
  {
    System.out.println("package p1 from f2");
  }*/
  public static void main(String[] args) {

  show();
  System.out.println(x);
  new Temp1().display();
  }
}
