class Final5
{
  final static int x;
Final5(int x)
  {
    this.x=x;
    System.out.println(x);
  }
  public static void main(String[] args) {
  Final5 f=new Final5(20);
    System.out.println(f.x);
  Final5 f1=new Final5(30);
  System.out.println(f1.x);
  }
}
