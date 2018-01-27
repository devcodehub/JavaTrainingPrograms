package p2;
import p1.*;

class Temp3
{
void show()
  {
    System.out.println("package p2 from f3");
  }
  public static void main(String[] args) {
    new Temp1().show();
    new Temp2().show();
    new Temp3().show();
  }
}
