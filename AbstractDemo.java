abstract class Temp
{
  abstract void show();
}
class Temp1 extends Temp{
  void show()
  {
    System.out.println("Hello print");
  }

}
public class AbstractDemo
{
  public static void main(String[] args) {
    Temp1 t1=new Temp1();
    t1.show();
  }
}
