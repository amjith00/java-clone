class animal{
  public void sound(){
    System.out.println("animal sounds");
  }
  class dog extends animal{
  @Override
  public void sound(){
    System.out.println("dog barks");
  }
}}




public class override {
  public static void main(String[] args){
   animal n  = new dog();

   n.sound();
  }
  
}
