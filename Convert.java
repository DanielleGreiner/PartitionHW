
public class Convert {
	
	public static void convert_to_INT(String[] numberStrings,int[] numbers){
		 
		for (int i = 0; i < numberStrings.length; i++) {
		      numbers[i] = Integer.parseInt(numberStrings[i]);
		    }
		System.out.println("Process " + numberStrings.length + "");
	}
}
