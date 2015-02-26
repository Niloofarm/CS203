/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author mofrad
 */
public class Smallest {
     public static void main (String[] args){
         double[] nums = new double[100];
         for (int i = 0; i< nums.length; i++){
           nums[i]= Math.random() * nums.length;
         }
         
         double smallest=0.0;
         for (int i = 0; i<nums.length-1; i++){
             if (nums[i+1] < nums[i]){
                 smallest = nums[i+1];
             }
             else { 
                 smallest = nums[i];
                 
             }
             i++;
         }
         System.out.print(smallest);
                 
            
     }
    
}
