/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex24.base;
import java.util.Scanner;

public class solution24 {
    public static void main(String[] args){
        AnagramDetector detector = new AnagramDetector();
    //ask user to input 2 strings to compare
        // check if 2 strings are same length, if so pass to AnagramDetector(word1, word2)
        //count number of each letter in each word
        //compare dictionaries, if same, theyre anagram.
        System.out.print("Please enter word 1");
        String word1 = getWord();
        System.out.print("Please enter word 2");
        String word2 = getWord();
        boolean result = detector.isAnagram(word1, word2);
        if (result){
            System.out.print(word1 + " and " + word2 + " are anagrams");
        }else{
            System.out.print(word1 + " and " + word2 + " are not anagrams");
        }
    }

    public static String getWord(){
        Scanner scan = new Scanner(System.in);
        String Word = scan.nextLine();
        return Word;
    }
}
