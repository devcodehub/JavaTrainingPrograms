/*
  Rule: Abstract class cannot be initanciated that means you cannot create the object of abstract classes.
  Rule: Only abstract class can have a abstract method. Normal class cannot hace a abstract method.
*/

abstract class Base
{
  int x;
  int y;
  void show()
{
  System.out.println(x);
  System.out.println(y);
}
abstract void display();


//Here this is method to catch the object of child
// Here Parent run the method of child display()
void register(Base b)
{
  b.display();
}
}
class Abs1 extends Base {
  void get(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
  void display()
  {
    System.out.println(x);
    System.out.println(y);
  }

  public static void main(String[] args) {
    Abs1 a=new Abs1();
    a.get(10, 20);

    // at first register the method of Base and pass the argument as object of Child
    a.register(a);
  }
}
