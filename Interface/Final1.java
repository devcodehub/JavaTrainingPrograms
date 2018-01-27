final class Temp
{
  void show()
  {
    System.out.println("Show");
  }
}
class Final1 extends Temp
{
  void show()
  {
    System.out.println("Show-child");
  }
  public static void main(String[] args) {

    Final1 f1=new Final1();
    f1.show();
  }
}


// final class can not be inherited in child class..
