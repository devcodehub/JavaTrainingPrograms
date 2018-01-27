class InitBlock
{
  int x;
  {
    x=10;
    System.out.println("Init block");
  }
  InitBlock()
  {
    System.out.println(x);
    System.out.println("default cons");
  }
  InitBlock(int x)
{
  System.out.println(x);
}
public static void main(String[] args) {
  System.out.println("from default cons");
  new InitBlock();
  System.out.println("from parameterised Constructor");
  new InitBlock(50);
}
}
