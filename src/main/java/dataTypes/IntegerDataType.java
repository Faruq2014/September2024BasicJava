package dataTypes;

public class IntegerDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		// byte=8 bits
		// Short=16 bits
		//int= 32 bits
		//long=64 bits
		
		/*we have $100 from your wife
		 * we are buying 5 apples, milk, cookies
		 * return the change back
		 */
     long moneyFromWife=100;
     int milk=5;
     short cookies=4;
     byte apple=2;
     int totalApple=apple*5;
     int totalSpent=milk+cookies+totalApple;
     //from mix and match data type always chose the bigger data type
    long changeBack= moneyFromWife -totalSpent;
    System.out.println(changeBack);
     
     
	}

}
