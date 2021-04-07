/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Millett
 */
public class Rectangle implements Shape {
    
     Integer length = 0;
     Integer width = 0;
     
     public Rectangle(Integer len, Integer wid){
        length = len;
        width = wid;
     }
    
     public float calcArea(){
         //return the area
         return (length * width);
     }
    
    public void display(){
        //display the area
        System.out.println("The area of the circle is: " + calcArea());
    }
    
}
