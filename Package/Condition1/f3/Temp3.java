/*Condition 1:
Two different folders having a same package with same class.
=> First come  First match accoriding to the classpath .
*/

package p2;
import p1.*;

public class Temp3
{

  public static void main(String[] args) {

    new Temp1().show();
  }
}
