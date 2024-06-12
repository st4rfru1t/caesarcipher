package caesar;

public class Encrypt {

  public String encrypt(String msg, int shift) {
    
    String encoded = ""; // empty string we build by iterating
    msg = msg.toUpperCase();
    for (int i = 0; i < msg.length(); i++) {
      // get single char at index i, then turn it into ASCII value
      char tempChar = msg.charAt(i);
      int ascii = (int) tempChar;
      // increment each letter by the specified shift 65-90.
      if (ascii + shift > 90) { // 89
        int overflow = (ascii + shift) - 90; // 89 + 2 = 91 - 90 = 1
        ascii = (char) overflow;
      } else {
        ascii += shift;
      }
      ascii = (char) ascii;
      // append to end string
      encoded += tempChar;
  
    }
    return encoded;
  }

}
