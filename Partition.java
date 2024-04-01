	import java.util.Scanner;

	/**
	 * Apply security principles to this small program
	 */
	
public class Partition {

		public static void main(String[] args) {
			
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("Enter a list of numbers (separated by spaces): ");
		    String input = scanner.nextLine();
		    String[] numberStrings = input.split(" ");
			int[] numbers = new int[numberStrings.length];
		
			Convert.convert_to_INT(numberStrings, numbers);

		    int sum = 0;
		    Math.sum(sum, numbers);
		    
		    int product = 1;
		    Math.product(numbers, product);

		    double average = sum / (double) numbers.length;
		    System.out.println("Average: " + average);

		    int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;
		    Math.minmax(min, max, numbers);
			
		    System.out.println("Before: ");
		    Sequence.current_seq(numbers);
		   
		    Sequence.ascending_seq(numbers);
		    
		    System.out.println("After: ");
		    Sequence.current_seq(numbers);
		    
		    System.out.println("Before: ");
		    Sequence.current_seq(numbers);
		    
		    Sequence.descending_seq(numbers);
		    System.out.println("After: ");
		    
		    Sequence.current_seq(numbers);
		}
	}

