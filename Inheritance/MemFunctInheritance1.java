/*
  After JDK 1.5 same function with different return types can be overriding if they satisfy
  these three conditions:-
  1. Parent class class function and a child class function both must be having a return type
     as a referenced. Not a primitive.
     that means both functions must be returning a object of same classes.

  2. The classes whose object returned by the parent class function and by the child class
     function must be having a parent-child relationship.

     Condition 3 in the next program MemFunctInheritance2..java
*/

class Base2
{
  A show()
  {
    System.out.println("Base2");
    return new A(); // returning anonymous object
  }
}
class MemFunctInheritance1 extends Base2
{
  B show()
  {
    System.out.println("MemFunctInheritance1 (Child)");
    super.show();  // super goes to immediate parent
    return new B();// returning anonymous object
  }
  public static void main(String[] args) {
    MemFunctInheritance1 mfi=new MemFunctInheritance1();
    mfi.show();
  }
}

// Here class A and class B has parent-child relationship.
class A
{

}
class B extends A
{

}
