//We are using init block in Constructor chaining

class InitBlockConsChain
{
  {
    System.out.println("Init Block");
  }
  InitBlockConsChain()
  {
    this(10);
    System.out.println("Default");
  }
  InitBlockConsChain(int x)
  {
    this(10,20);
    System.out.println(x);
  }
  InitBlockConsChain(int x, int y)
  {
    //this(); it makes inifite loop
    System.out.println(x+y);
  }
  public static void main(String[] args) {
    new InitBlockConsChain();
  }
}
