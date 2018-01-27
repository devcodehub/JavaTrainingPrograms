class Emp1
{
  
  String name;
  public static void main(String[] args) {
    Emp1 e1=new Emp1();
    System.out.println("RID: e1 = "+e1);
    e1.name="Lalu";
    System.out.println(e1.name);
    Emp1 e2 = e1;
    System.out.println("RID: e2 = "+e2);
    e2.name="Bhalu";
    System.out.println(e1.name);

  }
}
