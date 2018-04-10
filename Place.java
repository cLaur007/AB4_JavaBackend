import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Place {
    private String Name;
    private Integer PricePerDay;
    private Integer rating;
    
    private ArrayList<Activity> Activities;
    
    public Place(String n, Integer p, Activity[] acts) {
        // TODO Auto-generated constructor stub
        setName(n);
        setPrice(p);
        Activities = new ArrayList<Activity>();
        // we have to fill the Activities array for this place
        for (int i = 0; i < acts.length; i++) {
            Activities.add(acts[i]);
        }
        Random rand = new Random();
        int  rat = rand.nextInt(50) + 1;
        rating = rat;
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
    
    public Integer getRating() {
        return rating;
    }
    
    // Also some set functions could be very usefull sometimes
    public void setName(String n) {
        Name = n;
    }
    
    public void setPrice(Integer p) {
        PricePerDay = p;
    }
    // The user can add himself as many activities as he wants
    // using this method
    public void addActivity(Activity a) {
        Activities.add(a);
    }
}
