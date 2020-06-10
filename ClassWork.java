package Chapter5;
//first 11 multiple of 5
public class ClassWork {

	public static void main(String[] args) {
		int k = 0;
		for(int count = 1; count <= 100; count++) {
			
			if(count % 5 != 0) {
			
				System.out.println("skip to the next iteration " +k);
				continue;
			}
			System.out.println(count);
			System.out.println("Dont skip to the next iteration " +k);
			k = k + 1;
			if(k == 11) {
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
