class caluculations{
  public int add(int a, int b){
    return a+b;
  }
  public int add(int a,int b,int c){
    return a+b+c;
  }
  public double mul(double a,double b){
    return a*b;
  }
}
public class methodoverloading {
  public static void main(String[] args){
  caleculations cal = new caleculations();

  System.out.println(cal.add(5,6));
  System.out.println(cal.add(4,5,6));
  System.out.println(cal.mul(4,5));
  
}}
