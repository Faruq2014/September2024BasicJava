package variables;

public class FamilyTree {
/*
 * develop a family tree with
 *   fist name== every one has different first name
 *                 it is first name== variable name do not change
 *                 but value change all the time 
 *   last name == every one has same last name
 *     it is last name== variable name do not change
 *                 but value do not change very often
 *   their properties== local properties
 *       Variable name is different and values as well
 */
	private String firstName;
	public static String lastName="Molla";
	
	public static void main(String[] args) {
		FamilyTree ft= new FamilyTree();
		ft.fabiha();
		ft.faiza();

	}
	
	public void fabiha() {
		firstName="Fabiha";
		double bankBalance=5000.00;
		System.out.println(firstName+"  "+lastName+"  "+bankBalance);
		
	}
	
   public void faiza() {
	   firstName="Faiza";
		int cars=2;
		System.out.println(firstName+"  "+lastName+"  "+cars);
	}

}
