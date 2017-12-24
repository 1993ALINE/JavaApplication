/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.Scanner;

/**
 *
 * @author ALINE
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mymethod();
    }

    private static void mymethod() {
      Scanner i = new Scanner(System.in);
      System.out.println("Enter your id : ");
      String result = i.nextLine();
      
      
      String year = result.substring(0,4);
      System.out.println("Student year : "+year);
      
      String semester = result.substring(4,6);
      if(semester.contains("00")){
          System.out.println("Semester : Spring");   
          
      }
      else if(semester.contains("10")){
        System.out.println("Semester : Summer");
        
    }
      else if(semester.contains("20")){
         System.out.println("Semester : Fall"); 
          
      }
      
    }
    
}
