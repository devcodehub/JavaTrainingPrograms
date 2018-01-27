/* If you make any static data member as a final it will become constant.then you can not change the value of
this variable throughout the class .....
An it has to initialised at class level
*/
class FinalStaticVar
{
  //final static int x; final static must be initialsed al class level
  final static int x=30;
  public static void main(String[] args) {
    System.out.println(x);
    //x=x+20;

  }
}
