
//ambiguous error...
class ErrorUsingViceVersa{
  void show(int x, long y){
    System.out.println(x);
    System.out.println(y);
  }
  void show(long z, int x){
    System.out.println(z);
    System.out.println(x);
  }
  public static void main(String[] args) {
    ErrorUsingViceVersa er=new ErrorUsingViceVersa();
    er.show(10, 10);
  }
}
