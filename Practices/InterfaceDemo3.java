/*In this example .. If both interface have same method ..them child has to override that method  only once.
*/

interface My
{
  void show();
}
interface My1
{
  void show();
}
 class InterfaceDemo3 implements My, My1
 {
   public void show()
   {
     System.out.println("My : show");
   }
   public static void main(String[] args) {
     My m =new InterfaceDemo3();
     m.show();
     My m1=new InterfaceDemo3();
     m1.show();
   }
 }
