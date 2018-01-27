class Temp3
{
  int x=getX();  // here x get default value 0
  int getX()
  {
    System.out.println(x);  // here it prints the default value 0
    return 20;// then return 20
  }
  Temp3()
  {
    System.out.println(x); // it prints value of x modified
  }
  public static void main(String[] args) {
    new Temp3();
  }
}

// Compiler does
/**
int x;
Temp3()
{
x=getX();
System.out.println(x);
}
**/
