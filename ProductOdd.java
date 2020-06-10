package Chapter5;

public class ProductOdd {

	public static void main(String[] args) {
	double product = 1;
		for(int count = 0; count <= 15; count++) {
			if(count % 2 == 0) {
				continue;
			}
			else
					product = product * count;
				System.out.println(count );
			}
		
	System.out.printf("%nproduct of odd num between 1 to 15: %.1f ", product );
		// TODO Auto-generated method stub
		}
	}


