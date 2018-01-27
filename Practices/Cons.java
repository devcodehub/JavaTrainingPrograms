class Cons
{
  Cons()
  {
    System.out.println("Default Constructor");
  }
  void Cons()
  {
    System.out.println("Hello from function");
  }
  public static void main(String[] args) {
    //Cons c=new Cons();
    new Cons();
    new Cons().Cons();
  }
}
