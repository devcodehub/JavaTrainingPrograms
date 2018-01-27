class ThisC{
void show(){
  System.out.println(this+" from show");
}
public static void main(String[] args) {
  ThisC tc=new ThisC();
  tc.show();
  System.out.println(tc+" from show");
}
}
