class PCons
{
  int x;
  int y;
  PCons(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
  void show()
  {
    System.out.println(x);
    System.out.println(y);
  }
  public static void main(String[] args) {
    PCons p=new PCons(10,20);
    p.show();
    PCons p1=new PCons(1000,2000);
    p1.show();

  }
}
