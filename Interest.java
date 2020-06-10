/**
 * 
 */
package Chapter5;


public class Interest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 1000.0;
		double interestRate = 0.05;
		double total = 0;
		
		System.out.printf("%s%10s%10s%n", "year", "amount", "total");
		
		for(int year = 1; year <= 10; ++year ) {
			double amount = principal * Math.pow(1.0 + 0.05, year);
			total = total + amount;
			System.out.printf("%d      %.2f     %.2f%n ", year, amount, total);
		}
		
		
		
		
	}

}
