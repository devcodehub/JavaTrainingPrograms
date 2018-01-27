class ThisA
{
  int x=10;
  void show(ThisA tt, int x){
    System.out.println(x);
    System.out.println(tt.x);
  }
/*  void show(int x){
    System.out.println(x);
    System.out.println(x);
  }*/
  public static void main(String[] args) {
    ThisA t=new ThisA();
    t.show(t,20);
    System.out.println(t.x);
  }
}
