package p2;
import p1.*;

class Package2
{
  void display()
  {
    System.out.println("package p2");
  }
  public static void main(String[] args) {
    Package2 pk=new Package2();
    pk.display();
    Package1 pj=new Package1();
    pj.show();
  }
}
