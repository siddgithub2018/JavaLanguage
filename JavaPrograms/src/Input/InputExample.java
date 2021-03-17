package Input;
import java.util.*;

public class InputExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Integer
		System.out.println("Enter an integer: ");
		int a = sc.nextInt();
		System.out.println("You entered " + a);
		//Float
		System.out.println("Enter an float: ");
		float b = sc.nextFloat();
		System.out.println("You entered " + b);
		//boolean
		System.out.println("Enter an boolean value: ");
		boolean c = sc.hasNext();
		System.out.println("You entered " + c);
		 sc.close();
		
		

	}

}
