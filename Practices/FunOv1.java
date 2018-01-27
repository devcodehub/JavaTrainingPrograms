class Base4
{
  A show()
  {
    System.out.println("Base");
    return new A();
  }
}
class FunOv1 extends Base4
{
  B show()
  {
    System.out.println("Child");
    super.show();
    return new B();
  }
  public static void main(String[] args) {
    FunOv1 f=new FunOv1();
    f.show();
  }
}
class A
{

}
class B extends A
{

}
