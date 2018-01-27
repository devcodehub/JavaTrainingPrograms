class ThisC
{
  int x=10;
  void show(int x)
  {
    System.out.println(this.x);  // this print the current object RID's value that is 10
    System.out.println(x);
  }
  public static void main(String[] args) {
    ThisC t=new ThisC();
    t.show(20);
    System.out.println(t.x);// this print the current object RID's value that is 10
  }
}
