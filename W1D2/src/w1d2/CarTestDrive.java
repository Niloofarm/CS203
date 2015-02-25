/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2;

/**
 *
 * @author mofrad
 */
public class CarTestDrive {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.moveDown();
        mycar.moveUp();
        mycar.moveLeft();
        mycar.moveRight();
       
        mycar.printLocation(5, 6);
        
            
     
                 
    
                
    
        
        Car hercar = new Car();
        hercar.moveRight();
        hercar.moveLeft();
        hercar.moveUp();
        hercar.moveDown();
        hercar.printLocation(7, 8);
        
        
    }
}
