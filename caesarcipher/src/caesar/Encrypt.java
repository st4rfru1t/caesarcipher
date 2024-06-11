package caesar;

public class Encrypt {

  public String encrypt(String msg, int shift) {
    
    String encoded = ""; // empty string we build by iterating
    for (int i = 0; i < msg.length(); i++) {

      // get single char at index i, then turn it into ASCII value
      char tempChar = msg.charAt(i);
      int ascii = (int) tempChar;
      // increment each letter by the specified shift
      ascii += shift;
      tempChar = (char) ascii;
      // append to end string
      encoded += tempChar;
  
    }
    return encoded;
  }

}
