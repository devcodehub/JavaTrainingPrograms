class SameNoArgDifDataType{

  void show(int b){
    System.out.println(b);

  }
  void show(short c){
    System.out.println(c);
  }
  void show(long d){
    System.out.println(d);
  }
  void show(float e){
    System.out.println(e);
  }
  void show(double f){
    System.out.println(f);
  }
  void show(byte a){
    System.out.println(a);
  }
  public static void main(String[] args) {
    SameNoArgDifDataType sn=new SameNoArgDifDataType();
    sn.show(2);
    sn.show(500);
    sn.show(33);
    sn.show(6565600);
    sn.show(4654.225f);
    sn.show(46465.454646);

  }
}
