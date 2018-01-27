class Temp2
{
  Temp2(int x)
  {
    System.out.println(x);
  }
  Temp2()
  {
    System.out.println("default");
  }
  public static void main(String[] args) {
    //Temp2 t=new Temp2();
    new Temp2(10); // it calls parameterized constructor
    new Temp2();  // it calls default constructor
  }
}
