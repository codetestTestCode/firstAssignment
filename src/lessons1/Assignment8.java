package lessons1;

public class Assignment8 {

	public static void main(String[] args) {
		 double deposit = 50;
	        byte monthlyDeposit = 50;
	        double interest = 5;
	        double totalAmount ;
	for(byte x=1;x<=12;x++){
	    totalAmount = deposit += deposit*interest/100;
	    deposit += monthlyDeposit;
	    System.out.println(totalAmount);
	    }

	}

}
