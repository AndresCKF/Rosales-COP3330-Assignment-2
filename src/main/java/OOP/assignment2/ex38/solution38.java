/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
package OOP.assignment2.ex38;
import java.util.*;

public class solution38 {
    public static void main(String[] args) {
        List<Integer> list = getListNums();
        List filteredList = filterEvenNumbers(list);
        System.out.println(filteredList.toString());
    }

    public static List filterEvenNumbers(List<Integer> list) {
        for(int i = 0; i < list.size();i++){
            if(!(list.get(i)%2 == 0) ){
                list.remove(i);
            }
        }
        return list;
    }

    public static List getListNums() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a list of numbers separated by a space \n");
        String list = scanner.nextLine();
        String[] elements = list.split(" ");
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        for(int i=0;i< elements.length;i++){
            numbers.add(Integer.parseInt(elements[i]));
        }
        return  numbers; 
    }
}
