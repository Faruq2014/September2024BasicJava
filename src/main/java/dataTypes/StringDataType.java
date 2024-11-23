package dataTypes;

public class StringDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // there is no rage for String data type
		//every thing should be in between "  "
		// inside the quote you may write any matching data
		String firstName="Faruq";
		String lastName="Mola";
		String hobby="I like to play Soccer @ 7pm on Saturday, my phone # 703" ;
		
		String fullName=firstName+lastName;// addition
		// for string data type only addition is allow
		System.out.println(fullName);
		// to present better concatenation is allow
		String conCatFullName=firstName +" "+lastName;// concatenation
		System.out.println(conCatFullName);
		System.out.println("my full name is "+conCatFullName);
		
		
		
	}

}
