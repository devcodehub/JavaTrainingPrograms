class ReturnType
{
  int show(int x)
  {
    System.out.println("Int show");
    return 10;
  }
  void show(int x)
  {
    System.out.println("Show");
  }
  public static void main(String[] args) {
    ReturnType rt=new ReturnType();
    rt.show(10);
  }
}
