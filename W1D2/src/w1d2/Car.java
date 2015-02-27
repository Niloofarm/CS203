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
    private int x ;
    private int y ;
    
    void moveRight(int x) {
        x+= 1;
    }    
    void moveLeft(int y ) {
        x+= -1;
    }
    void moveUp(int x){
        y+=1;
      
    }
    void moveDown(int y){
        y+=-1;
    }
    void printLocation(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("This is the location");
       
    }
}
        
    
    

