package Chapter5;
//23% tax estimate
import java.util.Scanner;
public class TaxFair {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double estimated = 0;
		//System.out.printf("Enter principal");
		System.out.println();
		System.out.printf("%20s%10s%10s%15s%n", "expenses", "year", "fairtax", "estimated");
		
		for(int year = 1; year <= 1; year++  ) {
			System.out.println("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%24d      %.2f     %.2f%n ", year, fairtax, estimated);
			}
		for(int year = 1; year <= 1;  year++) {
			System.out.println("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%24d      %.2f     %.2f%n ", year, fairtax, estimated);
		} 
		for(int year = 1; year <= 1;  year++) {
			System.out.print("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%13d      %.2f     %.2f%n ", year, fairtax,estimated);
			}
		for(int year = 1; year <= 1;  year++) {
			System.out.print("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%13d      %.2f     %.2f%n ", year, fairtax, estimated);
			}
		for(int year = 1; year <= 1;  year++) {
			System.out.print("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%13d      %.2f     %.2f%n ", year, fairtax, estimated);
			}
		for(int year = 1; year <= 1;  year++) {
			System.out.print("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%13d      %.2f     %.2f%n ", year, fairtax, estimated);
		} 
		for(int year = 1; year <= 1;  year++) {
			System.out.print("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%13d      %.2f     %.2f%n ", year, fairtax,estimated);
			
			}
		for(int year = 1; year <= 1;  year++) {
			System.out.print("amount ");
			int principal = input.nextInt();
			double fairtax = principal * Math.pow( 0.23, year);
			estimated = estimated + fairtax;
			System.out.printf("%18d      %.2f     %.2f%n ", year, fairtax, estimated);
	}
	
	}

}