//This program to sort multi dimensional arrays (Arrays of Arrays)

import java.util.*;



class ArraysSortMultiD
{
  public static void main(String[] args) {
    int a[][]=new int[3][3];


    //input data elements of an arrays
    System.out.println("Enter array elements: ");
    for(int i=0; i<a.length; i++)
    {
      for(int j=0; j<a[i].length; j++)
      {
        a[i][j]=new Scanner(System.in).nextInt();
      }
    }


//this is for showing the data of an array
System.out.println("Arrays data: ");
    for(int i=0; i<a.length; i++)
    {
      for(int j=0; j<a[i].length; j++)
      {
        System.out.print(a[i][j]+"  ");
      }
      System.out.println();
    }


//this is for sorting arrays
int temp=0;
for(int m=0; m<a.length; m++)
{
  for(int n=0; n<a[m].length; n++)
  {
    for(int o=0; o<a.length; o++)
    {
      for(int p=0; p<a[o].length; p++)
      {
        if(a[m][n] > a[o][p])
        {
          temp = a[m][n];
          a[m][n]=a[o][p];
          a[o][p]=temp;
        }
      }
    }
  }
}


// this is for print sorted arrays:
System.out.println("Sorted Arrays of Arrays: ");
for(int i=0; i<a.length; i++)
{
  for(int j=0; j<a[i].length; j++)
  {
    System.out.print(a[i][j]+"  ");
  }
  System.out.println();
}


  }

}
