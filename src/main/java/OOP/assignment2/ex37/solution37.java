/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex37;
import java.util.*;
public class solution37 {
    public static void main(String[] args) {
        //prompt user for minimum length
        //number of specials, number of numbers.
        //generatePassword
        int[] requirements = new int[3];
        requirements = getUserInput(requirements);
        String password = generatePassword(requirements);
        System.out.printf("Your password is: %s", password);
    }

    private static String generatePassword(int[] requirements) {
        Random rand = new Random();
        int minlength = requirements[0], numSpec = requirements[1],
                numNum = requirements[2], numCh;
        String password;

        if((numSpec + numNum) > minlength/2){
            numCh = numNum + numSpec;
        }else{
            numCh = minlength - numNum - numSpec;
        }
        String[] passwordTemp = new String[numCh + numSpec + numNum];
        //loop populating password with characters
        int i,j,k = 0;
        for(i =0; i< numCh;i++) {
            passwordTemp[i] = generateLetter();
        }
        for(j =0; j< numNum;j++) {
            passwordTemp[i + j] = String.valueOf(rand.nextInt(10));
        }
        for(k =0; k< numSpec;k++) {
            passwordTemp[i + j + k] = generateSpecial();
        }
        passwordTemp = randomize(passwordTemp);
        password = convertToString(passwordTemp);
        return password;
    }

    private static String convertToString(String[] passwordTemp) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < passwordTemp.length; i++) {
            sb.append(passwordTemp[i]);
        }
        String str = sb.toString();
        return str;
    }

    private static String[] randomize(String[] passwordTemp) {
        Random rand = new Random();
        int rng; String swapHelper;

        for(int i = 0; i<passwordTemp.length; i++){
            rng = rand.nextInt(passwordTemp.length - 1);
            swapHelper = passwordTemp[rng];
            passwordTemp[rng] = passwordTemp[passwordTemp.length - 1];
            passwordTemp[passwordTemp.length-1] = swapHelper;
        }
        return passwordTemp;
    }

    private static String generateSpecial() {
        Random rand = new Random();
        List<String> listOfSpecials = new ArrayList<>(List.of("!", "@","#", "$", "%","^", "&", "*", "(",")","+" ));
        int rng = rand.nextInt(listOfSpecials.size());
        String specialCh = listOfSpecials.get(rng);
        System.out.print(listOfSpecials.get(rng));
        return specialCh;
    }

    private static String generateLetter() {
        Random rand = new Random();
        String randomizedCharacter;
        char randomTemp = (char) (rand.nextInt(26) + 'a');
        randomizedCharacter = Character.toString(randomTemp);
        System.out.printf(randomizedCharacter);
        return  randomizedCharacter;
    }

    public static int[] getUserInput(int[] requirements) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true; String input = "-1";

        while(condition){
            System.out.printf("Please enter minimum length.%n");
            input = scanner.nextLine();
            condition = scrubInput(input);
        }
        condition = true;
        requirements[0]=Integer.parseInt(input);
        while(condition){
            System.out.printf("Please enter minimum #Special characters.%n");
            input = scanner.nextLine();
            condition = scrubInput(input);
        }
        condition = true;
        requirements[1]=Integer.parseInt(input);
        while(condition){
            System.out.printf("Please enter minimum #Numbers.%n");
            input = scanner.nextLine();
            condition = scrubInput(input);
        }
        requirements[2]=Integer.parseInt(input);
        return requirements;
    }
    public static boolean scrubInput(String input) {
        if (input == null) {
            return true;
        }else {
            try {
                int d = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.printf("Not a number %n");
                return true;
            }
        }
        return false;
    }
}
