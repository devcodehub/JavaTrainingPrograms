class Dadaji
{
  int x =80;
}
class Base2 extends Dadaji
{
  int x=60;
}
class DataMemMultiInh extends Base2
{
  int x=40;
  void show()
  {
    System.out.println(x);
    System.out.println(super.x);
    System.out.println(((Dadaji)this).x);
    System.out.println(((Base2)this).x);
  }
  public static void main(String[] args) {
    DataMemMultiInh dm=new DataMemMultiInh();
    dm.show();
    System.out.println(((Dadaji)dm).x);

  }
}
