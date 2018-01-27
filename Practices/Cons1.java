class Cons1
{
  int salary;
  Cons1()                                     
  {
    this.salary=15000;
    return ;
  }
  public static void main(String[] args) {
    Cons1 c=new Cons1();
    Cons1 d=new Cons1();
    System.out.println(c.salary);
    d.salary=30000;
    System.out.println(d.salary);
  }
}
