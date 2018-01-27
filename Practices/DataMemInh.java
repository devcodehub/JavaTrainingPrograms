class Base1
{
  int x=50;
}
class DataMemInh extends Base1
{
  int x=10;
  void show()
  {
    System.out.println(x);
    System.out.println(super.x);
    System.out.println(this.x);
  }
  public static void main(String[] args) {
    DataMemInh d=new DataMemInh();
    d.show();
  }
}
