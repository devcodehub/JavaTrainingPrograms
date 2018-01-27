
//static data member as final it will become constant that means you canot change the value of this variable throughout
// the program.....
//final static data  member must be initialised at class level

interface My1
{

}
class Final2
{
  final static int x=10;
  //final static int y; this gives error because it must be initialised at class level
  public static void main(String[] args) {
    System.out.println(x);
    //x=x+10; final variable is constant
  }
}
