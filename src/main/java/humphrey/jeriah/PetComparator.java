package humphrey.jeriah;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by jeriahhumphrey on 2/2/17.
 */
public class PetComparator implements Comparator <Pet> {




    @Override
    public int compare(Pet p1, Pet p2) {
        int compareValue=0;
        if(p1.getClass().getName().compareToIgnoreCase(p2.getClass().getName())>0){
            compareValue= 1;
        }
        else if (p1.getClass().getName().compareToIgnoreCase(p2.getClass().getName())<0){
            compareValue= -1;
        }
        else if (p1.getClass().getName().compareToIgnoreCase(p2.getClass().getName())==0){
            if(p1.getName().compareToIgnoreCase(p2.getName())>0){
                compareValue=1;
            }
            else if (p1.getName().compareToIgnoreCase(p2.getName())<0){
                compareValue=-1;
            }
            else{
                compareValue=0;
            }
        }
        return compareValue;
    }
}
