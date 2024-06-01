import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int num;
        String userChoice="";
        String computerChoice="";
        System.out.println("welcome to Rock, Paper, and Scissors!");
        System.out.print("please choose R)ock,p)aper,or S(cissors.>");
        userChoice=sc.nextLine();
        num=rand.nextInt(3);
        if(num==0){
        computerChoice="R";
        }
        if(num==1){
            computerChoice="P";
            }
         if(num==2){
            computerChoice="S";
                }
        //print the computer choice
        if(computerChoice.equals("S")){
            System.out.println("The computer chose scissors");
        }
        if(computerChoice.equals("P")){
            System.out.println("The computer chose paper");
            }
        if(computerChoice.equals("R")){
            System.out.println("The computer chose rock");
            }
            //Determine a winner
            if(userChoice.equals("R")&&computerChoice.equals("S")){
                System.out.println("the user won!");
            }
            if(userChoice.equals("P")&&computerChoice.equals("R")){
                System.out.println("the user won!");
            }
            if(userChoice.equals("S")&&computerChoice.equals("P")){
                System.out.println("the user won!");
            }
            if(userChoice.equals("S")&&computerChoice.equals("R")){
                System.out.println("the computer won!");
            }
            if(userChoice.equals("R")&&computerChoice.equals("P")){
                System.out.println("the computer won!");
            }
            if(userChoice.equals("P")&&computerChoice.equals("S")){
                System.out.println("the computer won!");
            }
            if(userChoice.equals(computerChoice)){
                System.out.println("Tie!");
            }
        }
        
}
