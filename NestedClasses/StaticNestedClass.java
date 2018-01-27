/*Static and Non-static nested class both are treated as data member of that class in
which they are defined.
*/

class StaticNestedClass
{
  int x=10;
  static int y=20;
  static class Inner
  {
    void show()
    {
      System.out.println(y);
    }
  }
  public static void main(String[] args) {

    //We can access here Inner class by making the object of inner class...
    // we can access of inner here because it is static class
    Inner i=new Inner();
    i.show();
  }
}
