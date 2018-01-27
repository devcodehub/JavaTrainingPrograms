/*
Inheritance :
By default all the data members and member function of a parent class are available to child
class, if they are not private.
*/


class Base{
  int x;
  int y;
  void show()
  {
    System.out.println(x);
    System.out.println(y);
  }
}
class Child1 extends Base  // this is child
{
  void get(int x, int y){
    this.x=x;
    this.y=y;
  }
  public static void main(String[] args) {
    Child1 c1=new Child1();
    c1.get(10, 20);
    c1.show();
  }
}
