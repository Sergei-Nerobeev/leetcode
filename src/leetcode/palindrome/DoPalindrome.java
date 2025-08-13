package leetcode.palindrome;

public class DoPalindrome {

  public static void main(String[] args) {

    var actual = "natanaa";
    var expected = "anatana";
    System.out.println(doPalindrome(expected,actual));
  }

  public static String doPalindrome(String palindrome, String noPalindrome) {
    if (palindrome.isEmpty() || palindrome == noPalindrome) {
      throw new IllegalArgumentException("Word or words are not correct");
    }
    return null;
  }

}
