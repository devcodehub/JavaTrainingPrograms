class ConsChain
{
  ConsChain()
  {
    this(10);
    System.out.println("default");
  }
  ConsChain(int x)
  {
    this(10, 20);
    System.out.println(x);
  }
  ConsChain(int x, int y)
  {
    System.out.println(x+y);
  }
  public static void main(String[] args) {
    new ConsChain();
  }
}
