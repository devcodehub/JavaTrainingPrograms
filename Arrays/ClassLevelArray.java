// 1. Here we are creating array using New operator.....

import java.util.*;

class ClassLevelArray {
    // int z[] = new int[10];     define array size statically

    int z[];  // define at class level
    char m[];
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int x1 = new Scanner(System.in).nextInt();


        //Create an object of a class...
        // and through the reference of class we create array size
        ClassLevelArray c = new ClassLevelArray();
        c.z = new int[x1];

        //This is loop for entering array data
        for (int i = 0; i < c.z.length; i++)
        {
            c.z[i]=new Scanner(System.in).nextInt();
        }
        for (int x:c.z)   // for showing the data of an Array
        {
            System.out.println(x);
        }

    }
}
