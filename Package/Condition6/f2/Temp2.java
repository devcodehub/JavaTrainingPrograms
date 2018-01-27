/*Condition 6:
Using the class of one package into the class of another package without setting a class path.
=>Error
Solution:
set path while copiling and executing
javac -classpath /home/imgautam/Ducat/f1:/home/imgautam/Ducat/f2: p2.Temp2
javac -classpath /home/imgautam/Ducat/f1:/home/imgautam/Ducat/f2: p2.Temp2
or
javac -cp /home/imgautam/Ducat/f1:/home/imgautam/Ducat/f2 -d . *.java
java -cp /home/imgautam/Ducat/f1:/home/imgautam/Ducat/f2 p2.Temp2

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
    new Temp1().show();
  }
}
