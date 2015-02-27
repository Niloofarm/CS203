/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetterCar;

/**
 *
 * @author mofrad
 */
public class CarTestDrive {
    public static void main (String[] args) {
        
        Car c1 = new Car();
        c1.moveUp(6);
        c1.moveDown(5);
        c1.moveLeft(3);
        c1.moveRight(2);
        c1.returnLocation();
        
        Car c2 = new Car();
        c2.moveUp(3);
        c2.moveDown(7);
        c2.moveLeft(1);
        c2.moveRight(2);
        c2.returnLocation();
        
       
    }      
    
}
