class BlankFinalVar2
{
final int x=getx();
int getx()
{
  System.out.println(x+" Function"); // here the value of x is 0
  return 200;
}
BlankFinalVar2()
{
  System.out.println(x+" Constructor");  // here the value of x is 200;
}
public static void main(String[] args) {
  new BlankFinalVar2();
}
}
