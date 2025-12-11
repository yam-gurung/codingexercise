package codingexercise;

public class CountWordsInSentence {

	public static void main(String[] args) {
		String sentence="this is a very good opportunity to work hard and goog  luck";
		int totalWords=countWordsInSentence(sentence);
		System.out.println("total words is "+totalWords);
	}

	private static int countWordsInSentence(String sentence) {
		return sentence.split("\\s+").length;
	}

}
