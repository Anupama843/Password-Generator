public class Alphabet {
    public static final String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    public static final String numbers = "0123456789";
    public static final String symbols = "!@#$%^&*()-_=+\\\\/~?";

    private StringBuilder passwordContainer;

    public Alphabet(boolean containsUpperCase, boolean containsLowerCase,
                    boolean containsNumbers, boolean containsSpecialCharacters){

        passwordContainer = new StringBuilder();

        if(containsUpperCase){
            passwordContainer.append(upperCaseLetters);
        }
        if(containsLowerCase){
            passwordContainer.append(lowerCaseLetters);
        }
        if(containsNumbers){
            passwordContainer.append(numbers);
        }
        if(containsSpecialCharacters){
            passwordContainer.append(symbols);
        }
    }
    public String getAlphabet(){
        return passwordContainer.toString();
    }
}
