//Non-static nested class can access all the data member and member functions of it's outer class.

class NestedClassNonStatic
{
  int x=10;
  static int y=20;
  class Inner
  {
    int x=50;
    void show()
    {
      System.out.println(x);
      System.out.println(y);
      System.out.println(NestedClassNonStatic.this.x);  // this prints Outer non-static..
    }
  }
  public static void main(String[] args) {
    NestedClassNonStatic n=new NestedClassNonStatic();
    System.out.println(n.x);

    NestedClassNonStatic.Inner i=n.new Inner();  // Inner is class type non-static data member
    i.show()
  }
}
