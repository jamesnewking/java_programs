public class Hello {

    public static void main(String[] args){
        String name = "Jimmy";
        char registered = '\u00AE';
        char copyright = '\u00A9';
        System.out.println("Hello " + name + registered + copyright );
        int someNum = 500;
        String stringNum = "5100";
        stringNum = someNum + stringNum;
        System.out.println(stringNum);
        System.out.println(someNum + stringNum);
        if (true){
            System.out.println("this is true");
        }

        System.out.println("___________________");
        double first = 20;
        double second = 80;
        double result = (first + second) * 25;
        result = result % 40;
        System.out.println(result);
        if (result <= 20){
            System.out.println("Total was over the limit");
        }

        displayHighScorePosition("Bush", calculateHighScorePosition(1500));
        displayHighScorePosition("Donald", calculateHighScorePosition(900));
        displayHighScorePosition("Vlad", calculateHighScorePosition(400));
        displayHighScorePosition("Prince", calculateHighScorePosition(50));

        printMegaBytesAndKiloBytes(2050);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore){

        if (playerScore >= 1000){
            return 1;
        } else if(playerScore>=500){
            return 2;
        } else if(playerScore>=100){
            return 3;
        }
            return 4;

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int kB = kiloBytes % 1024;
        int mB = kiloBytes / 1024;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        };
        System.out.println(kiloBytes + " KB = " + mB + " MB and " + kB + " KB");
    }
}
