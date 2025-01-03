// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Recieving a integer and return the distribution between output numbers
		// numbers <= 0.5 and > 0.5. 
		int numberOfIterations = Integer.parseInt(args[0]);
		int i = 0;
		int lessThen = 0;
		int moreThen = 0; 
		while (i < numberOfIterations) {
			if (Math.random() > 0.5) {
				moreThen = moreThen + 1;
			}
			else {
				lessThen = lessThen + 1;
			}
			i ++;
		}
		System.out.println("> 0.5:  " + moreThen + " times");
		System.out.println("<= 0.5: " + lessThen + " times");
		if (lessThen != 0 && moreThen != 0) {
			double ratio = (double) moreThen / lessThen;
			System.out.println("ratio:  " + ratio);
		}
	}
}
