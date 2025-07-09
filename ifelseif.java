package basicprogram;
import java.util.Scanner;
public class ifelseif {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter gender (Male/Female): ");
	        String gender = scanner.nextLine().trim();
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        double interestRate = 0.0;
	        if (gender.equalsIgnoreCase("Female")) {
	            if (age >= 1 && age <= 58) {
	                interestRate = 8.2;
	            } else if (age >= 59 && age <= 100) {
	                interestRate = 9.2;
	            }
	        } else if (gender.equalsIgnoreCase("Male")) {
	            if (age >= 1 && age <= 58) {
	                interestRate = 8.4;
	            } else if (age >= 59 && age <= 100) {
	                interestRate = 10.5;
	            }
	        }
	        if (interestRate > 0) {
	            System.out.println("The percentage of interest is: " + interestRate + "%");
	        } else {
	            System.out.println("Invalid input. Please enter correct gender and age.");
	        }

	        scanner.close();
	    }
}
