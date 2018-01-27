class ThisE
{
  int x=getx();
  int getx()
  {
    System.out.println(x);
    return 20;
  }
  ThisE()
  {
    System.out.println(x);
  }
  public static void main(String[] args) {
    new ThisE();
  }
}
