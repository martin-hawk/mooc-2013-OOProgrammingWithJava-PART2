
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class RingingCentre {

    private Map<Bird, List<String>> center;

    public RingingCentre() {
        this.center = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (this.center.containsKey(bird)) {
            this.center.get(bird).add(place);
        } else {
            List<String> placeList = new ArrayList<String>();
            placeList.add(place);
            this.center.put(bird, placeList);
        }
    }

    public void observations(Bird bird) {
        if (this.center.containsKey(bird)) {
            System.out.println(bird + " observations: " + this.center.get(bird).size());
            for (String string : this.center.get(bird)) {
                System.out.println(string);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
    }
}
