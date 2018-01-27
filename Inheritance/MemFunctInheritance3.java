/*
  Condition 4. Access modifier in function overriding:
              private : In the case of private both parent and child have same private
                        funciton there is no fuvtion overriding because private data functions
                        are not accessed in child.

  Condition 5. this is in another program MemFunctInheritance4.java
*/

class Base4
{
  private void show()
  {
    System.out.println("Base4");
  }
}
class MemFunctInheritance3 extends Base4
{
  private void show()
  {
    System.out.println("MemFunctInheritance3 (child)");
    // super.show(); this gives compilation error becase private funciton
                    // of parent not accessed in child.
  }
  public static void main(String[] args) {
    MemFunctInheritance3 mfi=new MemFunctInheritance3();
    mfi.show();
  }
}
