// Data Members are never overriding only hiding          

class Base
{
  int x=20;
  void show()
  {
    System.out.println("Base");
  }
}
class DataMemberHiding extends Base
{
  int x=30;
  void show()
  {
    System.out.println("Child");
  }
  public static void main(String[] args) {
    Base b=new DataMemberHiding();

    b.show();   // here Member functions are overriding

    //But Data Members are never overriding... that's why here is print out of Base
    // Data Member...
    System.out.println(b.x);
  }
}
