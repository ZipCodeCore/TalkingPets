package kalaygian.dennis;

/**
 * Created by denniskalaygian on 5/2/17.
 */
public abstract class Pet {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();
}
