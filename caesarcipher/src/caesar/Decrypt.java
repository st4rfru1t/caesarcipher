package caesar;

public class Decrypt {
  
  public Decrypt() {
    
  }

  public static void Decrypt(String msg) {
    for (int i = 0; i < 24; i++) { // try 24 times until correct combo chosen
      System.out.println(Encrypt.encrypt(msg, i));
    }
  }
  
}
