package caesar;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter string: ");
    String msg = s.next();
    
    System.out.println("1. Encrypt");
    System.out.println("2. Decrypt");
    String choice = s.next();
    
    switch(choice) {
      default:
        break;
      case "1":
        System.out.print("Choose shift: ");
        int shift = s.nextInt();
        System.out.print(Encrypt.encrypt(msg, shift));
        break;
      case "2":
        Decrypt.decrypt(msg);
        break;
    }
  }

}
