class animal{
  void eat(){
    System.err.println("animals can eat");
  }
}

class dog extends animal{
 void barks(){
  System.out.println("dog barks");
 }
  
}
public class inheritance {
  public static void main(String[] args){
    dog a = new dog();

    a.eat();
    a.barks();
  }
}
