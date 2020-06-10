package Chapter5;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		for(count = 1; count <= 20; count++) {
			if(count == 16) {
				break;
				
			}
			System.out.printf(" %d ",  count);
		}
		System.out.printf("%n broke out of loop at count %d",  count);
	}

}
