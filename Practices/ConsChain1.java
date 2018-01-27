class ConsChain1
{
  ConsChain1()
  {
    System.out.println("default");
  }
  ConsChain1(int x)
  {
      this();
      System.out.println(x);
  }
  ConsChain1(int x, int y)
  {
    this(10);
    System.out.println(x+y);
  }
  public static void main(String[] args) {
    new ConsChain1(10, 20);
  }
}
