package p1;
import static java.lang.System.*;   // here we can also statically import java classes

public class Temp1
{
  static int x=50;
public static void show()
  {
    System.out.println("package p1 from f1 static");
  }
public void display()
  {
    System.out.println("pkg p1 from f1 non-c");
  }

  public static void main(String[] args) {
      show();
      out.println(x);
      //new Temp1().display();
  }
}
