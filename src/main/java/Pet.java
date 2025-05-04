
 public abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     abstract public String speak();
}
