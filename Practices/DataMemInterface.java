/*By default all the data members of an interface are final and static also.
*/
interface My
{
  int x=20;  //By default final and static
}
class DataMemInterface
{
  public static void main(String[] args) {
    System.out.println(My.x);  // we can access via interface name
    //My.x=My.x+10;  // error because interface data members are by default final

  }
}
