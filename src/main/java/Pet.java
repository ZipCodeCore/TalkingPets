/**
 * Created by randallcrame on 1/31/17.
 */
public class Pet {

    String name;

    Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Remember to push often!";
    }

}
