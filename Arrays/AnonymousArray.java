/*An array in java without name is Anonymous Array.
The main purpose of Anonymous array is just for instant use (For one time use only).
Anonymous array is passed as an argument of method.
*/

class AnonymousArray
{
  static void max(int a[])
  {
    for (int i = 0; i<a.length; ++i ) {
      System.out.println(a[i]+ "");
    }
  }
  public static void main(String[] args) {

    max(new int[]{10, 20, 30, 40, 50});
    }
  }
