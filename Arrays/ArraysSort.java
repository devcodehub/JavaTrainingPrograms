import java.util.*;

class ArraysSort
{
  public static void main(String[] args) {
    int z[]=new int[5];

    System.out.println("Enter 5 numbers: ");
    for(int i=0; i<z.length;i++)
  {
    z[i]=new Scanner(System.in).nextInt();
  }

int temp;
  for(int i=0; i<z.length;i++)
  {
    for(int j=i+1; j<z.length;j++)
    {
      if(z[i] > z[j])
      {
        temp=z[i];
        z[i]=z[j];
        z[j]=temp;
      }
    }
  }

  for(int i=0; i<z.length-1; i++)
  {
    System.out.print(z[i]+",");
  }
  System.out.println(z[z.length-1]);
  }
}
