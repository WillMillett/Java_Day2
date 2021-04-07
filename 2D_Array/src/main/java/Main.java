/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */
import java.util.Random;
public class Main {
    
    public static void main(String[] args) {
        
        //instantiate a new random object
        Random randNum = new Random();
        
       //make a new 2D int array
        Integer[][] intArr = new Integer[5][5];

        //give the array values
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                intArr[i][j] = randNum.nextInt(1000);
            }
            
        }
        
        //find the biggest number in the array
        Integer biggestNum = 0;
        Integer row = 0;
        Integer column = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                if (intArr[i][j] > biggestNum) {
                    biggestNum = intArr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
            //print out the biggest number and where in the array it is
            System.out.println("The biggest number is: " + biggestNum + " Located at: " + row + " " + column);
    }
    
}
