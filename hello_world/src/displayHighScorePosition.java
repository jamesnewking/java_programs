public class displayHighScorePosition {

    public static void main(){
        //String james = "James";
        displayHighScorePosition("James", calculateHighScorePosition(1500));
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore){
        int sOutput = 4;
        if (playerScore > 1000){
            sOutput = 1;
        } else if(playerScore<1000 && playerScore>500){
            sOutput = 2;
        } else if(playerScore<500 && playerScore>100){
            sOutput = 3;
        }
        return sOutput;
    }


}
