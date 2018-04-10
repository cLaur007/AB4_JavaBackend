import java.util.ArrayList;
import java.util.List;

public class Place {
    private String Name;
    private Integer PricePerDay;
    
    ArrayList<Activity> Activities;
    
    public Place(String n, Integer p, Activity[] acts) {
        // TODO Auto-generated constructor stub
        setName(n);
        setPrice(p);
        Activities = new ArrayList<Activity>();
        // we have to fill the Activities array for this place
        for (int i = 0; i < acts.length; i++) {
            Activities.add(acts[i]);
        }
    }
    // We have to construct some get functions to access the private fields
    public String getName() {
        return Name;
    }
    
    public Integer getPrice() {
        return PricePerDay;
    }
    
    public ArrayList<Activity> getActivities() {
        return Activities;
    }
    // Also some set functions could be very usefull sometimes
    public void setName(String n) {
        Name = n;
    }
    
    public void setPrice(Integer p) {
        PricePerDay = p;
    }
}
