//2 We create array through initialization.

class ArrayViaInitialization
{
  public static void main(String[] args) {

    int x[]={10, 20, 30, 40, 50};  //here define and initialization of Array....

    System.out.println(x.getClass().getName());
    for(int y:x)
    {
      System.out.println(y);
    }
  }
}
