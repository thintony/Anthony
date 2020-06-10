package Chapter5;

public class AutopolicyTest{
	public static void main(String[] arg) {
		Autopolicy policy1 = new Autopolicy(23231345, "Toyota Camry","Ma");
		Autopolicy policy2 = new Autopolicy(43542768, "Ford Motor","NJ" );	
		policynoFaultState(policy1); 								
		policynoFaultState(policy2);
		//	method	that	displays	whether	an	AutoPolicy 					
		//	is	in	a	state	with	no-fault	auto	insurance 
		
		
		
		
	}
	public static void policynoFaultState(Autopolicy policy) {
		System.out.println("The autopolicy");
		System.out.printf("Account %d car %s %n state %s", 
				policy.getAccountNumber(),policy.getMakeAndModel(), policy.getState());
	}		
}
