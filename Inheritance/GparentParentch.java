/*
  If in the case of function in below program the show() function in Dadaji, Parent and child classes
  is same, there is function overriding . And child access only it's parent show() fundtion using this
  technique, and child can not access show () funciton of Dadaji using this technique.

  this technique is working only non-static data members.
*/

class Parentt extends Dadaji
{
  int x=50;
}
class Dadaji
{
  int x=80;
}
class GparentParentch extends Parentt {  // this is child
  int x=40;
  void show()
  {
    System.out.println("From child "+x);
    System.out.println("From Parentt "+super.x);   // super goes to immediate parent
    System.out.println("From Dadaji "+((Dadaji)this).x); // this print Dadaji
    System.out.println("From Parentt "+((Parentt)this).x); // this prints parent

  }
  public static void main(String[] args) {
    GparentParentch gp=new GparentParentch();
    gp.show();
  }
}
