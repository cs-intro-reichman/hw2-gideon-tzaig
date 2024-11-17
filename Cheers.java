// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Converting a string from lowercase letters to uppercase
            String upperWord = args[0].toUpperCase();
            int shouting = Integer.parseInt(args[1]);
            
            // Printing sparate letters
            String letterBank = "AEFHILMNORSX";
            int i = 0; 
            while (i < upperWord.length()) {
                char charTarget = upperWord.charAt(i);
                if (letterBank.indexOf(charTarget) != -1) {
                        System.out.println("Give me an " + charTarget + ": " + charTarget + "!");
                }
                else {
                        
                        System.out.println("Give me a  " + charTarget + ": " + charTarget + "!");
                }
                i ++;
            }

            // Print spelling
            int j = 0;
            if (shouting != 0) {
                System.out.println("What does that spell?");
                while (j < shouting) {
                        System.out.println(upperWord + "!!!");
                        j ++;
                }
            }
        }
}
