class ThisB
{
  int x=10;
  void show(int y){

    // here we are using 'this' keyword which are implicitly pass
    // through class and it's variable like-- ThisB ttt---
    // This is done by compiler
    System.out.println(this.x);
    System.out.println(y);
  }
  public static void main(String[] args) {
    ThisB tt=new ThisB();
    tt.show(20);
  }
}
