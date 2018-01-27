class ParamCons
{
  int a, b;
  int x, y;
  int i;
  long l;
  double d;
  ParamCons()
  {
    x=10;
    y=22;
    System.out.println(x);
    System.out.println(y);
  }
  ParamCons(int a, int b)
  {
    this.a=a;
    this.b=b;
  }
  ParamCons(long l, double d, int i)
  {
    this.l=l;
    this.d=d;
    this.i=i;
    System.out.println(l);
    System.out.println(d);
    System.out.println(i);
  }
  void show()
  {
    System.out.println("this is first parameterized cons");
    System.out.println(a);
    System.out.println(b);
  }
  public static void main(String[] args) {
    //new ParamCons(10, 20).show();  this is anonymous object

    new ParamCons(); // default constructor

    System.out.println("This is through parameterized cons.");
    ParamCons pc = new ParamCons(5, 10);  // parameterized construtor
    pc.show();

    new ParamCons(10, 555.55, 6);  // parameterized constructor

  }
}
