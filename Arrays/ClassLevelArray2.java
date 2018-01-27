import java.util.*;

class ClassLevelArray2
{
  String name[];
  public static void main(String[] args) {
    System.out.println("Enter the total number of students: ");
    int size=new Scanner(System.in).nextInt();

    ClassLevelArray2 c=new ClassLevelArray2();
    c.name=new String[size];

    for(int i=0; i<c.name.length; i++)
    {
      c.name[i]=new Scanner(System.in).nextString();
    }
    for(String s:c.name)
    {
      System.out.println(s);
    }
  }
}
