package lessons1;

import java.util.Scanner;

public class InchesToFeetConverter {
	public static void main(String[] args) {
			System.out.println("Please Type Inches");
			InchesToFeetConverter op1 = new InchesToFeetConverter();
	        Scanner op2= new Scanner(System.in);
	       int inches =   op2.nextInt();
	        op1.convert(inches);
	    }
	    public void convert(int inches){
	        int feets = inches/12;
	       int inc = inches%12;
	        if (inches <12){
	            System.out.println(""+inches+'"');
	        }
	        else {
	            System.out.println(feets+"'feets "+inc+'"'+"inches");
	        }
		}
		
	}



