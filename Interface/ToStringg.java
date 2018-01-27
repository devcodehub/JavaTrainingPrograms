interface My
{
  void show();
}
class ToStringg implements My
{
   public void show()
  {
    System.out.println("Show");
  }
  public String toString(){
    return "Hello";
  }
  public static void main(String[] args) {
    My m=new ToStringg();
    m.show();
    String s=m.toString();
    System.out.println(s);
  }
}
