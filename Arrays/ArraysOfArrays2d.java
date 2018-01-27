import java.util.*;

class ArraysOfArrays2d
{
  public static void main(String[] args) {
    int a[][]=new int[3][3];


//entering data for row and column wise of an array
    for (int i=0; i<a.length; i++ ) {
      for(int j=0; j<a[i].length; j++)
      {
        a[i][j]=new Scanner(System.in).nextInt();
      }
    }


//Here display the entered data of an arrays
System.out.println(" Print arrays 2D: ");
for (int i=0; i<a.length; i++ ) {
  for(int j=0; j<a[i].length; j++)
  {
    System.out.print(a[i][j]+" ");
  }
  System.out.println();
}
  }
}
