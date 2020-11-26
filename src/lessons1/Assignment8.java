package lessons1;

public class Assignment8 {

	    public static void main(String[] args) {
	        double deposit = 50;
	        double interest = 5;
	        double totalAmount =0;
	for(byte x=1;x<=12;x++){
	    totalAmount += deposit;
	    deposit += deposit*interest/100;
	    System.out.println(totalAmount);
	    }
	System.out.println();
	System.out.println("Total :" + totalAmount);
	    }
	        }

