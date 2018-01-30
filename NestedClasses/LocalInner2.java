class LocalInner2
{
  int x=20;
  static int y=90;
  void display()
  {
    class Inner
    {
      int p=100;
      void show()
      {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
      }
    }
    Inner i=new Inner();
    i.show();
  }
  public static void main(String[] args) {
    LocalInner2 l=new LocalInner2();
    l.display();
  }
}
