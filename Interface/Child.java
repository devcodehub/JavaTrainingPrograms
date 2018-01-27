//1st interface
interface My
{
  void show();
}

//Second Interface
interface My1
{
  void display();
}


//through Separate class to register or Upcasting or get the object of child in reference
// variable of Interface (My m)
/*class MyRegister
{
  public void regis(My m)
  {
    m.show();
  }
  public void register(My1 m1)
  {
    m1.display();
  }
}*/

class Child implements My,My1
{
  public void show()
  {
    System.out.println("Show");
  }
  public void display()
  {
    System.out.println("Display");
  }
  public static void main(String[] args) {
    Child c1=new Child();

    //MyRegister object to pass the object of child through parent interface's method
    /*MyRegister mr=new MyRegister();
    mr.regis(c1);
    mr.register(c1);*/


// This is the way of direct get RID or object of child in reference variable(Of Interface)
    My m = new Child();
    m.show();

    My1 m1= new Child();
    m1.display();
  }
}
