
// Local variable within local variable
/*
public static void main(String[] args) {
  {
    int x=15;
    int y=20;
    System.out.println(x);
  }
  int x=10;
  System.out.println(x);

  //Here local variable y is not accessible
  System.out.println(y);
s
*/
class LocalVar
{
  public static void main(String[] args) {
    {
      int x=15;
      int y=20;
      System.out.println(x);
    }
    int x=10;
    System.out.println(x);

    //Here local variable y is not accessible
    System.out.println(y);
  }
}
