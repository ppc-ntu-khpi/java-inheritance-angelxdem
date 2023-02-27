package domain;


 /**
 * The class Cow extends herbivorous
 */ 
public class Cow extends Herbivorous {

    private double milkPerDay;


/** 
 *
 * It is a constructor 
 *
 * @param name  the name
 * @param weight  the weight
 * @param milkPerDay  the milk per day
 * @param grassPerDay  the grass per day
 */
    public Cow(String name, int weight, double milkPerDay, double grassPerDay) { 

        this.name = name;
        this.weight = weight;
        this.milkPerDay = milkPerDay;
        this.GrassPerDay = grassPerDay;
    }


/** 
 *
 * It is a default constructor
 *
 */
    public Cow() { 

        this("Mysa", 500, 20.5, 300);
    }


/** 
 *
 * It is constructor only for name
 *
 * @param name  the name
 */
    public Cow(String name) { 

        this(name, 500, 20.5, 300);
    }
    

/** 
 *
 * This method describe how the cow give milk
 *
 */
    public void GivesMilk() { 

        System.out.println("Cow give " + milkPerDay + " litriv per today.");
    }

    @Override
/** 
 *
 * Decription the cow in string
 * It override from father class
 * 
 * @return String
 */
    public String toString() { 

        return super.toString() + "\nmilk per day:" + this.milkPerDay + "\ngrass per day:" + this.milkPerDay + "\n";
    }

    @Override
/** 
 *
 * This method describe how the cow speaks
 * It override from father class
 *
 */
    public void speak() { 

        System.out.println("Muuuuu!  Muuuuu!  ");
    }

    @Override
/** 
 *
 * This method describe how the cow eats
 * It override from father class
 */
    public void eat() { 

        System.out.println("Cow eat " + GrassPerDay + " grass per today");
    }
    
    
}
