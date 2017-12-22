/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethod;

/**
 *
 * @author ALINE
 */
public class MyMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myMethod();
        int result1 = yearToDays(8);
        System.out.println("Result is : "+result1);
        
        String result2 = myName("ALINE");
        System.out.println(result2);
        
    }

    private static void myMethod() {
        System.out.println("Just a method called!");
    }

    private static int yearToDays(double i) {
        double k = i*3.65;
        return (int) k;          
    }

    private static String myName(String n) {
        String s = "Name is: "+n;
        return s;     
    }
 
}
