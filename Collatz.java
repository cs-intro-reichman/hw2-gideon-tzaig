// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
	    // Replace this comment with your code
		int algoNumber = Integer.parseInt(args[0]);
		String program = args[1];
		int i = 0;

		// Start Collatz conjecture, catch '0' case
		while (i < algoNumber) {
			// Counter of lines
			i ++;

			// Catching first case, i == 1
			if (i == 1 && program.contains("v")) {
				System.out.println("1 4 2 1 (4)");
			}

			// String to print at the end of single line
			String collatzResult = String.format("%d", i);

			// Opening number to manipulate 
			int calcNumber = i;
			
			// Counting conjecture iterations
			int iterationCounter = 1; 

			// Collatz calc, i > 1 
			while (calcNumber > 1) {
				iterationCounter ++;
				if (calcNumber % 2 == 1) {
					calcNumber = calcNumber * 3 + 1;
					collatzResult = String.format("%s %d", collatzResult, calcNumber);
				}
				else {
					calcNumber = calcNumber / 2;
					collatzResult = String.format("%s %d", collatzResult, calcNumber);
					// Exiting collatz calc
					if (calcNumber == 1 && program.contains("v")) {
						System.out.printf("%s (%d)%n", collatzResult, iterationCounter);
					}
				}
			}
		}

		// Print summary sentance 
		System.out.printf("%nEvery one of the first %d hailstone sequences reached 1.", algoNumber);
	}
}
