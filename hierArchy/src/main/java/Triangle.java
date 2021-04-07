/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Millett
 */
public class Triangle {
    
    Integer base = 0;
    Integer hight = 0;
    
    public Triangle(Integer bottom, Integer high){
        
        base = bottom;
        hight = high;
     
     }
    
     public float calcArea(){
         //return the area
         return (1/2*(base * hight));
     }
    
    public void display(){
        //display the area
        System.out.println("The area of the circle is: " + calcArea());
    }
}
