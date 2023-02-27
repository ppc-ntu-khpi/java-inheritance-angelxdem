package domain;


 /**
 * Just class Animal that describe Animal
 */ 
public class Animal {

    protected String name;

    protected int weight;


/** 
 * 
 * It is default constructor. 
 *
 */
    public Animal() { 

        name = "generic name";
        weight = 25;
    }


/** 
 *
 * This method describe how the animal eats
 *
 */
    public void eat() { 

        System.out.println("Animal eating ...");
    }


/** 
 *
 * This method describe how the animal speaks
 *
 */
    public void speak() { 

        System.out.println("Animal speak...");
    }

    @Override

/** 
 *
 * Decription animal in string
 *
 * @return String
 */
    public String toString() { 

        return "My animal:\n" + "name: " + name + "\nweight: " + weight;
    }
}
