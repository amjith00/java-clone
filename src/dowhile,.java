import java.util.Scanner;

public class dowhile {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = 0;
    do{
      System.out.println("enter your number");
      number = sc.nextInt();
      Sysetem.out.println("here is your number");
      System.out.println(number);
    }while(number>=100);
    System.out.println("the end");
  }
  
}
