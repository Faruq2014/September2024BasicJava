package variables;

public class InstanceVariable {
	/*
	 * instance variable scope== inside the class but out side of the method
	 * declaration== you must initialize the variable Declaration is optional
	 * modifier= any modifier allow but final
	 * 
	 */
	String firstName;

	public static void main(String[] args) {
		InstanceVariable iv = new InstanceVariable();
		iv.fabiha();
		iv.faiza();
	}

	public void fabiha() {
		firstName = "Fabiha";
		System.out.println(firstName);
	}

	public void faiza() {
		firstName = "Faiza";
		System.out.println(firstName);
	}
}
