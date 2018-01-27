interface My
{
  void show();
}
class MyRegister
{
  public void register(My m1)
  {
    m1.show();
  }
}
class InterfaceDemo implements My
{
  public void show()
  {
    System.out.println("Show (Child)");
  }
  public static void main(String[] args) {
    InterfaceDemo id= new InterfaceDemo();
    MyRegister m=new MyRegister();
    m.register(id);
  }
}
