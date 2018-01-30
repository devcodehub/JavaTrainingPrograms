//Non-static nested class can access all the data member and member functions of it's outer class.

class NestedClassNonStatic
{
  int x=10;
  static int y=20;
  class Inner
  {
    int x=50;
    final static int z=100;  // allows only final static  but not static

    // Not allowed in member Functions
    /*final static void display()
    {
      System.out.println("display");
    }*/
    void show()
    {
      System.out.println(z);
      System.out.println(x);
      System.out.println(y);
      System.out.println(NestedClassNonStatic.this.x);  // this prints Outer non-static..
    }
  }
  public static void main(String[] args) {
    NestedClassNonStatic n=new NestedClassNonStatic();
    System.out.println(n.x);

    NestedClassNonStatic.Inner i=n.new Inner();  // Inner is class type non-static data member
    i.show();
  }
}

class Emp extends NestedClassNonStatic{
  int x;
  void show()
  {
    System.out.println(x);
    System.out.println(this.x);
    //System.out.println(NestedClassNonStatic.this.x);
  }
  public static void main(String[] args) {
    Emp e=new Emp();
    Temp.Inner i =e.new Inner();
    i.show();
    e.show();
  }
}
