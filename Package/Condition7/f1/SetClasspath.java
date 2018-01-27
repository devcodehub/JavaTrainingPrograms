/*Condition 7
Setting a classpath of any package via java program
*/
public class SetClasspath
{
  public static void main(String[] args) {
    String cp=System.getProperty("java.class.path");
    System.out.println(cp);
    System.setProperty("java.class.path","/home/imgautam/Ducat/f1");
    String cp1=System.getProperty("java.class.path");
    System.out.println(cp1);
  }
}
