class ThisD
{
  int x=10;
/*  void show()
  {
    System.out.println("From show function "+this);
  }*/

  void show(ThisD this, int x)
  {
    System.out.println(this.x);
    System.out.println(x);
  }
  public static void main(String[] args) {
    ThisD t=new ThisD();
  //  System.out.println("from t reference variable "+t);
    t.show(20);
  }
}

// here 'this' as argument pass actual to formal by compiler
