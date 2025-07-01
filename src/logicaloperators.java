import java.util.Scanner;

public class logicaloperators {
   public logicaloperators() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter  your amount:");
      int var2 = var1.nextInt();
      if (var2 > 10) {
         System.out.println("you canr buy anything");
         System.out.println("get items");
      } else if (var2 > 10 && var2 < 50) {
         System.out.println("you can buy one item");
      } else {
         System.out.println("et more items");
      }

   }
}
