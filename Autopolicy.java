package Chapter5;

public class Autopolicy {
	private int accountNumber;
	private String makeAndModel;
	private String state;
       //constructor
	public Autopolicy(int accountNumber, String makeAndModel, String name) {
			this.accountNumber = accountNumber;
			this.makeAndModel = makeAndModel;
			//this.state = state;
	}
			//set method
			public void setAccountNumber (int accountNumber) {
				this.accountNumber = accountNumber;
		}
			public void setMakeAndModel (String makeAndModel) {
				this.makeAndModel = makeAndModel;
		}
			public void setstate (String state) {
				this.state = state;
		// TODO Auto-generated constructor stub
	}
           //get method
			public int getAccountNumber () {
				return accountNumber;
		}
			public String getMakeAndModel () {
				return makeAndModel;
		}
			public String getState() {
				return state;
		// TODO Auto-generated constructor stub
	}
			public boolean noFaultState () {
				boolean noFaultState;
			
				switch (getState()) {
				case "MA" :  case "NJ" : case "NY" : case "PS" :
				 noFaultState = true;
				       break;
				       default:
				 noFaultState = false;
				       break;
				       
				}
				 return noFaultState;
				
		// TODO Auto-generated constructor stub
	}
	/**public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
	

		