/*Here interface give body of member function using default keyword.
Child does not overide this method...
*/

interface My
{
  public default void show()
  {
    System.out.println("Show From Interface: (default method)");
  }
}
class InterfaceDefault implements My
{
  public static void main(String[] args) {
    My m=new InterfaceDefaut();
    m.show();
  }
}
