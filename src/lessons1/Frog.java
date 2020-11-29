package lessons1;

public class Frog {
	public static void main(String[] args) {

        Frog frog = new Frog();
        frog.jump();
    }
    public void jump(){
        byte depthOfPit = 30;
        byte jumpOfFrog = 3;
        byte downOfFrog =2;
        int totalJump = 0;
    while (totalJump<depthOfPit){
        totalJump += jumpOfFrog;
        if(totalJump>=depthOfPit-jumpOfFrog)
            break;
        totalJump -= downOfFrog;
    }
       totalJump = totalJump/(jumpOfFrog-downOfFrog)+1;
        System.out.println("Total Jump  : "+ totalJump);
    }

}