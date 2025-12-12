package codingexercise;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzbuzz();
	}

//iterates through the range of numbers and prints Fizz for multiple of 3, Buzz for multiple 
	// of 5 and FizzBuzz for multiple of 3 and 5 and the number itself otherwise
	private static void fizzbuzz() {
		int n = 1000;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
