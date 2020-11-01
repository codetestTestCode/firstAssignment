
package lessons1;
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		System.out.println("Please ! Type Number");
        Scanner op = new Scanner(System.in);
      try{
          byte a = op.nextByte();

        for(byte i=1;i<=a-2;i+=2){
            for(byte y=a;y>i;y-=2){
                System.out.print(" ");
            }
            for(byte x=1 ; x<=i;x++){
                System.out.print(x);
            }
            System.out.println(); }
              for(byte i=a;1<=i;i-=2){
                  for(byte y=a;y>i;y-=2){
                      System.out.print(" ");
                  }
                  for(byte x=1 ; x<=i;x++){
                      System.out.print(x);
                     }
                  System.out.println(); }
      }
      catch (Exception e){
          System.out.println("Please !Try Again Type");
      }

	}

}
