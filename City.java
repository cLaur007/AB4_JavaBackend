import java.util.ArrayList;

public class City {
    private String Name;
    private ArrayList<Place> Places;
    
    public City(String n) {
        // TODO Auto-generated constructor stub
        setName(n);
        Places = new ArrayList<Place>();
    }
    
    public String getName() {
        return Name;
    }
    
    public ArrayList<Place> getPlaces() {
        return Places;
    }
    
    public void setName(String n) {
        Name = n;
    }
    // The user can add places using this method
    public void addPlace(Place p) {
        Places.add(p);
    }
}
