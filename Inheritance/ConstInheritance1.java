// In Java every constructor of every child class is having super() as first line. and
// and this super() is inserted by compiler.

class A{
  A()
  {
    System.out.println("A");
  }
}
class B extends A {
  B(int x)
  {
    //super();                // this is called by compiler implicitly
    System.out.println(x);
  }
  B()
  {
    //super();                // this is called by compiler implicitly
    System.out.println("Default");
  }
}
class ConstInheritance1 extends B
{

  ConstInheritance1()
  {
    super(10);   // This super(10) we called this to run parameterized constructor of immediate Parent
    System.out.println("ConstInheritance1-Child");
  }
  ConstInheritance1(int x)
  {
    //super();                // this is called by compiler implicitly
    System.out.println(x);
  }
  public static void main(String[] args) {
    new ConstInheritance1();
    new ConstInheritance1(100);
  }
}
