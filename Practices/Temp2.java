
//Function overloading only changing in argument:
//1.No. of arguments
class Temp2
{
  void show()
  {
    System.out.println("No argument");
  }
  void show(int x)
  {
    System.out.println("Single argument "+x);
  }
  void show(int x, char y)
  {
    System.out.println("2 arguments "+x+" "+y);
  }
  void show(int x, char y, float s)
  {
    System.out.println("3 arguments "+x+" "+y+" "+s);
  }
  public static void main(String[] args) {
    Temp2 t=new Temp2();
    t.show();
    t.show(10);
    t.show(10, 'G');
    t.show(10, 'G', 20.5f);
  }
}
