/*If you want to make any non-static data member as blank final variable then you have to initialsed
it via constructor.
*/

class BlankFinalVar
{
  final int x;
  BlankFinalVar(int x)
  {
    //System.out.println(x);
    this.x=x;  f// this keyword for non-static data member inialise...
    System.out.println(x);
  }
  public static void main(String[] args) {
    BlankFinalVar b1=new BlankFinalVar(10);
    System.out.println(b1.x);
  //  b1.x=b1.x+90;


    BlankFinalVar b2=new BlankFinalVar(30);
    System.out.println(b2.x);
    //b1.x=b1.x+98;
  }
}
