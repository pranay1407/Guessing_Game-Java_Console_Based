import java.util.Scanner;

class Guesser
{
    int guessNumber;

    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number between 0 to 10");
        int trial=scan.nextInt();
        if(trial >=0 && trial<=10)
            guessNumber=trial;
        else
            System.out.println("Guess the numwithin the range");

        return guessNumber;
    }
}