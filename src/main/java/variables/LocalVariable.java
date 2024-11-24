package variables;

public class LocalVariable {
    //what is syntax
	// what is logics
	// what is arguments
	// what is methods
	
	
	/*  local variable 
	 *   scope== inside method
	 *   declaration== you must declare the value
	 *   modifier= only final is allow
	 * 
	 */
	public static void main(String[] args) {
		//how to call a method from main method // method calling
		// class name, variable name= new class name ();
		 //class refferencial variable
		
		LocalVariable lv =new LocalVariable();
		lv.chckingAccount();
		lv.savingAccount();
	}
	
	public void chckingAccount() {
		final double checkingBalance=5000.00;
		System.out.println(checkingBalance);
	}
	
    public void savingAccount() {
    	float savingBalance=100.00f;
    	System.out.println(savingBalance);
	}

}
