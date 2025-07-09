package basicprogram;
import java.util.Scanner;
public class acceptgender {
	public static void main(String ags[]) {
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter thr gender:");
		String a=scr.nextLine().toLowerCase();
		System.out.println("Enter the age:");
		int b=scr.nextInt();
		if(a.equals("female") && (b >= 1 && b <= 58)) {
			System.out.println("percentage of interest is 8.2%. ");
		}
		else if(a.equals("female") && (b >= 59 && b <= 100)) {
			System.out.println("percentage of interest is 9.2%. ");		
		}
		else if(a.equals("male") && (b >= 1 && b <= 58)) {
			System.out.println("percentage of interest is 8.4%. ");
		}
		else if(a.equals("male") && (b >= 59 && b <= 100)) {
			System.out.println("the percentage of interest is 10.5%.");
		}
		}
	}
//Write a program to accept gender ("Male" or "Female") and age and print the percentage of interest based on the given conditions. 
