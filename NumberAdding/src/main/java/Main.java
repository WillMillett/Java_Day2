/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Millett
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //for holding the total of all numbers added to gether
        Integer total = 0;
        
        //for each index of the array
        for(String tempString: args){
            
            //try to parse the string to an integer
            //and add it to total
            try {
                total += Integer.parseInt(tempString);
            } catch (Exception e) {
                //otherwise say it could not be parsed
                 System.out.println("Could not convert to an integer: " + e.getMessage());
            }
            
        }
        //Print the total
        System.out.println("The total is: " + total);
    }
}
