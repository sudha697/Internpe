import java.util.Scanner;
import java.util.Random;
public class Guessthenumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes")){
              Random random=new Random();
              int randnum=random.nextInt(100);
              int guess=-1;
              int tries=0;
              while(guess!=randnum){
                System.out.println("Guess a number between 1 to 100");
                guess=reader.nextInt();
                tries++;
                if(guess==randnum){
                    System.out.println("Hurray! You Guess the number");
                    System.out.println("It only took you "+tries+"Guesses");
                    System.out.println("Do you want to play again? type yes or no");
                    play=reader.next().toLowerCase();
                }
                else if(guess>randnum){
                    System.out.println("Your guess is too high ,try again");
                }
                else{
                    System.out.println("your guess is too low , try again");
                }
              }
              

        }
        reader.close();
    }
}
