class AnnoClass3
{
  public static void main(String[] args) {
    My z =new My()
    {
      public void show()
      {
        System.out.println("anonymous");
      }
    };
    z.show();
  }
}
interface My
{
  void show();
}
