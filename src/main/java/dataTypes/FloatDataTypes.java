package dataTypes;

public class FloatDataTypes {
/*
 * checking and saving account and credit card
 * and then transfer money and then monthly balance
 */
	//   float =32 bits
	//  double=64 bits
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double checkingAC=1000000.99;
      float savingAc=10000.66f;
    //from mix and match data type always chose the bigger data type
      double totalMoney=checkingAC+savingAc;
     double creditCardSepend=7000.999999;
     float transfer=5000.66f;
     double totalSpend=creditCardSepend+transfer;
    double monthlyBalance=totalMoney-totalSpend;
    System.out.println(monthlyBalance);
	}

}
