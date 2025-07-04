class animal{
  abstract void sound(){
    void sleep(){
      System.out.prinln("sleeping.....");
    }
    class dog extends animal{
      void sound(){
        System.oout.println("dog barks...");
      }
    }
  }
}
public class abstraction {
  public static void main(String[] args){
    animal a = new dog();
    a.makesound();
    a.dog();
  }
}
 