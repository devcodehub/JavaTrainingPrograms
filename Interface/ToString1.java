interface My
{
  String toString();
}
class Demo
{
public String toString()
{
  return "gautam";
}
}
class ToString1 extends Demo implements My
{
/*  public String toString()
  {
    return "gautam";
  }*/
  public void show()
  {
    System.out.println("hellooooo");
  }
  public static void main(String[] args) {

    My m=new ToString1();
    String s=m.toString();

    //m.toString();
  }
}
