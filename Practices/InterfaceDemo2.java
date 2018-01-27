//A child class can implements more than one interfaces simultaneously


interface MyOne
{
  void show();
}
interface MyTwo
{
  void display();
}
class InterfaceDemo2 implements MyOne, MyTwo
{
  public void show()
  {
    System.out.println("Show");
  }
  public void display()
  {
    System.out.println("Display");
  }
public static void main(String[] args) {
  MyOne mo=new InterfaceDemo2();
  mo.show();
  MyTwo mt=new InterfaceDemo2();
  mt.display();
}
}
