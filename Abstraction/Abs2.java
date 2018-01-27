abstract class Base
{
  int x;
  int y;
  /*void show()
{
  System.out.println(x);
  System.out.println(y);
}*/
abstract void display();


//Here this is method to catch the object of child
// Here Parent run the method of child display()
void register(Base b)
{
  b.display();
  //b.display();
}
}
class Base2 extends Base
{
  void display()
  {
    System.out.println("display");
  }
}
class Abs2 extends Base {
  void get(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
  void display()
  {
    System.out.println("Abs1 display");
    System.out.println(x);
    System.out.println(y);
  }

  public static void main(String[] args) {
    Abs2 a=new Abs2();
    a.get(10, 20);

Base2 b=new Base2();
    // at first register the method of Base and pass the argument as object of Child
    a.register(a);
    b.register(b);
  }
}
