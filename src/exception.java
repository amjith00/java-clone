public class exception {
  public static void main(String[] args){
  int[] marks = {20,20,330};
  try{
    System.out.println(marks[5]);
  }
  catch(Exception exception){
    System.out.println("exception caught index 5 is out of the box");
  }
  }
  
}
