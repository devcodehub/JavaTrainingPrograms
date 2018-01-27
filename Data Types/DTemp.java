class DTemp
{
    public static void main(String[] args) {
      byte a=10;
      byte b=20;
    //  byte c=a+b;//incompatible types: possible lossy conversion from int to byte
      byte c = (byte)(a+b);
      System.out.println(c);
    }
}
