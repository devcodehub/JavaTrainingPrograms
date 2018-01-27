class Demo {
  int salary;
  String name;
  void get(String n, int s)
  {
    name=n;
    salary=s;
  }
  void show(){
    System.out.println(name);
    System.out.println(salary);
  }

  public static void main(String[] args) {
    Demo d=new Demo();
    d.get("Gautam",50000);
    d.show();
  }
}
