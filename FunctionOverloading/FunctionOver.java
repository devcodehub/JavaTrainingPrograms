
// Function overloading using diffrerent number of argument
class FunctionOver{
  void show()
  {
      System.out.println("No arguent");
  }
  void show(int x){
    System.out.println("One argument");
    System.out.println(x);
  }
  void show(int x, char y){
    System.out.println("two argument");
    System.out.println(x);
    System.out.println(y);
  }
  void show(int x, char y, long z){
    System.out.println("Three argument");
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }
public static void main(String[] args) {
  FunctionOver fo=new FunctionOver();
  fo.show();
  fo.show(20);
  fo.show(30, 'G');
  fo.show(40, 'G', 4545450);
}
}
