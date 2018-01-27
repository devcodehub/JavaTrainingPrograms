
class C
{
  C()
  {
    this(20);
    System.out.println("C");
  }
  C(int x)
  {
    this(20, 20.5005);
    System.out.println(x);
  }
  C(int x, int y)
  {
    System.out.println(x+y);
  }
  C(int x, double d)
  {
    this(50, 50);
    System.out.println(x+d);
  }
}
class ConsChainIn
{
  public static void main(String[] args) {
    new C();
  }
}
