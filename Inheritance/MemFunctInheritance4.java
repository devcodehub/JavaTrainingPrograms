/*
  Condtion 5: Whenever a parent  class and child class funciton  both having same static function then this concept is
              is known as function hiding.

              Condtion 6 is in another program MemFunctInheritance5.java
*/


class Base4
{
  static void show()
  {
    System.out.println("Base4");
  }
}
class MemFunctInheritance4 extends Base4
{
  static void show()
  {
    System.out.println("MemFunctInheritance4 (Child)");
    //super.show();
  }
  public static void main(String[] args) {
    MemFunctInheritance4 mfi=new MemFunctInheritance4();
    mfi.show();
    MemFunctInheritance4 mff= new Base4();
    mff.show();
  }
}
