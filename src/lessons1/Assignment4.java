package lessons1;

public class Assignment4 {

	public static void main(String[] args) {
		for(byte i=5;i>=1;i--){
            for(byte y=1;y<=i-1;y++){
                System.out.print(" ");
            }
            for(byte x=i ; x<=5;x++){

                System.out.print(x);

            }
            System.out.println();

        }
	}

}
