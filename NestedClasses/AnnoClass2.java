class AnnoClass2
{
    int x=10;
    static int y=90;
    void display(My m)
    {
      m.show();
    }
    public static void main(String[] args) {
      AnnoClass2 an= new AnnoClass2();
      an.display(new My()
      {
        public void show()
        {
          System.out.println("anonymous");
        }
      });
    }
}
interface My
{
  void show();
}
