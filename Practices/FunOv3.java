// In case of private there is no function overriding

class Base
{
  private void show()
  {
    System.out.println("Private Base");
  }
}
class FunOv3 extends Base
{
  private void show()
  {
    System.out.println("private Child");
  }
  public static void main(String[] args) {
    FunOv3 f=new FunOv3();
    f.show();
  }
}
