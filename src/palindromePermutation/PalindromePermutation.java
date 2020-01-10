package palindromePermutation;

public class PalindromePermutation {

  public static void main(String[] args) {

    System.out.println(palindromePermutation("TactCoa"));
  }

  public static boolean palindromePermutation(String s) {
    int[] charFrequency = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
    int oddcount = 0;
    for(int i = 0; i < s.length(); i++) {
      int x = charFrequency(s.charAt(i));
      if( x != -1) {
        charFrequency[x]++;
        if(charFrequency[x] % 2 ==1) {
          oddcount ++;
        } else {
          oddcount--;
        }
      }
    }

    return oddcount <= 1;
  }

  public static int charFrequency(char c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int temp = Character.getNumericValue(c);
    if(a <= temp && temp <= z) {
      return temp - a;
    }
    return -1;
  }

}
