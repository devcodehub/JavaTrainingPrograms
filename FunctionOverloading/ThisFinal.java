class ThisFinal{
  int x=12;
  void show(ThisFinal this, int z){
    System.out.println(this+" from show");
    System.out.println(this.x);
    System.out.println(z);
  }
  public static void main(String[] args) {
    ThisFinal tf=new ThisFinal();
    System.out.println(tf+" from main");
    tf.show(20);
  }
}
