package handsonsexample;

public class Palindrome {
	public static void main(String[] args) {
		String str = "ram";

		Boolean bool = checkPalindromemthod1(str);
		System.out.println(bool);

		Boolean booll = checkPalindrome(str);
		System.out.println(booll);

		Boolean boolll = isPalindrome(str);
		System.out.println(boolll);

		printPalindrome(str);
		String st = reverseStrign(str);
		System.out.println("Reverse String is: " + st);

		printPalindrome(str);

		String strr = checkisPalindrome(str);
		System.out.println("Reverse String is new : " + strr);

	}

	private static Boolean checkPalindromemthod1(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return str.equals(sb.toString());
	}

	private static Boolean checkPalindrome(String str) {
		if (str.length() == 0 || str.length() == 1)
			return true;
		if (str.charAt(0) != str.charAt(str.length() - 1))
			return false;
		return checkPalindrome(str.substring(1, str.length() - 1));
	}

	public static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;

		return true;
	}

	public static void printPalindrome(String str) {
		String reverseStr = "";

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}

	public static String reverseStrign(String str) {
		int strlen = str.length();
		String reverseStr = "";

		for (int i = (strlen - 1); i >= 0; --i) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

	public static String checkisPalindrome(String str) {
		String reverseString = "";
		int StringLength = str.length();
		for (int i = (StringLength - 1); i >= 0; i--) {
			reverseString += str.charAt(i);
		}

		if (reverseString.toLowerCase().equals(str.toLowerCase())) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Not Palindrome");

		}
		return reverseString;

	}

}
