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
public class Car {
    private int x ;
    private int y ;
    
    void moveRight(int a) {
        x += a;
    }
    
    void moveLeft(int a ) {
        x -= a;
    }
    
    void moveUp(int a){
        y += a;
    }
    
    void moveDown(int a){
        y -= a;
    }
    
    String returnLocation(){
        return x + " " + y;
        
    
    }
    
}
