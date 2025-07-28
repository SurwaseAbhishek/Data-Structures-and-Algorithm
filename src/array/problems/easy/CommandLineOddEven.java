package array.problems.easy;

public class CommandLineOddEven {
	 public static void main(String[] args) {
	        // Check if a command-line argument is provided
	        if (args.length == 0) {
	            System.out.println("Please provide a number as a command line argument.");
	            return;
	        }

	        try {
	            int number = Integer.parseInt(args[0]);

	            if (number % 2 == 0) {
	                System.out.println(number + " is Even.");
	            } else {
	                System.out.println(number + " is Odd.");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format. Please enter a valid integer.");
	        }
	    }
}
