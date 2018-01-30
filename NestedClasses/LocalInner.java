//Local class inside the display method...

class LocalInner
{
  int x=30;
  static int y=50;

  //function with interface return type
  My display()
  {
    int p=88;
    class Inner implements My
    {
      public void show()
      {
        System.out.println(p);
        System.out.println(x);
        System.out.println(y);
      }
    }

    //Local class make it's object within a function not outside
    My m = new Inner();
    return m;
  }
  public static void main(String[] args) {
    LocalInner li=new LocalInner();
    //li.show();
    My z=li.display();
    z.show();
  }
}
interface My
{
  void show();
}
