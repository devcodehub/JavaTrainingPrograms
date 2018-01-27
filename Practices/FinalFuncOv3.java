class Base
{
  final void show()
  {
    System.out.println("Base");
  }
}
class FinalFuncOv3 extends Base
{
  void show()
  {
    System.out.println("Child");
    //super.show();
  }
  public static void main(String[] args) {
    FinalFuncOv3 f=new FinalFuncOv3();
    f.show();
  }
}
