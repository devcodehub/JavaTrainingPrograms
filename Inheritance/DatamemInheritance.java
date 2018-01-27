/*
=> Whenever a parent class is a child both are having same data member
   , this concept is known as data hiding.(Not data overriding)

   => If there is data hiding and 'super' keyword is mandatory to access Parent
       non-static data members.
*/

class Base
{
  int x=20;
}
class DatamemInheritance extends Base // this is child
{
  int x=60;
  void show()
  {
      System.out.println(x);
      System.out.println(super.x);
      System.out.println(this.x);

  }
  public static void main(String[] args) {
    DatamemInheritance di=new DatamemInheritance();
    di.show();
  }
}
