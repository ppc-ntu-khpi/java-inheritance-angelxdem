package test;

import domain.Cow; 


 /**
 * The class Test animal for test classes
 * 
 */ 
public class TestAnimal {


/** 
 *
 * Main 
 * in this method we testing program
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Cow cow1 = new Cow("Mysjka");
        System.out.println(cow1);
        cow1.eat();
        cow1.GivesMilk();
        cow1.speak();
    }
}
