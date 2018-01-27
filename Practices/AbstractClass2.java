//For registration a parent class has to provide a method in which a child is going to pass their reference.

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

  //this is register method of parent in which "Base b"  catch the reference variable of child class
  void register(Base b)
  {
    //here b acces the mothod od child
    b.display();
  }
}
class AbstractClass2 extends Base
{
  void get(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
  void display()
  {
    System.out.println("Display (Child) ");
  }
  public static void main(String[] args) {
    AbstractClass2 a=new AbstractClass2();
    a.get(10, 20);
    a.show();

    //here child is passing it's reference to parent...
    a.register(a);

  }
}
