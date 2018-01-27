class A
{
  A()
  {
    System.out.println("A");
  }
}
class B extends A
{
  B(int x)
  {
    System.out.println("B");
  }
  B()
  {
    System.out.println("Default");
  }
}
class ConsInheritance2 extends B
{
  ConsInheritance2()
  {
    System.out.println("Child");
  }
  ConsInheritance2(int x)
  {
    super();
    System.out.println(x);
  }
  public static void main(String[] args) {
    new ConsInheritance2();
    new ConsInheritance2(60);
  }
}
