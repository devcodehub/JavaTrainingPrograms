/*1. anonymous class can be defined and initiated simultaneously.
2. anonymous class does not have any name.
3. You can not have a Constructor inside a anonymous class..
4. anonymous class can not be initiated more than once.
5. anonymous class must be having a parent either a interface or a class.

*/
class AnnoClass1
{
  int x=100;
  static int y=200;

// here this functions return anonymous class reference of My interface type...
  My display()
  {
    return (new My()
    {
      public void show()
      {
        System.out.println(x);
        System.out.println(y);
      }
    });
  }
  public static void main(String[] args) {
    AnnoClass1 a1=new AnnoClass1();

    // here is the show of anonymous class run by parent My interface....
    My z=a1.display();
    z.show();
  }
}

interface My
{
  void show();
}
