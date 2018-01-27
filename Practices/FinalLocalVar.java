class FinalLocalVar
{
  public static void main(String[] args) {
    final int x=20;
              //x=x+30;     if you make any local variable as a final then it will become constant that means you can not
              //            change the value of this variable throughout the function.
              System.out.println(x);

              final FinalLocalVar f=new FinalLocalVar();
              FinalLocalVar f1=new FinalLocalVar();       // we can make another reference variable.....

  }
}
