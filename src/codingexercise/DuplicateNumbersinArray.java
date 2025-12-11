package codingexercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateNumbersinArray {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,2,5};
		findDuplicateNumbersinArray2(numbers);
	}

	private static void findDuplicateNumbersinArray2(int[] numbers) {
		
		System.out.println("findDuplicateNumbersinArray2");

		
		Set<Integer> hashSet=new HashSet<Integer>();
		Set<Integer> dupNo=new HashSet<Integer>();

		for(int i=0;i<numbers.length;i++) {
			if(!hashSet.add(numbers[i])) {
				dupNo.add(numbers[i]);
			}
		}
		
		Iterator<Integer> nos=dupNo.iterator();
		while(nos.hasNext()) {
			System.out.println(nos.next());
		}
		
	}

	private static void findDuplicateNumbersinArray(int[] numbers) {
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println(numbers[i]);
				}
			}
		}
		
		
	}


}
