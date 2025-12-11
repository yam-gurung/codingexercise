package codingexercise;

public class ReverseString {

	public static void main(String[] args) {

		//String finalword = reverseString("cat");
		String finalword = reverseString2("cat");
		System.out.println(finalword);

	}

	private static String reverseString(String str) {

		int first = 0;
		int last = str.length() - 1;

		StringBuilder word = new StringBuilder(str);

		while (first < last) {
			System.out.println("inside");
			char temp = str.charAt(first);
			word.setCharAt(first, str.charAt(last));
			word.setCharAt(last, temp);

			first++;
			last--;
			
		}

		return word.toString();

	}
	
	private static String reverseString2(String str) {
		StringBuilder res=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			res.append(str.charAt(i));
		}
		
		return res.toString();
	}

}
