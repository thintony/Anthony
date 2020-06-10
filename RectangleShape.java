package Chapter5;

public class RectangleShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 5;
		int star = 1;
		for(int i = 0; i < 5; i++) {
			for(int p = 0; p < space; p++) {
				System.out.print(" ");
			}
			for(int d = 1; d < star; d++){
				System.out.print("*");
			}
			space = 1;
			star = +12;
			System.out.println();
		}
	}

}
