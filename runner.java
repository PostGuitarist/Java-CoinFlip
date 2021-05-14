import java.util.Random;
import java.util.Scanner;

public class runner{
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();  
      
    System.out.println("Please type 1 to flip the coin, and -1 to exit");
    int choice = scan.nextInt();             
    while(choice != -1){
      String out = "";
      int answ = rand.nextInt(1);
      if(answ == 0)
        out = "Heads";
      else
        out = "Tails";
      System.out.println(out);
    }
  }
}
