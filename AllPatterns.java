package Chapter5;
import java.util.Scanner;
public class AllPatterns {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1st pattern
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd pattern
		for(int i = 10; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//3rd pattern
			int size = 10;
			int round = 1;
		for(int i = 1; i <= size; i++) {
				if(i == round) {	
			for(int j = 0; j < size - i
					; j++) {
						System.out.print("*");
					}
				
				} ++round;
					
		System.out.println();
				}
		//4th pattern
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j < i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				}
			System.out.println();
	}
		//5th pattern
		System.out.println("Enter number of diamond rows");
		int odd = 1;
		int numOfRows = input.nextInt();
		int midWay = numOfRows / 2 ;
		int numOfSpaces = numOfRows / 2 ;;
		
		for(int i = 1; i < numOfRows; i++ ) {
			for(int j = 1; j <= numOfSpaces; j++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j <= odd; j++ ) {
				System.out.print("*");
			}
		System.out.println();
		    if(i < midWay) {
		    	odd += 2;
		    	--numOfSpaces;
		    }
		    	else  	{
		    		odd -= 2;
		    		++numOfSpaces;
		    	}
		    
		    }
			
		}
		
	}
