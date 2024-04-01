public class Math {

	public static void sum(int sum, int[] numbers) {
		 for (int num : numbers) {
		      sum += num;
		      System.out.println("Sum: " + sum);
		    }
	}
	public static void product(int[] numbers,int product ) {
		for (int num : numbers) {
	    	product *= num;
	    }
	    System.out.println("Product: " + product);
	}
	public static void minmax(int min, int max, int[] numbers) {
		 for (int num : numbers) {
		      if (num < min) {
		        min = num;
		      }
		      if (num > max) {
		        max = num;
		      }
		    }
		    System.out.println("Minimum: " + min);
		    System.out.println("Maximum: " + max);
	}
	

}
	

