package lessons1;

public class Assignment5 {

	public static void main(String[] args) {
		for(byte i=1;i<=9;i+=2){
            for(byte y=9;y>i;y-=2){
                System.out.print(" ");
            }
           for(byte x=1 ; x<=i;x++){
              System.out.print(x);
                }
            System.out.println();
        }

	}

}
