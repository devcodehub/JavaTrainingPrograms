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
class ConsInheritance3 extends B
{
  ConsInheritance3()
  {
    super(10);
    System.out.println("Child");
  }
  ConsInheritance3(int x)
  {
    super();
    System.out.println(x);
  }
  public static void main(String[] args) {
    new ConsInheritance3();
    new ConsInheritance3(60);
  }
}
