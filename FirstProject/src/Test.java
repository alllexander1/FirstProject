import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Date date = new Date();
		String today = date.toGMTString();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter something: ");
		String input = scan.next();
		System.out.println(input +" Today is " + today);		
		scan.close();
		
		

	}

}
