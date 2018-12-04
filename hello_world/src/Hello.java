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

    public static boolean isLeapYear(int year){
        if(year < 1 || year >9999){
            return false;
        }
        if( ((year % 4 ==0) && (year %100 !=0)) || (year % 400 == 0) ){
            return true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        double threshold = 0.001;
        if(Math.abs(firstNum-secondNum)<threshold){
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int first, int second, int third){
        if(first + second == third){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int uno, int dos, int tres) {
        if (uno >= 13 && uno <= 19) {
            return true;
        } else if (dos >= 13 && dos <= 19) {
            return true;
        } else if (tres >= 13 && tres <= 19) {
            return true;
        }
        return false;
    }

    public static double area(double radius){
        //double PI = 3.14159;
        if(radius < 0){
            return -1.0;
        }
        return (3.14159 * radius * radius);
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            return -1.0;
        }
        return (x * y);
    }


    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        int years = (int)(minutes/525600);
        int remainder = (int)(minutes%525600);
        int days = remainder/(60*24);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }



    public static void printEqual(int first, int second, int third){
        if(first<0 || second<0 || third<0){
            System.out.println("Invalid Value");
        } else if((first == second) && (second == third)){
            System.out.println("All numbers are equal");
        } else if( (first != second) && (first != third) && (second!=third) ){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature>=25 && temperature <=35){
                return true;
            }
            return false;
        } else {
            if(temperature>=25 && temperature <=45){
                return true;
            }
            return false;
        }
    }

}
