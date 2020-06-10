package Chapter5;

public class TriangleShape {

	public static void main(String[] args) {
	int space = 5;
	int star = 1;
	for(int j = 0; j < 5; j++) {
		for(int k = 0; k < space; k++) {
			System.out.print("");
		}
		for(int h = 0; h < star; h++ ) {
			System.out.print("*");
		}
		space -= 1;
		star += 2;
		System.out.println();
	}
		// TODO Auto-generated method stub
}
}

   
