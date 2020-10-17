package lessons1;

public class Assignment2 {

	public static void main(String[] args) {
		   secondToHMSConvert(7500);
    }
        public static void secondToHMSConvert(int a){
        if (a > 60) {
                int b = a / 60;
                if (b > 60) {
                    System.out.print(b / 60 + " : " + b % 60 + " : " + a % 60);
                } else {
                    System.out.println(b + " : " + a % 60);
                }
            } else {
                System.out.println("0 : 0 : " + a);
            }
        }
    }


