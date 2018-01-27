interface My
{
  public static void show()
  {
    System.out.println("My");
  }
}
class InterfaceStatic implements My
{
  public static void main(String[] args) {
    My.show();
  }
}
