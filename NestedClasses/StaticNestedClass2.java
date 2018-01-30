/*Static and Non-static nested class both are treated as data member of that class in
which they are defined.
*/

class Outer
{
  int x=10;
  static int y=20;
//private static class Inner  - to stop go outer
  static class Inner
  {
    static void show()
    {
      System.out.println(y);
    }

    // this private method can not access outside.
    /*private void display();
    {

    }*/


    void display()
    {
      System.out.println("Inner non-static");
    }
  }

  //here we can acces via Inner clas because Inner is Static
  public static void main(String[] args) {
    Inner.show();
  }
}

//here outside the class access without Inheritance...
class StaticNestedClass2
{
  public static void main(String[] args) {

    // we can access of inner here because it is static class
    // here we can acces static show of inner class because it is static
    Outer.Inner.show();

    Outer.Inner i=new Outer.Inner();
    i.display();
  }
}
