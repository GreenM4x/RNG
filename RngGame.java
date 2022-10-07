import java.util.Scanner;

public class RngGame {
    public int minNum;
    public int maxNum;

    private int numberTry = 1;
    private int numberGuess;
    private int numberToGuess;

    RngGame(int minNum, int maxNum){
        this.minNum = minNum;
        this.maxNum = maxNum;

        numberToGuess = randomNumberToGuess();
    }
    public int randomNumberToGuess() {
        return (int) (Math.random() * (this.maxNum - this.minNum) + this.minNum);

    }

    public void guessNumber(){

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100!");

        numberGuess = numberScanner.nextInt();

        if (numberGuess < numberToGuess){
            System.out.println("This number is to low");
            numberTry++;
            guessNumber();
        } else if(numberGuess > numberToGuess) {
            System.out.println("This number is to high");
            numberTry++;
            guessNumber();
        } else if (numberGuess == numberToGuess){
            Win();
        }

    }

    public void Win() {
        System.out.println("You win");
        System.out.println("the number was " + numberToGuess + "!");
        System.out.println("You needed " + numberTry + " tries to win!");
    }

}
