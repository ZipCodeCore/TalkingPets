package humphrey.jeriah;

/**
 * Created by jeriahhumphrey on 2/1/17.
 */
public class Pet implements Comparable <Pet> {
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

    @Override
    public int compareTo(Pet p) {
        int compareValue=0;
        if(this.getName().compareToIgnoreCase(p.getName())==0){
            if (this.getClass().getName().compareToIgnoreCase(p.getClass().getName())>0){
                compareValue=1;
            }
            else{
                compareValue= -1;
            }

        }
        else if (this.getName().compareToIgnoreCase(p.getName())>0){
            compareValue= 1;
        }
        else if (this.getName().compareToIgnoreCase(p.getName())<0){
            compareValue =-1;
        }

        return compareValue;
    }
}