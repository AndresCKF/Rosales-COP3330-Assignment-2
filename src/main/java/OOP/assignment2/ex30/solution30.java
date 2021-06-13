/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Rosales
 */
// Align a 12x12 multiplication table.
package OOP.assignment2.ex30;

public class solution30 {
    public static void main(String[] args) {
        //using nested for loop, perform multiplication row by row
        //pass product to table printer.
        runMultiplicationTable();
    }

    private static void runMultiplicationTable() {
        int product;
        for(int i = 1; i <=12;i++){
            for(int j=1; j <=12;j++){
                product = i * j;
                if(product < 10){
                    System.out.print("   ");
                }else if(product < 100){
                    System.out.print("  ");
                }else {
                    System.out.print(" ");
                }
                System.out.print(product);
            }
            System.out.print("\n");
        }
    }
}
