/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TASK 1.2 number -> nums/decs/sum */
       Scanner in = new Scanner(System.in);
       System.out.print("Input 3-mark number: ");
       int number = in.nextInt();
        
       int numbers = number%10;
       System.out.printf("Numbers: %d \n", numbers);
       
       int decs = number%100/10;
       System.out.printf("Decs: %d \n", decs);
       
       int thousands = number%1000/100;
        System.out.printf("Thousands: %d \n", thousands);
       
       int sum = number/100 + numbers + decs;
       System.out.printf("Sum of all 3 numbers: %d \n", sum);
    }
    
}
