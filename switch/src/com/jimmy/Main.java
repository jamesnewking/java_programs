package com.jimmy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        switchPractice('a');
        print3PrimeNumbers(10,50);
        sumDivisibleBy3and5();
    }

    public static void print3PrimeNumbers(int startNum, int endNum){
        int count = 0;
        for (int j = startNum; j <= endNum; j++){
            if(isPrime(j)){
                System.out.println(j + " is a prime number");
                count++;
                if(count==3){
                    return;
                }
            }
        }
    }

    public static boolean isPrime(int number){
        if(number==1){
            return false;
        }

        for(int i=2;i <= number/2;i++){
            if((number%i)==0){
                return false;
            }
        }

        return true;
    }

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        if(number%2!=0 || number ==1){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        if( (end >= start) && (start > 0) && (end > 0) ){
            int sumOutput = 0;
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    sumOutput+=i;
                }

            }
            return sumOutput;
        } else{
            return -1;
        }
    }

    public static void sumDivisibleBy3and5(){
        int sum = 0;
        int count = 0;
        for(int i=1;i<1000;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i + " is a number that is divisible by 3 and 5!");
                sum += i;
                count++;
            }
            if(count==5){
                System.out.println(sum);
                return;
            }
        }
    }

    public static void switchPractice(char input){
        switch(input){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                {
                System.out.println("A, B, C, D, or E found");
            }
                break;
            default:{
                System.out.println("A, B, C, D, or E NOT found!");
                break;
            }
        }
    }

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }

}
