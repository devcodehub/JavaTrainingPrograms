/*If you make any non-static data member as a final then it become constant that means you can not
change the value of this variable.
*/
class FinalNonStaticMem
{
  final int x=10;
  final int y;     // normal it has to be initialsed at class level.
  
  public static void main(String[] args) {
    FinalNonStaticMem f1=new FinalNonStaticMem();
    //f1.x=f1.x+90;  Error
    System.out.println(f1.x);
  }
}
