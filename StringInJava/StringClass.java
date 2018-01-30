//.length  : property of an array
//.length() : method of String class (shows number of character)


class StringClass
{
  public static void main(String[] args) {
    String s = new String("Hello");
    System.out.println(s.length());

    String s1="Hello";  // This is anonymous class -- Without Constructor
    System.out.println(s1.length());

    int z = "Hello".length();    // Anything inside Double quote is the object of String class
    System.out.println(z);
  }
}
