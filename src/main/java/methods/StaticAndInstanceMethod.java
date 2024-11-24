package methods;

public class StaticAndInstanceMethod {
	/*
	 * based on specifier two types of method
	 *    static
	 *    instance
	static method has static in front of it 
	 instance method do not have static
	 Accessibility rules
	    static method calling static method
	       direct calling
	      
   instance method calling instance method
	   direct calling 
	   
   instance method calling static method
	direct calling
	
 static method calling instance method
	      class refferencial variable
	
  */
	public static void main(String[] args) {
		faiza();
		StaticAndInstanceMethod saim= new StaticAndInstanceMethod();
		saim.fabiha();
	}
	
	public void fabiha() {
		System.out.println("I am fabiha method");
		fabihaBankAc();
	}
   public void fabihaBankAc() {
		System.out.println("I am fabiha's bank ac method");
	}
   
   public  void faizaSchoolAc() {
		System.out.println("I am faiza method");
		faiza();
	}
	
	public static void faiza() {
		System.out.println("I am faiza method");
	}

}
