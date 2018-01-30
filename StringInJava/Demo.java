class Temp
{
  final int x;
   private Temp()
  {
    x=40;
  }
  public static Temp getInstance()
  {
    return new Temp();
  }
  public static void main(String[] args) {
      getInstance();
  }
}
class Demo
{
  public static void main(String[] args) {
    Temp t = Temp.getInstance();
    //t.getInstance();
  }
}
