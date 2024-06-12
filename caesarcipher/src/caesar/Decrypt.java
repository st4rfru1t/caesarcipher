package caesar;

public class Decrypt {
  
  public Decrypt() {
    
  }

  public static void decrypt(String msg) {
    for (int i = 1; i < 24; i++) { // try 24 times until correct combo chosen
      System.out.println(Encrypt.encrypt(msg, i));
    }
  }
}