package lessons1;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		 System.out.println("Please Type Number Only!");
		    Scanner number = new Scanner(System.in);
try{
	byte a = number.nextByte();

	        for(byte i=1;i<=a;i+=2){
	            for(byte y=a;y>i;y-=2){
	                System.out.print(" ");
	            }
	           for(byte x=1 ; x<=i;x++){
	              System.out.print(x);
	                }
	            System.out.println();
	        }
	        number.close();
}    
		catch(Exception e){
	System.out.println("Please Try Again Type Number");
}
	}

}
