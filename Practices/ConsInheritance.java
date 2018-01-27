/*When a child class Constructor exucuted it has to call immediate parent class Constructor
first then itself.
If somehow child class Constructor is not able to call immediate parent class Constructor
first then it can not run itself.
This rule is  made for the reusuability of a Constructor of a parent class in child class.*/

class A
{
  A()
  {
    super();
    System.out.println("A");
  }
}
class B extends A
{
  B()
  {
    super();
    System.out.println("B");
  }
}
class ConsInheritance extends B
{
  ConsInheritance()
  {
    super();
    System.out.println("ConsInheritance");
  }
  ConsInheritance(int x)
  {
    super();
    System.out.println(x);
  }
  public static void main(String[] args) {
    new ConsInheritance();
    new ConsInheritance(19);
  }
}
