package petsPolymorphism;

/**
 * Created by jennifermcginty on 5/8/17.
 */
public class CloneCode {

    class Human implements Cloneable {
        String name;

        public Human(String name){
            this.name = name;
        }

        public Human clone() throws CloneNotSupportedException{
            return (Human)super.clone();
        }





    }
}
