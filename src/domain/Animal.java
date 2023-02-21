package domain;

public class Animal {

    protected String name;

    protected int weight;

    public Animal() {
        name = "generic name";
        weight = 25;
    }

    public void eat() {
        System.out.println("Animal eating ...");
    }

    public void speak() {
        System.out.println("Animal speak...");
    }

    @Override
    public String toString() {
        return "My animal:\n" + "name: " + name + "\nweight: " + weight;
    }
}
