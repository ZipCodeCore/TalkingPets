package holland.andres;

import java.lang.*;

/**
 * Created by andresholland on 1/31/17.
 */
public class Pet {

    Pet (String name) {
        this.name = name;
    }

    private String name;

    public String speak () {
        return "hello";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
