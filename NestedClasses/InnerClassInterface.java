class InnerClassInterface implements My1
{
  public static void main(String[] args) {
    InnerClassInterface ic=new InnerClassInterface();
    ic.xyz();
    z.show();
    Inner i =new Inner();
    i.display();
  }
}
interface My1
{
  default void xyz()
  {
    class Local
    {
      void localDisplay()
      {
        System.out.println("Local class in interface");
      }
    }
    Local l=new Local();
    l.localDisplay();
  }

  My z = new My()
  {
    public void show()
    {
      System.out.println("Anonymous");
    }
  };

  class Inner
  {
    void display()
    {
      System.out.println("Static nested class in interface");
    }
  }

  class Temp extends My1.Inner
  {
    public static void main(String[] args) {
      new Temp().display();
    }
  }
}
interface My
{
  void show();
}
