class AnonymousArray2
{
  static void studentName(String[] a)
  {
    for (int i = 0; i<a.length; ++i ) {
      System.out.println(a[i]);
    }
  }
  public static void main(String[] args) {
    studentName(new String[]{"Gautam", "Saurav", "Pawan", "Udit", "Karan"});
  }
}
