import java.util.*;

class MininArray
{

  public static void main(String[] args) {
    int z[]=new int[5];
    int index=0;
    System.out.println("Enter 5 numbers: ");
    for(int i=0; i<z.length;i++)
  {
    z[i]=new Scanner(System.in).nextInt();
  }
  int max=z[0];
  for(int i=1; i<z.length; i++)
  {
    if(z[i] < max)
    {
      max=z[i];
      index=i+1;
    }
  }
  System.out.println("Maximum number "+max);
  System.out.println(index);
  }
}
