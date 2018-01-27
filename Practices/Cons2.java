class Cons2
{
  int x,y;
  Cons2()
{
  x=10;
  y=20;
}
void show()
{
  System.out.println(x);
  System.out.println(y);
}
public static void main(String[] args) {
  Cons2 c=new Cons2();
  c.show();

  Cons2 c2=new Cons2();
  c2.show();
}
}
