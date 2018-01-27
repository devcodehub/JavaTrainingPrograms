/* Condtion 6.
  Final funciton of a parent class cannot be overridden by the child class that
  means to stop function overriding make it final.

*/

class Base5
{
  final void show()
  {
    System.out.println("Base5");
  }
}
class MemFunctInheritance5 extends Base5
{
  /*void show()  this is not override becase in parent show funciton is final which is not override in any other child class.
  {
    System.out.println("MemFunctInheritance5 (child)");
  }*/
  public static void main(String[] args) {
    MemFunctInheritance5 mfi=new MemFunctInheritance5();
    mfi.show();
  }
}
