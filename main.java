import java.util.Random;
import java.util.Scanner;

class Main{
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();  

    boolean running = true;
    
    while(running){
      System.out.println("Please type 1 to flip the coin, and -1 to exit");
      int choice = scan.nextInt();   
      if(choice == 5)
        break;
      while(choice != 5){
        String out = "";
        int answ = rand.nextInt(2);
        if(answ == 0)
          out = "Heads";
        else if(answ == 1){
          out = "Tails";
        }
        System.out.println(out);
        break;
      } 
    }
  }
}
