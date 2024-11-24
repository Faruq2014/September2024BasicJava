package methods;

public class ReturnAndVoidMethod {
	/*
	 * we have 10000
	 * we are buing pc, game
	 */
   
	static double money=10000.00;
	
	public static void main(String[] args) {
		 double moneyReturn =money-expenditureAc();
		 System.out.println(moneyReturn);
	//double moneyReturnFromSpending= money-spendingAc();
		 spendingAc();
	}
	
	public static void spendingAc() {
		double pc=1200.00;
		double game=800.00;
		double totalSpend=pc+game;
		double moneyReturnFromSpending= money-totalSpend;
		System.out.println(moneyReturnFromSpending);

	}
	
   public static double expenditureAc() {
	   double pc=1200.00;
		double game=800.00;
		double totalSpend=pc+game;
		return totalSpend;	
	}

}
