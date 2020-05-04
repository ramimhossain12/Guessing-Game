package JavaProblem;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
      public static  int opt;
    public static void main(String args[]){

        Random rand = new Random();

        int randomInteger;

        randomInteger = rand.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Chosin option");
            System.out.println("1.Game Start");
            System.out.println("2.Exit ");
            System.out.println("Your Option (1-2) ");
            opt = scanner.nextInt();
            if (opt==1){
                System.out.println("Game On");
                System.out.println("User Input The Number :");

            }





            int userInput = scanner.nextInt();

            if(userInput==randomInteger){
                System.out.println("Congratulation  You Win ");
                break;
            }
            else if(userInput>randomInteger){
                System.out.println("Guess Lower");
            }else{
                System.out.println("Guess Higher");
            }
        }
    }
}