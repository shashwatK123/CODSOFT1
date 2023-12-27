import java.util.Random;
import java.util.Scanner;
 
 public class NumberGame {
     public static void main (String[]args){
         int number;
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         number = random.nextInt(100);
         System.out.println("\n Welcome to the Number Game.\n The System will Generate a random number between 1-100.");
         System.out.println("Generated Random number is:"+number);
         System.out.println("You have to guess that random number.\n your score will be the number of attempts you took to guess the number.\n");
         System.out.println("Enter the number of Rounds(between 1-5)you want to play the Game:");
         int rounds = scanner.nextInt();
         
         for (int i = 1; i<=rounds; i++){
             System.out.println();
             System.out.println("Round " +i+ " begins...\n");
             System.out.println("Enter your guess number:");
             int guess = scanner.nextInt();
             if (guess>number){
                 System.out.println("The number "+guess+" is HIGHER than Generated number. You have to Guess again...");
                 
             } else if (guess<number){
                 System.out.println("The number "+guess+" is LOWER than Generated Number. You have to guess again...");
                 
             } else {
                 System.out.println("The number "+guess+" is EQUAL to than Generated Number.\n Congrats it took one more attempts");
             }
             int count = 1;
             if (count>5){
                 System.out.println("OOPS!!! you were not able to guess the number in 5 attempts.\n BETTER LUCK NEXT TIME\n");
                 System.out.println("Round "+i+" is over.");
                System.out.println("\n All the Rounds are over.\n THANK YOU for playing the game.\n HOPE YOU ENJOYED IT.");
                scanner.close();
             }
         }
     }
 }
