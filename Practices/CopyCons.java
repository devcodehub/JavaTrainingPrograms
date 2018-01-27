class CopyCons
{
  int x;
  int y;
  CopyCons(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
  void show()
  {
    System.out.println(x);
    System.out.println(y);
  }
  CopyCons(CopyCons z)
  {
    this.x=z.x;
    this.y=z.y;
  }
  public static void main(String[] args) {
    CopyCons p=new CopyCons(100, 200);
    p.show();
    CopyCons p1=new CopyCons(p);
    p1.show();
    System.out.println(p1.x);

  }
}
