class StaticNestedClass3
{
  int x=10;
  static int y=100;
  static class Inner
  {
    static void show()
    {
      System.out.println(y);
    }
    public static void main(String[] args) {
      show();
    }
  }
  public static void main(String[] args) {
    
  }
}
