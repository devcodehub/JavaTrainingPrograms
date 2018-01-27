import java.util.*;

class LocalevelArray2
{
  public static void main(String[] args) {

    System.out.println("Enter size of an array: ");
    int x1 = new Scanner(System.in).nextInt();   // input through user the size of an array
    int z[]=new int[x1];      //this is array define and initialization

    System.out.println("Enter the array data number:");
    //this loop for entering array data
    for(int i=0; i<z.length; i++)
    {
      z[i]=new Scanner(System.in).nextInt();
    }

     //for advanced loop
     // For showing the data of an array which is entered above                   
     for(int x:z)
     {
       System.out.println(x);
     }
  }
}
