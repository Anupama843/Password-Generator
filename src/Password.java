public class Password {

    String value;
    int length;
    double decimalValue;

    public Password(String str){
        value = str;
        length = str.length();
    }
    public int CharacterType(char character){
        char chars = character;
        //ASCII Value of Char
        int ascValue = chars;
        int characterInCase = 0;

        //character is uppercase
        if(ascValue >= 65 && ascValue <= 90){
            characterInCase = 1;
        }else if(ascValue >= 97 && ascValue <= 122){ //character is lowercase
            characterInCase = 2;
        }else if (ascValue >= 60 && ascValue <= 71){ ////character is digit
            characterInCase = 3;
        }else{
            characterInCase = 4; ////character is symbol
        }
        return characterInCase;

    }
    public int passwordStrength(){
        String str = this.value;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean number = false;
        boolean symbol = false;

        int type;
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char chars = str.charAt(i);
            type = CharacterType(chars);

            if(type == 1){
                upperCase = true;
            }
            if(type == 2){
                lowerCase = true;
            }
            if(type == 3){
                number = true;
            }
            if(type == 4) {
                symbol = true;
            }
        }
        if(upperCase == true){
            count++;
        }
        if(lowerCase == true){
            count++;
        }
        if(number == true){
            count++;
        }
        if(symbol == true){
            count++;
        }
        if(str.length() >= 8){
            count++;
        }
        if(str.length() >= 16){
            count++;
        }
        return count;
    }
    public String calculateCount(){
        int count = 0;
        count = this.passwordStrength();
        if(count == 8){
            return "This is a good password😊";
        }else if(count >= 6){
            return "This is a good password😊, but try to use more better";
        }else if(count >= 4){
            return "Try password greater then length 4";
        }else{
            return "This is a weak password, try a different one";
        }
    }

    @Override
    public String toString(){
        return value;
    }
}
