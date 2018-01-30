/*Whenever we create the object of a String class using a String literal then they are get in a
special memory area called String constant pool[inside metaspace]. Not hold of duplicate objects.
*/
class StringClass2
{
  public static void main(String[] args) {
    String s1= "Hello";
    String s2= "Hello";
    if(s1==s2)
    {
      System.out.println("Same ");
    }
  }
}
