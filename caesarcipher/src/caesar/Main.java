package caesar;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter string: ");
    String msg = s.nextLine();
    
    System.out.println("1. Encrypt");
    System.out.println("2. Decrypt");
    String choice = s.next();
    
    switch(choice) {
      default:
        break;
      case "1":
        System.out.print("Enter shift: ");
        int shift = s.nextInt();
        
        System.out.print(Encrypt.encrypt(msg, shift));
        break;
        
      case "2":
        System.out.print("Specify the shift used to encrypt (1) or try all combinations (2)");
        int choice2 = s.nextInt();
        
        if (choice2 == 1) {
          System.out.print("Enter shift: ");
          int shift2 = s.nextInt();
          
          System.out.print(Encrypt.encrypt(msg, 25-shift2));
        } else {
          Decrypt.decrypt(msg);
        }
        break;
    }
  }

}
