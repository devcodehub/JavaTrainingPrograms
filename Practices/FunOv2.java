class Base5
{
  Base5 show()
  {
    System.out.println("Base");
    return new Base5();
  }
}
class FunOv2 extends Base5
{
  FunOv2 show()
  {
    System.out.println("Child");
    super.show();
    return new FunOv2();
  }
  public static void main(String[] args){
    FunOv2 f =new FunOv2();
    f.show();
  }
}
