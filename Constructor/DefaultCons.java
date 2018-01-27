
// this is default constructor
class DefaultCons
{
  int x;
  int y;
  DefaultCons()
  {
    x=10;
    y=20;
  }
  void show()
  {
    System.out.println(x);
    System.out.println(y);
  }
public static void main(String[] args) {
  DefaultCons dc=new DefaultCons();
  dc.show();
  System.out.println(" Through Next object");
  DefaultCons dc1=new DefaultCons();
  dc1.show();
}
}
