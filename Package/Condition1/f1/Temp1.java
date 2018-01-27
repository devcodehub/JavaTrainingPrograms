package p1;

public class Temp1
{
  public int x=50;
 public Temp1()
  {
    System.out.println("deafult cons");
  }
   public void show()
  {
    System.out.println("package p1 from f1 show");
  }
  public static void main(String[] args) {
      new Temp1().show();
  }
}
