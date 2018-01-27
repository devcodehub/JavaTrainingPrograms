class Base6
{
  int x=20;
  void show()
  {
    System.out.println(x);
  }
  void disp  (){
    System.out.println("hello");
  }
}

class Child2 extends Base6
{
  void show(){
  //  super.show();
    //super.disp();
    System.out.println("Child");
  }
  void display()
  {
    System.out.println("Display (Child)");
  }
  public static void main(String[] args) {
    Base6 b=new Child2();
    b.show();
    b.disp();
    Child2 dd=(Child2)b;
    dd.display();
  }
}
