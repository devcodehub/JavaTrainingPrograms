//This is program to find out Max number in multi dimensional arrays(ArraysOfArrays)

import java.util.*;

class MaxinArraysOfArrays
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


// This is for find out Maximum number in multi dimensional array
int max=a[0][0];
for (int i=0; i<a.length; i++ ) {

  for(int j=0; j<a[i].length; j++)
  {
    if(a[i][j] > max)
    {
      max=a[i][j];
    }
  }
}
    System.out.println("Maximum number "+max);

  }
}
