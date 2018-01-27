class Emp
{
  static String cName="Habily";
  String name;
  int salary;
  void get(String s, int i)
  {
      name=s;
      salary=i;
  }
  void show()
  {
    System.out.println(cName);
    System.out.println(name);
    System.out.println(salary);
  }
  static int add(int x, int y)
  {
    return x+y;
  }
  public static void main(String[] args) {
    Emp e1=new Emp();
    e1.get("Lalu", 1001);
    e1.show();
    int z=add(10,20);
    System.out.println(z);
  }

}
