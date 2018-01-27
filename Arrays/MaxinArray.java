import java.util.*;

class MaxinArray
{
  public static void main(String[] args) {
    int z[]=new int[5];

    System.out.println("Enter 5 numbers: ");
    for(int i=0; i<z.length;i++)
  {
    z[i]=new Scanner(System.in).nextInt();
  }
  int max=z[0];
  for(int i=1; i<z.length; i++)
  {
    if(z[i] > max)
    {
      max=z[i];
    }
  }
  System.out.println("Maximum number "+max);
  }
}
