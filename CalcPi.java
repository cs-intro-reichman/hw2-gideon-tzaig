// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) { 
	    // Recieving the number of iterations
		int numberOfIterations = Integer.parseInt(args[0]);
		double glAlgo = (double) 1;
		double glDiviosor = (double) 1;
		int i = 1;
		while (i < numberOfIterations) {
			if (glDiviosor < 0) {
				glDiviosor = (-1) * (glDiviosor - 2);
			}
			else {
				glDiviosor = (-1) * (glDiviosor + 2);
			}
			glAlgo = glAlgo + (1 / glDiviosor);
			i ++;
		}
		
		// Final calculation
		double funcPi = glAlgo * 4;
		double javaPi = Math.PI;
		System.out.print("pi according to Java: " + javaPi);
		System.out.printf("%npi, approximated:     " + funcPi);
	}
}
