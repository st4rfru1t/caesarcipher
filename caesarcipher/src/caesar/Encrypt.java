package caesar;

public class Encrypt {

  public Encrypt() {

  }

  public static String encrypt(String msg, int shift) {

    String encoded = ""; // empty string we build by iterating
    msg = msg.toUpperCase();
    for (int i = 0; i < msg.length(); i++) {

      // get single char at index i, then turn it into ASCII value
      char tempChar = msg.charAt(i);
      int ascii = (int) tempChar;

      if (tempChar == ' ') {
        // skip all
        
      } else if (ascii + shift > 90) { // 89
        int overflow = (ascii + shift) - 90; // 89 + 2 = 91 - 90 = 1
        ascii = 65 + overflow;

      } else {
        ascii += shift;
      }

      tempChar = (char) ascii;
      
      // append to end string
      encoded += tempChar;

    }
    return encoded;
  }

}
