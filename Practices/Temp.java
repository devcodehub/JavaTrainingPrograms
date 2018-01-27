class Temp
{
  int marks;
  int per;
  void get(int m, int p)
  {
    marks=m;
    per=p;
  }
  void show()
  {
    System.out.println(marks);
    System.out.println(per);
  }
  public static void main(String[] args) {
    Temp t=new Temp();
    t.get(80, 90);
    t.show();
  }
}
