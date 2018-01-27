import java.util.*;

class MergeSortUsingSort
{
  void mergesSort(int x[], int y[])
  {
    int z[]=new int[(x.length+y.length)];
    int c=0;

    for(int i=0;i<x.length; i++)
    {
      z[i]=x[i];
      c++;
    }
    for(int j=0; j<y.length; j++)
    {
      z[c++]=y[j];
    }

    Arrays.sort(z);
    for(int i=0; i<z.length; i++)
    {
      System.out.print(z[i]+" ");
    }
    System.out.println();
    //Arrays.sort(z);
    //System.out.println("Sorted array "+Arrays.toString(z));
  }

  public static void main(String[] args) {
    int x[]= new int[5];
    int y[]=new int[5];
    int i=0, j=0;
    System.out.println("Enter first array: ");
    for(i=0; i<x.length; i++)
    {
      x[i]=new Scanner(System.in).nextInt();
    }

System.out.println("Enter second array: ");
    for(j=0; j<x.length; j++)
    {
      y[j]=new Scanner(System.in).nextInt();
    }

    MergeSortUsingSort  m=new MergeSortUsingSort();

    System.out.println("Sorted Array: ");
    m.mergesSort(x, y);
  //  System.out.println(Arrays.toString(x));
    //System.out.println(Arrays.toString(y));

  }
}
