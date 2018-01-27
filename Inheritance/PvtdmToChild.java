/**
  In Inheritance :
  parent class never create object and private not inherited in child class.
  child directly doesnot access non static private methods and data members, child access private method and
  data members via parent.
**/

class Parent
{
  private int x = 10;
  void show()
  {
    System.out.println(x);
  }
}
class PvtdmToChild extends Parent  // this is child
{
  public static void main(String[] args) {
    PvtdmToChild c2=new PvtdmToChild();
    c2.show();
    System.out.println(c2.x);
  }
}
/*class Parent
{
  int x = get();
  private int get(){
    int x=20;
    return x;
  }
}
class PvtdmToChild extends Parent
{
  void show()
  {
    System.out.println(x);
  }
  public static void main(String[] args) {
    PvtdmToChild c2=new PvtdmToChild();
    //c2.show();
    //System.out.println(c2.x);
    //c2.get(10);
    c2.show();

  }
}*/
