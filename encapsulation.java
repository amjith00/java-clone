class natural{
private String name;
private int age;

public String getname(){
  return name;
}
public void setname(String n){
  this.name= n;
}
public int getage(){
  return age;
}
public void setage(int n){
  this.age = n;
}
}





public class encapsulation {
  public static void main(String[] args){
    natural w = new natural();
    w.setname("amjith");
    w.setage(24);
    System.out.println(w.getname());
    System.out.println(w.getage());


  }
  
}
