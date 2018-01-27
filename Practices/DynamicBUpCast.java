class Base
{
  void show()
  {
    System.out.println("Base");
  }
}
class DynamicBUpCast extends Base
{
  void show()
  {
    System.out.println("Child");
  }
  void display()
  {
    System.out.println("display");
  }
  public static void main(String[] args) {

    //Upcasting....
    Base b=new DynamicBUpCast();
    b.show();


    //down casting.......
    DynamicBUpCast d1=(DynamicBUpCast)b;
    d1.display();
  }
}
