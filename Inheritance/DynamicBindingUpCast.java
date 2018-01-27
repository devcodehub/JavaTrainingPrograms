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

class DynamicBindingUpCast extends Base6
{
  void show(){
  //  super.show();
    //super.disp();
    System.out.println("DynamicBindingUpCast-child");
  }
  void display()
  {
    System.out.println("Display (Child)");
  }
  public static void main(String[] args) {
    Base6 b=new DynamicBindingUpCast();
    b.show();
    b.disp();
    DynamicBindingUpCast dd=(DynamicBindingUpCast)b;
    dd.display();
  }
}
