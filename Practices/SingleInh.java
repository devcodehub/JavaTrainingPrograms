class Base
{
  int x;
  int y;
  void show()
  {
    System.out.println(x);
    System.out.println(y);
  }
}
class SingleInh extends Base
{
  void get(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
  public static void main(String[] args) {
    SingleInh si=new SingleInh();
    si.get(20,30);
    si.show();
  }
}
