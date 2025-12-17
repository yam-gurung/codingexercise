package codingexercise;

public class ReverseStringManager {

	public static void main(String[] args) {
		String word="apple";
		String reversedWord = reverseString(word);
		System.out.println("reversed word for "+word+" is "+reversedWord);
	}
	
	//reverse string using reverse function of StringBuilder class
	/*
	private static String reverseString(String str) {
		String reversedStr = null;
		StringBuilder builder=new StringBuilder(str);
		reversedStr=builder.reverse().toString();
		return reversedStr;
	}*/
	
	//reverse String using another way using StringBuilder class
	/*private static String reverseString(String str) {
		System.out.println("reverse using String Builder and its append function");
		String reversedStr = null;
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--){
			builder.append(str.charAt(i));
		}
		
		reversedStr = builder.toString();
		
		return reversedStr;
	}*/
	
	// reverse string by swapping the characters from both end and using StringBuilder
	private static String reverseString(String str) {
		String reversedStr = null;
		
		int first = 0;
		int last = str.length()-1;
		StringBuilder builder = new StringBuilder(str);
		while(first < last) {
			char temp;
			temp = str.charAt(last);
			builder.setCharAt(last, str.charAt(first));
			builder.setCharAt(first, temp);
			first ++;
			last --;
		}
		
		reversedStr = builder.toString();
		
		return reversedStr;
	}
	
	
	

}
