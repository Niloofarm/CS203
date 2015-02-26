/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author mofrad
 */
public class HamsterDriveTest {
    public static void main (String[] args){
         Hamster[] h = new Hamster[100];
      
         for ( int i = 0; i < h.length; i++){
            h[i]= new Hamster();
            h[i].age = Math.random()*3;
         }
        double sum = 0;
        double aveage = 0;
         for (int i = 0; i < h.length; i++){
            sum = sum+h[i].age;
        }
        aveage = sum%100;
        System.out.print(aveage);
        
        
         
        
    }
}
