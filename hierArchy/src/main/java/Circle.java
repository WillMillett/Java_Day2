/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Millett
 */
public class Circle implements Shape{
    
    float radius = 0;
    
    public Circle(float num){
        radius = num;
    }
    
     public float calcArea(){
         //return the area
         return (float)(Math.PI *(radius * radius)) ;
     }
    
    public void display(){
        //display the area
        System.out.println("The area of the circle is: " + calcArea());
    }
    
}
