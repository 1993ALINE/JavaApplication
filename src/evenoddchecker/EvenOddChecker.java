/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenoddchecker;

import java.util.Scanner;

/**
 *
 * @author ALINE
 */
public class EvenOddChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter number");
        int number = i.nextInt();
        
        if(number % 2 == 0)
            System.out.println("Even Number");
        else 
            System.out.println("Odd Number");
    }
    
}
