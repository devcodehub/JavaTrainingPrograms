class A{
  A()
  {
    System.out.println("A");
  }
}
class B extends A
{
  B()
  {
    System.out.println("B");
  }
}
class ConstInheritance extends B
{
  ConstInheritance()
  {
    System.out.println("ConstInheritance - Child");
  }
  ConstInheritance(int x)
  {
    System.out.println(x);
  }
  public static void main(String[] args) {
    new ConstInheritance();
    new ConstInheritance(10);
  }
}
