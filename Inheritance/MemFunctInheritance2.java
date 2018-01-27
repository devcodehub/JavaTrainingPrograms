/*
  Condition 3. Parent class function must be return the other parent class object and
               the child class function other child class object.

               Here without taking extra class we use same class just return it's own
               anonymous object.

               Condition 4. in the next program MemFunctInheritance3.java
*/

class Base3
{
  Base3 show()
  {
    System.out.println("Base3");
    return new Base3(); // returing it's own anonymous object
  }
}
class MemFunctInheritance2 extends Base3   // this is child
{
  MemFunctInheritance2 show()
  {
    System.out.println("MemFunctInheritance2 (child)");
    super.show();  // goes to immediate parent
    return new MemFunctInheritance2();
  }
  public static void main(String[] args) {
    MemFunctInheritance2 mfi=new MemFunctInheritance2();
    mfi.show();
}
}
