class ThisB
{
  int x=50;
  void show(int x, ThisB b)
  {
    System.out.println(x);// this print 20.. priority always goes to locald
    System.out.println(b.x);  // here we can access instance non-static data member through reference variable
  }
  public static void main(String[] args) {
    ThisB t=new ThisB();
    //here reference variable t has the RID of current object

    t.show(20,t);
    System.out.println(t.x);
  }
}
