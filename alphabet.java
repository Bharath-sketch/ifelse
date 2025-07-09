package basicprogram;
import java.util.Scanner;
public class alphabet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch1 =sc.next().charAt(0);
		if(Character.isUpperCase(ch1)){
			System.out.println(Character.toLowerCase(ch1));
		}
		else if(Character.isLowerCase(ch1)){
			System.out.println(Character.toUpperCase(ch1));
		}
		else {
			System.out.println("Invalid");
		}
}
}
