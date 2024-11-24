package variables;

public class StaticVariable {
	/*
	 * static variable 
	 * scope== inside the class but out side of the method
	 * declaration==
	 *  must have static key word in front of it. 
	 * you must initialize the variable Declaration is optional
	 * modifier= any modifier allow 
	 * 
	 */
	static String lastName="Molla";
	
	public static void main(String[] args) {
		
		StaticVariable sv= new StaticVariable();
		sv.fabiha();
		sv.faiza();
	}
	
	public void fabiha() {
		System.out.println(lastName);
	}
	
   public void faiza() {
	   System.out.println(lastName);
	}

}
