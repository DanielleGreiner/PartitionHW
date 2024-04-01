
public class Sequence {
	
	public static void current_seq(int[]numbers) {
		 for (int num : numbers) {
		    	System.out.println("[" + num + "]");
		    }
	
	}
	public static void ascending_seq(int[] numbers) {
		 for (int i = 1; i < numbers.length; i++) {
				int current = numbers[i];
				int j = i - 1;

				while (j >= 0 && numbers[j] > current) {
					numbers[j + 1] = numbers[j];
					j--;
				}
				
				//insert into position
				numbers[j + 1] = current;
			}
	}
public static void descending_seq(int[]numbers) {
	 for (int i = 1; i < numbers.length; i++) {
			int current = numbers[i];
			int j = i - 1;

			while (j >= 0 && numbers[j] < current) {
				numbers[j + 1] = numbers[j];
				j--;
			}
			
			//insert into position
			numbers[j + 1] = current;
		}

}
	
}
