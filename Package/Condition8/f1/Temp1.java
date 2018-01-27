/*Condition 8:
Using a class of default package in the a class of package.
=> Error
Solution:
Make another class in default package and set the classpath
*/


public class Temp1
{
public void show()
  {
    System.out.println("Default package from f1");
  }
  public static void main(String[] args) {
    new Temp1().show();
  }
}
