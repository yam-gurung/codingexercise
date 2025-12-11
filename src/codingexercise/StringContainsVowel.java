package codingexercise;

public class StringContainsVowel {

	public static void main(String[] args) {
		String word="bbbea";
		System.out.println(word + ": "+stringContainsVowel(word));
	}

	private static boolean stringContainsVowel(String str) {
		if(str.toLowerCase().matches(".*[aeiou].*")) {
			return true;
		}
		
		return false;
		
	}

}
