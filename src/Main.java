
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;
        final Scanner in = new Scanner(System.in);
        System.out.println("Welcome to SANU password Generator 😀");
        printMenu();
        while (in.hasNextLine()){
            input = in.nextLine();
            if(input.equals("1")){
                Generator.requestPassword();
                printMenu();
            }else if (input.equals("2")){
                Generator.checkPassword();
                printMenu();
            }else if(input.equals("3")){
                printMessage();
                printMenu();
            }else if(input.equals("4")){
                break;
            }else {
                System.out.println();
                System.out.println("Kindly select one of the given number");
                printMenu();
            }
        }

    }
    private static void printMenu(){
        System.out.println();
        System.out.println("Enter 1 - Password Generator");
        System.out.println("Enter 2 - Password Strength Check");
        System.out.println("Enter 3 - Useful Information");
        System.out.println("Enter 4 - Quit");
        System.out.println("Choose:");
    }
    private static void printMessage(){
        System.out.println();
        System.out.println("Use a minimum password length of 8 or more characters");
        System.out.println("Include both upper and lower case alphabets, numbers and symbols if allowed");
        System.out.println("Avoid using the same password twice or for different account");
        System.out.println("Avoid using character repitation, keyboard patterns etc");
        System.out.println("Do not use simple password which is easy to guess");
    }
}
