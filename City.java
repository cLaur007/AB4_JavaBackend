import java.util.ArrayList;
import java.util.Collections;

public class City implements Comparable<City>{
    private String Name;
    private ArrayList<Place> Places;
    private Float rating;
    
    private void CalculateRating() {
        /*
        rating = 0f;
        for (int i = 0; i < Places.size(); i++) {
            rating += Places.get(i).getRating();
        }
        rating /= Places.size();
        That was an O(n) implementation but we can do better :
        */
        // We have to add just the latest rating so we can do sth like that:
        rating *= (Places.size() - 1);
        rating += Places.get(Places.size() - 1).getRating();
        rating /= Places.size();
        
    }
    
    public City(String n) {
        // TODO Auto-generated constructor stub
        setName(n);
        Places = new ArrayList<Place>();
        rating = 0f;
    }
    
    public String getName() {
        return Name;
    }
    
    public ArrayList<Place> getPlaces() {
        return Places;
    }
    
    public Float getRating() {
        return rating;
    }
    
    public void setName(String n) {
        Name = n;
    }
    // The user can add places using this method
    public void addPlace(Place p) {
        Places.add(p);
        CalculateRating();
        Collections.sort(Places);
        // after every place added we have to recalculate the rating for this city
    }

    @Override
    public int compareTo(City o) {
        if (rating < o.rating) {
            return 1;
        } else {
            return -1;
        }
    }
}
