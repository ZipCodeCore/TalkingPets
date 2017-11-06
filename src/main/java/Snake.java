/**
 * Created by danries on 1/31/17.
 */
public class Snake extends Pet {

    public Snake(String name) {
        this.name = name;
    }

    @Override
    public String speak(){
        return "Hisssssss";
    }

}
