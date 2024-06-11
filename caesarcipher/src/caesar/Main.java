package caesar;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("1. Encrypt");
    System.out.println("2. Decrypt");
    String choice = s.next();
    
    System.out.print("Enter string: ");
    String msg = s.next();
    
    switch(choice) {
      default:
        break;
      case "1":
        // encrypt(msg)
        break;
      case "2":
        // decrypt(msg)
        break;
    }
  }

}
