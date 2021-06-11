/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex24.base;
import java.util.*;
import java.io.*;


public class AnagramDetector{
    public boolean isAnagram(String word1, String word2) {
        int NO_OF_CHARS = 256;

        if (word1.length() != word2.length()) {
            return false;
        } else {
            //Initialize arrays that count characters in each word
            int countChar1[] = new int[NO_OF_CHARS];
            Arrays.fill(countChar1, 0);
            int countChar2[] = new int[NO_OF_CHARS];
            Arrays.fill(countChar2, 0);
            //Start counting characters
            for (int i = 0; i < word1.length(); i++) {
                countChar1[word1.charAt(i)]++;
                countChar2[word2.charAt(i)]++;
            }
            //if the number of each character doesnt align, they are different
            for (int i = 0; i < NO_OF_CHARS; i++)
                if (countChar1[i] != countChar2[i])
                    return false;
            return true;

        }
    }

}
