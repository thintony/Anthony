package Chapter5;
import java.util.Scanner;
public class SmallestNumber {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number or  enter -1 to quit");
		
		int value = input.nextInt();
		int smallest = value;
		
		while(value != -1) {
			System.out.println("Enter any number or enter -1 to quit");
			value = input.nextInt();
			
			if(value == -1) {
				System.out.println(smallest);
			}
			else {
				if (value < smallest) {
					smallest = value;
				}
				
			}
		}
		

	}

}

