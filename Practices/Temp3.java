// Function overloading using method 2 data types of same numbers of arguments

class Temp3
{
  void show(byte b)
  {
    System.out.println(b);
  }
  void show(int i)
  {
    System.out.println(i);
  }
  void show(char c)
  {
    System.out.println(c);
  }
  void show(float f)
  {
    System.out.println(f);
  }
  void show(double d)
  {
    System.out.println(d);
  }
  public static void main(String[] args) {
    Temp3 t=new Temp3();
    t.show(2);
    t.show(50);
    t.show('G');
    t.show(60.50f);
    t.show(1005.222);
  }
}
