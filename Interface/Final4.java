
// Make a final to non-static data member;

class Final4
{
  final int x=50;
  public static void main(String[] args) {
    Final4 f4=new Final4();
    System.out.println(f4.x);
    //f4.x=f4.x+20;  can not assign final variable again

    Final4 f=new Final4();
  //  f.x=20;   we can not change the value of x through another reference variable.
    System.out.println(f.x);// this pints same value of earlir... so make it static

  }
}
