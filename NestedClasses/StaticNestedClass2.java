/*Static and Non-static nested class both are treated as data member of that class in
which they are defined.
*/

class Outer
{
  int x=10;
  static int y=20;
  static class Inner
  {
    static void show()
    {
      System.out.println(y);
    }
  }
}
class StaticNestedClass2
{
  public static void main(String[] args) {

    // we can access of inner here because it is static class
    // here we can acces static show of inner class because it is static
    Outer.Inner.show();
  }
}
