package lessons1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment6 {

	public static void main(String[] args) {
	
	        System.out.println("Please Type Number Only!");
	        Scanner number = new Scanner(System.in);
	        try{ byte a = number.nextByte();


	              for(byte i=a;1<=i;i-=2){
	                  for(byte y=a;y>i;y-=2){
	                      System.out.print(" ");
	                  }
	                  for(byte x=1 ; x<=i;x++){
	                      System.out.print(x);
	                     }
	                  System.out.println(); }
	              number.close();

	          } catch (InputMismatchException e) {
	            System.out.println("Please Try Again Type Number");

	        }

	}

}
