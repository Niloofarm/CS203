/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**Q
 *
 * @author mofrad
 */
public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        dog1.eat();
        dog1.chaseCat();
        Dog[] myDogs = new Dog[3];
        
        myDogs[0]= new Dog();
        myDogs[1]= new Dog();
        myDogs[2]= dog1;
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.print("last dog's name is ");
        System.out.print(myDogs[2].name);
        
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }
}
        
        
    
    
    

