
// Here Init Block is executed before Constructor
class InitBlock{
  int x;
  {
    x=20;
    System.out.println("Init Block");
  }
  InitBlock()
  {
    System.out.println(x);
    System.out.println("Default Constructor");
  }
  InitBlock(int x)
  {
    System.out.println(x);
  }
  public static void main(String[] args) {

    System.out.println("First");
    new InitBlock();
    System.out.println("Second");
    new InitBlock(10);
    //System.out.println("Third");
  //  new InitBlock();
  }
}
