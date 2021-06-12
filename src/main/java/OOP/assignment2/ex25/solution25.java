/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Andres Rosales
 */
/*
* A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
* */
package OOP.assignment2.ex25;
import java.util.Scanner;

public class solution25 {
    //create class that counts each kind of character.
    final public class passwordMakeup
    {
        public int special;
        public int letters;
        public int numbers;

        public passwordMakeup()
        {
            this.special = 0;
            this.letters = 0;
            this.numbers = 0;
        }
        public void displayCount(){
            System.out.printf("# Specials = %d\n", this.special);
            System.out.printf("# Letters = %d\n", this.letters);
            System.out.printf("# Numbers = %d\n", this.numbers);

        }
    }
    public static void main(String[] args){
        solution25 app = new solution25();
        String password = app.getInput();
        //given these parameters, pass to another function that determines strength
        //output The password '12345' is a very weak password.
        int strengthValue = app.passwordValidator(password);
        String strength = app.StrengthtoString(strengthValue);
        System.out.printf("The password %s is %s", password, strength);

    }

    private String StrengthtoString(int strengthValue) {
        String strengthString = "";
        switch(strengthValue){
            case 1 :
                strengthString = "Very Weak";
                break;
            case 2 :
                strengthString = "Weak";
                break;
            case 3 :
                strengthString = "Average";
                break;
            case 4 :
                strengthString = "Strong";
                break;
            case 5 :
                strengthString = "Very Strong";
        }
        return strengthString;

    }

    public int passwordValidator(String password) {
        // count number of letters,numbers, and special characters
        passwordMakeup passwordCount = countCharacters(password);
        //given makeup of password, determine strength.
        int passwordValue;
        if (password.length() < 8){
            if((passwordCount.letters == 0) && (passwordCount.special == 0)){
                passwordValue = 1;
            }else{
                passwordValue = 2;
            }
        }else if((passwordCount.letters > 0) && (passwordCount.numbers > 0) && (passwordCount.special > 0)){
            passwordValue = 5;
        }else if((passwordCount.letters > 0) && (passwordCount.numbers > 0) && (passwordCount.special == 0)){
            passwordValue = 4;
        }else{
            passwordValue = 3;
        }
        return passwordValue;
    }

    public passwordMakeup countCharacters(String password){
        passwordMakeup passwordCount = new passwordMakeup();
        for (int i = 0; i < password.length(); ++i) {
            char ch = password.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                ++passwordCount.special;
            } else if (Character.isDigit(ch)) {
                ++passwordCount.numbers;
            } else {
                ++passwordCount.letters;
            }
        }
        return passwordCount;
    }
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a password");
        return scanner.nextLine();
    }
}
