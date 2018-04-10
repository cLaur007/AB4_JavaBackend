import java.util.ArrayList;
import java.util.Collections;

public class Country {
    private String Name;
    private ArrayList<City> Cities;
    private ArrayList<String> food;
    private ArrayList<String> habits;
    
    public Country(String n) {
        // TODO Auto-generated constructor stub
        setName(n);
        Cities = new ArrayList<City>();
        food = new ArrayList<String>();
        habits = new ArrayList<String>();
    }
    
    public String getName() {
        return Name;
    }
    
    public ArrayList<City> getCities() {
        return Cities;
    }
    
    public void setName(String n) {
        Name = n;
    }
    // The user can add places using this method
    public void addCity(City c) {
        Cities.add(c);
        Collections.sort(Cities);
    }

}
