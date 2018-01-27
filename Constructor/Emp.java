class Emp
{
  int salary;
  Emp(){
    //salary=15000;  here this is called implicitly by compiler

    salary=15000;
    System.out.println(salary);
  }
    int show(){
      //System.out.println(salary);
      return salary;
    }
  public static void main(String[] args) {
    System.out.println(new Emp().salary);
    //Or another way
    int x=new Emp().salary;
    System.out.println("another way "+x);

    // or another way
    System.out.println(new Emp().show());

    // or another way
    System.out.println("another way "+new Emp());
  }
}
