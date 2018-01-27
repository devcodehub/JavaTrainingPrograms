class Base3
{
  void show()
  {
    System.out.println("Base");
  }
}
class MemFunctInh extends Base3
{
  void show()
  {
    System.out.println("Child");
    super.show();
  }
  public static void main(String[] args) {
    MemFunctInh mf=new MemFunctInh();
    mf.show();
  }
}
