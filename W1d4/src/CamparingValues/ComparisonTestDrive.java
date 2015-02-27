/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CamparingValues;

/**
 *
 * @author mofrad
 */
public class ComparisonTestDrive {
    public static void main (String[] args) {
        byte b = 5;
        short s = 5;
        int i = 5;
        long L= 5;
        float f = 5.0f;
        double d = 5.0;
        
        System.out.println(b == s);
            
        
        System.out.println (s == i);
            
        
        System.out.println(i == L);
            
        
         System.out.println(L == f);
            
        
        System.out.println(f == d);
            
        
            
        
        
        String s1 = "Mi";
        String s2 = "Mi";
        String s3 = "MiMi";
        String s4 = s1+s2;
        
        System.out.println(s1 == s2);
        System.out.println(s4 == s3);
        System.out.println(s4.equals(s3));
        
        
        
        
    }
}
    
    
    
