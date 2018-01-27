interface My
{
   static void show()
  {
    System.out.println("Show");
  }
}
  class StaticMethod implements My
{
  static void show(){
    System.out.println("show-child");
  }
    public static void main(String[] args) {
    //My.show();
    //StaticMethod sm=new StaticMethod();
    //sm.show();

    My m=new Child();
    m.show();
    }
  }
//static method of interface is not inherited in child class.....
