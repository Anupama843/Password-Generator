import java.util.Scanner;

public class Generator {
    boolean containsUpperCase = false;
    boolean containsLowerCase = false;
    boolean containsNumber = false;
    boolean containsSymbol = false;

    Alphabet alphabet;

    public Generator(boolean containsUpperCase, boolean containsLowerCase, boolean containsNumber, boolean containsSymbol){
        alphabet = new Alphabet(containsUpperCase, containsLowerCase, containsNumber, containsSymbol);
    }
    public Password GeneratePassword(int length){
        final StringBuilder userInputPassword = new StringBuilder("");
        final int alphabatLength = alphabet.getAlphabet().length();
        int maxLength = alphabatLength - 1;
        int minLength = 0;
        int rangeOfLength = maxLength - minLength + 1;
        for(int i  = 0; i < length; i++){
            int index = (int)(Math.random() * rangeOfLength) + minLength;
            userInputPassword.append(alphabet.getAlphabet().charAt(index));
        }
        return new Password(userInputPassword.toString());
    }
    public static void requestPassword(){
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsNumber = false;
        boolean containsSymbol = false;
        String input;
        final Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Hey All, Welcome to SANU password Generator 😀 \n Answer the following question in Yes or No\n");

        while (true){
            System.out.println("Do you want to use lower case letter \"abcd...\" to be used? ");
            input = in.nextLine();
            if(input.equals("yes")){
                containsLowerCase = true;
            }else{
                if((input.equals("NO") == false) && (input.equals("No") == false) && (input.equals("no") == false)){
                    PasswordRequestError();
                    break;
                }
            }
            System.out.println("Do you want to use upper case letter \"ABCD...\" to be used? ");
            input = in.nextLine();
            if(input.equals("yes")){
                containsUpperCase = true;
            }else{
                if((input.equals("NO") == false) && (input.equals("No") == false) && (input.equals("no") == false)){
                    PasswordRequestError();
                    break;
                }
            }
            System.out.println("Do you want to use Number \"0123...\" to be used? ");
            input = in.nextLine();
            input = input.toLowerCase();
            if(input.equals("yes")){
                containsNumber = true;
            }else{
                if((input.equals("NO") == false) && (input.equals("No") == false) && (input.equals("no") == false)){
                    PasswordRequestError();
                    break;
                }
            }
            System.out.println("Do you want to use Symbols \"!@#$...\" to be used? ");
            input = in.nextLine();
            if(input.equals("yes")){
                containsSymbol = true;
            }else{
                if((input.equals("NO") == false) && (input.equals("No") == false) && (input.equals("no") == false)){
                    PasswordRequestError();
                    break;
                }
            }
            if(!containsLowerCase && !containsUpperCase && !containsNumber && !containsSymbol){
                System.out.println("You have not selected any characters to generate password");
                break;
            }
            System.out.println("You are on a correct place! Please enter the length of password");

            int length = in.nextInt();

            final Generator generator = new Generator(containsUpperCase, containsLowerCase, containsNumber, containsSymbol);

            final Password userPassword = generator.GeneratePassword(length);

            System.out.println(userPassword);

            in.close();
            break;
        }
    }
    public static void PasswordRequestError() {
        System.out.println("You have entered something incorrect let's go over it again \n");

    }

    public static void checkPassword(){
        String input;
        final Scanner in = new Scanner(System.in);
        System.out.println("\n Enter your Password");
        input = in.nextLine();
        final Password password = new Password(input);
        System.out.println(password.calculateCount());
        in.close();
    }
}
