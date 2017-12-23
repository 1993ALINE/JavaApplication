/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carserial;

import java.util.Scanner;

/**
 *
 * @author ALINE
 */
public class CarSerial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER CAR NUMBER : ");
        String carNumber = input.nextLine();
        numberPlate(carNumber);
        
    }

    private static void numberPlate(String carNumber) {
       String[] parseValue;
       parseValue = carNumber.split("-");
       String area = parseValue[0];
       String areaType = parseValue[1];
       String type = parseValue[2];
       System.out.println("The type of the vehicle is: "+vhType(type));
    }

    private static String vhType(String value) {
        switch (value){
            case "Ka":
                return "Car\n Engine: 500CC";
                case "Kha":
                return "Car\n Engine: 600CC";
                case "Ga":
                return "Car\n Engine: 700CC";
                case "Gha":
                return "Car\n Engine: 800CC";
         
                default: 
                    return "No type found";
            
            
        }
        
    
    }
    
}
