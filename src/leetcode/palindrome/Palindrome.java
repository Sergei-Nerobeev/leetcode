package leetcode.palindrome;

public class Palindrome {

  public static void main(String[] args) {

    var word = "anatana";
    var result = isPalindrome(word);
    System.out.println(result);
  }

  public static boolean isPalindrome(String word) {
    if (word.isEmpty() || word.length() < 1) {
      throw new IllegalArgumentException("Length of word is not correct");
    }
    int left = 0;
    int right = word.length() - 1;
    while (left < right) {
      if (word.charAt(left) != word.charAt(right)) {
        return false;
      }
      left++;
      right--;

    }
    return true;
  }
}
