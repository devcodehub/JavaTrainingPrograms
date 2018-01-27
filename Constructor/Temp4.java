class Temp4
{
  Temp4()
  {
    System.out.println("default");
  }
  void Temp4()
{
  System.out.println("Hello");
}

public static void main(String[] args) {
    new Temp4().Temp4();
    // Here after new operator jvm checks non-return type function(that is constructor)
    // then after .(dot operator) jvm checks return type function
}
}
