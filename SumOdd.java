package Chapter5;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		
		for (count = 1; count <= 99; ++count) {
			if (count % 2 == 0)
				continue;
			
			else
				sum = sum + count;
				System.out.println(count);	
			
		}
		//System.out.printf("The sum of odd numbers%n between 1 and 199 is: %d", sum); 
		
		}

}
