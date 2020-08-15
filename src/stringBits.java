public class stringBits {
  public String stringBits(String str) {
    String outcome = "";
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        outcome = outcome + str.charAt(i);
      }
    }
    return outcome;
  }
}
