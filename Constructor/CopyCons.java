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
  CopyCons(CopyCons cc)
  {
    this.x=cc.x;
    this.y=cc.y;
    cc.x=100;
  }

  public static void main(String[] args) {
    CopyCons t1=new CopyCons(10,20);
    t1.show();
    System.out.println("First value of x"+t1.x);
    CopyCons t2=new CopyCons(t1);
    t2.show();

    //CopyCons t3=new CopyCons(t2);
    //t3.show();
    System.out.println("after modify"+t1.x);
    //
  }
}
