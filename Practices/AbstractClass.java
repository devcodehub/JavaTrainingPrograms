/*In this program there is no any abstraction.. because..
Rule :
In case of abstraction a child class has to register itself with a parent class by passing it's reference to a parent class.
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
}
class AbstractClass extends Base
{
  void get(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
  void display()
  {
    System.out.println("display");
  }
  public static void main(String[] args) {
    AbstractClass a=new AbstractClass();
    a.get(10,20);
    a.show();
    a.display();

  }
}
