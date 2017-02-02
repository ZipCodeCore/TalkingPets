package humphrey.jeriah;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class Pet {
    private String name;

        public Pet(){
          name = "mypet";
    }

        public Pet(String name){
            this.name=name;
        }

    public String speak() {
        String message = "I am your pet";
        return message;
    }

    public String getName() {

            return name;
    }


    public String setName(String name) {
        this.name = name;
        return name;

    }
}