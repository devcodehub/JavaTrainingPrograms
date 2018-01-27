class ConsChain
{
  ConsChain()
  {
    this(10);
    System.out.println("Default");
  }
  ConsChain(int x)
  {
    this(10,20);
    System.out.println(x);
  }
  ConsChain(int x, int y)
  {
    //this(); it makes inifite loop
    System.out.println(x+y);
  }
  public static void main(String[] args) {
    new ConsChain();
  }
}
