import java.util.Hashtable;

public class Location {

        public int x_coord;
        public int y_coord;
        public Hashtable<String, Location> myMap;
    
        public Location(int x_coord, int y_coord) {
            this.x_coord = x_coord;
            this.y_coord = y_coord;
        }

    
        
    
        public static void main(String[] args) {
    
            Location home = new Location(0, 0);
            Location greenhouse = new Location(10, 0);
            Location mall = new Location(-10, -10);
            Location hospital = new Location(-10, 0);
            Location skyscraper = new Location(10, 10);
            Location cityHall = new Location(0, 10);
    
            Hashtable<String, Location>myMap = new Hashtable<String, Location>();
    
            myMap.put("Home", home);
            myMap.put("Skyscraper", skyscraper);
            myMap.put("City Hall", cityHall);
            myMap.put("Greenhouse", greenhouse);
            myMap.put("Mall", mall);
            myMap.put("Hospital", hospital);
    
        }
    }