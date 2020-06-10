package Chapter5;

public class ContinueTest {

	public static void main(String[] args) {
		int count;
		for(count = 1; count <= 20; count++) {
			if(count == 16) {
				continue;
			}
			System.out.printf(" %d ",  count);
		}
		System.out.printf("%n continue with loop at count %d",  count);
		// TODO Auto-generated method stub

	}

}
