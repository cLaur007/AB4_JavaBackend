import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
         * I'm just constructing a mini data base for testing
         */
        Country[] Countries = new Country[]{new Country("Romania"), new Country("USA"), new Country("England")};
        City[] Cities = new City[]{new City("Los Angeles"), new City("San Franciso"), new City("New York"),
                new City("Las Vegas"), new City("Chicago")};
        
        Activity acts[] = {Activity.Baseball, Activity.Bicycling};
        Activity acts2[] = {Activity.Bowling, Activity.Swimming};
        Activity acts3[] = {Activity.Football, Activity.Pool};
        Place[] Places = new Place[]{new Place("OnePlaceLA", 100, acts), new Place("OnePlaceSanF", 80, acts2),
                new Place("OnePlaceNY", 95, acts3), new Place("OnePlaceLV", 140, acts),
                new Place("OnePlaceCH", 55, acts2)};
        int i = 0;
        for (City o : Cities) {
            o.addPlace(Places[i]);
            Countries[1].addCity(o);
            i++;
        }
        /*
         * 
         * 
         */
        System.out.println("Welcome to our traveling program !");
        System.out.println("We have some offers for you, Please tell us where exactly would you like to go");
        
        for (Country it : Countries) {
            System.out.println(it.getName());
        }
        Scanner sn = new Scanner(System.in);
        String countryName = sn.next();
        for (Country c : Countries) {
            if (c.getName().equals(countryName)) {
                System.out.println("Very good decision, " + c.getName() + " is a beautifull country");
                System.out.println("Look: Those are top 5 cities from this country : ");
                for (City o : c.getCities()) {
                    System.out.println(o.getName() + " " + o.getRating() + " out of 50");
                    System.out.println("        " + "This is the most unexpensive place that you can go: " +
                    o.getPlaces().get(0).getName());
                    System.out.println("        " + "You can stay here for 10 days spending just " +
                    o.getPlaces().get(0).getPrice() * 10 + " $");
                }
                break;
            }
        }
        
    }
}
