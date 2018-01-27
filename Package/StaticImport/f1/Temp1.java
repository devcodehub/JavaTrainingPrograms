package p1;

public class Temp1
{
  public static int x=50;
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
      System.out.println(x);
      //new Temp1().display();
  }
}
