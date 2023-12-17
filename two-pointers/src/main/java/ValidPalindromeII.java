public class ValidPalindromeII {

	/*
    Write a function that takes a string as input and checks whether it can be a valid palindrome by removing at most
    one character from it.
     */
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
			} else {
				i++;
				j--;
			}
		}
		return false;
	}

	private static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		isPalindrome("abcdedadedecba");
	}
}
