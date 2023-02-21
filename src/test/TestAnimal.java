package test;

import domain.Cow; 

public class TestAnimal {

    public static void main(String[] args) {
        Cow cow1 = new Cow("Mysjka");
        System.out.println(cow1);
        cow1.eat();
        cow1.GivesMilk();
        cow1.speak();
    }
}
