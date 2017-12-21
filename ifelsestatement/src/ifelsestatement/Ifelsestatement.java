/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsestatement;

import java.util.Scanner;

/**
 *
 * @author ALINE
 */
public class Ifelsestatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = i.nextInt();
        if (  age>=18){
        System.out.println("You are adult");
        }
        else if (age == 17){
        System.out.println("You are not adult yet");
        }
        else{
            System.out.println("You are child");
        }
    }
    
}
