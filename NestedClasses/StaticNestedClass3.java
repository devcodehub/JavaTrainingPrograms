class StaticNestedClass3
{
  int x=10;
  static int y=1;
  static class Inner
  {
    static void show()
    {
      System.out.println(y);
    }
    //public static void main(String[] args) {
      //show();
    //}
  }
}
class Tempo
{
  public static void main(String[] args) {
    StaticNestedClass3.Inner.show();
  }
}
