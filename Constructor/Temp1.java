class Temp1
{
  int x=10;  // in java when we define non-static data members at class level
  int y=20;  // then compiler make default constructor implicitly
  /*Temp1()
  {
    //x=12;
    //y=90;
    System.out.println(x);
    System.out.println(y);
  }*/
  void show(){
    System.out.println(x);
    System.out.println(y);
  }
  public static void main(String[] args) {
    //new Temp1(); This print only default constructor
    new Temp1().show();
  }
}
