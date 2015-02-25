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
public class Car {
    private int x = 0;
    private int y = 0;
    
    void moveRight() {
        x+= 1;
    }    
    void moveLeft() {
        x+= 1;
    }
    void moveUp(){
       y+=1;
      
    }
    void moveDown(){
       y+=1;
    }
    void printLocation(){
        this.x = x;
        this.y = y;
        System.out.print(int x, int y);
       
    }
}
        
    
