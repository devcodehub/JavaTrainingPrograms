interface My
{
  int x=30;
}
interface My1
{
  int x=25;
}
class DataMemInterface2 implements My, My1
{
  public static void main(String[] args) {
    //System.out.println(x);   two interface have same data members

    //x=x+90;  // they are by default final

    System.out.println(My.x);
    System.out.println(My1.x);

  }
}
