package checkStringHasUniqueCharacters;

public class StringUniqueCharacters {

  public static void main(String[] args) {
    System.out.println(check("aasdfg"));
    System.out.println(check("asdfg"));
  }

  public static boolean check(String str) {
    if(str.length() > 128) return false;

    boolean[] bool_chars = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int chars = str.charAt(i);
      if(bool_chars[chars]) {
        return false;
      }
      bool_chars[chars] = true;
    }
    return true;
  }
}
