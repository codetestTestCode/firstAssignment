package lessons1;

public class Assignment5 {

	public static void main(String[] args) {
		for(byte i=1;i<=5;i++){
            for(byte y=i;y<=5;y++){
                System.out.print(" ");

            }
            for(byte x=1 ; x<=(i*2)-1;x++){

                    System.out.print(x);
            }

            System.out.println();

            }

	}

}
