package domain;

public class Cow extends Herbivorous {

    private double milkPerDay;

    public Cow(String name, int weight, double milkPerDay, double grassPerDay) {
        this.name = name;
        this.weight = weight;
        this.milkPerDay = milkPerDay;
        this.GrassPerDay = grassPerDay;
    }

    public Cow() {
        this("Mysa", 500, 20.5, 300);
    }

    public Cow(String name) {
        this(name, 500, 20.5, 300);
    }
    
    public void GivesMilk() {
        System.out.println("Cow give " + milkPerDay + " litriv per today.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nmilk per day:" + this.milkPerDay + "\ngrass per day:" + this.milkPerDay + "\n";
    }

    @Override
    public void speak() {
        System.out.println("Muuuuu!  Muuuuu!  ");
    }

    @Override
    public void eat() {
        System.out.println("Cow eat " + GrassPerDay + " grass per today");
    }
    
    
}
