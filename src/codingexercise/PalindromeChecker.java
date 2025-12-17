package codingexercise;

public class PalindromeChecker {

	public static void main(String[] args) {
		String test1 = "madam";
		String test2 = "hello";
		int number1 = 121;
		int number2 = 1234;
		// System.out.println(test1 + " is a palindrome " +
		// isStringPalindromewoPointers(test1));
		// System.out.println(test2 + " is a palindrome " +
		// isStringPalindromewoPointers(test2));
		System.out.println(number1 + " is a palindrome " + isNumberPalindrome1(number1));
		System.out.println(number2 + " is a palindrome " + isNumberPalindrome1(number2));

	}

	// by reversing string using String builder
	private static boolean isStringPalindrome(String str) {
		String original = str.toLowerCase();
		String reverse = new StringBuilder(original).reverse().toString();
		return original.equals(reverse);
	}

	// checking using two pointer check
	public static boolean isStringPalindromewoPointers(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			// if characters at the current pointers don't match, it's not a palindrome
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			// move pointers inward
			left++;
			right--;
		}
		return true;
	}

	public static boolean isNumberPalindrome(int num) {
		int originalNum = num;
		int reversedNum = 0;
		int remainder;

		while (num > 0) {
			// get the last digit
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder; // build the reversed number
			num /= 10;// remove the last digit
		}

		return originalNum == reversedNum; // compare with the original
	}
	
	//checking by converting int into string
	public static boolean isNumberPalindrome1(int num) {
		String number=Integer.toString(Math.abs(num));
		
		int left=0;
		int right=number.length()-1;
		
		/*
		while(left<right) {
			
			if(number.charAt(left)!=number.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}*/
		
		int len=number.length();
		
		for(int i=0;i<len/2;i++) {
			if(number.charAt(i)!=number.charAt(len-1)) {
				return false;
			}
		}	
		
		return true;
	}

}
