//If you define a class within any block of class except the class block then it is knownn as local class.

class NestedLocalClass  //outer
{
  int x=65;
  static int y=90;
  void display()
  {
    class Inner
    {
      void show()
      {
        System.out.println(x);
        System.out.println(y);
      }
    }
    Inner i=new Inner();
    i.show();
  }
  public static void main(String[] args) {
    NestedLocalClass nl =new NestedLocalClass();
    nl.display();
  }
}
