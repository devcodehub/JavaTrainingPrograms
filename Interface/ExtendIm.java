//

interface My
{
  void show();
}
class Temp
{
  public void show()
  {
    System.out.println("Show");
    //return 50;
  }
}
class ExtendIm extends Temp implements My
{
  public static void main(String[] args) {
    My m = new ExtendIm();
    m.show();
  }
}
