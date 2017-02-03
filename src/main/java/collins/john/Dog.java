package collins.john;

/**
 * Created by johncollins on 1/31/17.
 */
public class Dog extends Pet {


    public Dog(String name) {
        this.name = name;
    }

    public String speak() {
        return "woof";
    }

    public int compareTo(Object o) {
        return 0;
    }
}