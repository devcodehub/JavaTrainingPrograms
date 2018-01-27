class ThisA
{
  int x=10;
  void show(int x)
  {
    System.out.println(x);
    System.out.println(x);
  }
  public static void main(String[] args) {
    ThisA t=new ThisA();
    t.show(50);
  }
}
