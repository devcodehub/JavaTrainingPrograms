class Base
{
  private int x=50;
  int y=getx();
  void show()
  {
    System.out.println("Private data member "+x);
  }
  private int getx()
  {
    return 30;
  }
}
class SingleInh1 extends Base
{
  public static void main(String[] args) {
    SingleInh1 s1=new SingleInh1();
    s1.show();
    System.out.println("Private function via parent "+s1.y);
    //System.out.println(s1.x); this is not access direct
  //  s1.getx(); this is not access direct
  }
}
