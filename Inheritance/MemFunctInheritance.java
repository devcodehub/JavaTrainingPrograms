/*
  Rule:
  Whenever a parent and a child class having same function and this concept is
  known as function overriding.

  function overriding is concept to achieve dynamic binding.     
*/


class Base1
{
  void show()
  {
    System.out.println("Base1");
  }
}
class MemFunctInheritance extends Base1  // this is child
{
  void show()
  {
    System.out.println("Child (MemFunctInheritance)");
    super.show();
  }
  public static void main(String[] args) {
    MemFunctInheritance mi = new MemFunctInheritance();
    mi.show();
  }
}
