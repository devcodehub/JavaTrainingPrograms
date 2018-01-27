/*Array:
Array is a collection of similar data type with continuous memory.
In java there is concept of Dynamic Memory Allocation.
*/

import java.util.*;

class LocalevelArray1
{
  public static void main(String[] args) {

    int z[]=new int[5];      //this is array define and initialization

    //this loop for entering array data
    for(int i=0; i<z.length; i++)
    {
      z[i]=new Scanner(System.in).nextInt();
    }

    //This loop for displaying data of array
    for (int i=0; i<z.length; i++) {
      System.out.println(z[i]);
    }

     //for advanced loop
     for(int x:z)
     {
       System.out.println(x);
     }
  }
}
