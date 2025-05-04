public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        this.name = name;
    }
    public String speak(){
        return "Woof";
    }
}
