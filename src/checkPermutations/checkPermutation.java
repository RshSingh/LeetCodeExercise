package checkPermutations;

public class checkPermutation {

  public static void main(String[] args) {

    System.out.println(checkPermutation("abc", "cba"));
    System.out.println(permutation("abc", "cba"));
  }

  public static boolean checkPermutation(String s, String l) {
    if(s.length() != l.length()) return false;

    int[] chars = new int[128];

    for(int i = 0; i < s.length(); i ++) {
      int val = s.charAt(i);
      chars[val]++;
    }

    for (int i = 0; i < l.length(); i++) {
      chars[l.charAt(i)]--;
      if(chars[l. charAt(i)] < 0) {
        return false;
      }
    }
    return true;
  }


  public static String sortString(String str) {
    char[] chars = str.toCharArray();
    java.util.Arrays.sort(chars);
    return new String(chars);
  }

  public static boolean permutation(String s, String l) {
    if(s.length() != l.length()) return false;

    return sortString(s).equals(sortString(l));
  }
}
