import java.util.Random;
import java.util.Hashtable;

public class Building {
    
    public String name;
    private int numFloors;
    private int currentFloor;    
    private boolean hasElevator;
    public boolean insideBuilding;
    public int riskLevel;
    private Hashtable<String, Building> city;
    
    // whether there is a north neighbor by the name north
    
 
    public Building(Hashtable<String, Building>()) {
        this.name = name;
        this.numFloors = numFloors;
        this.currentFloor = 1;
        this.hasElevator = true;
        this.insideBuilding = false;
        this.riskLevel = riskLevel;
        this.city = new Hashtable<String, Building>();
        

    }

    public void enter() {
        insideBuilding = true;
        System.out.println("You have entered the building");
    }

    public void goUp() {
        if (hasElevator = true && currentFloor != numFloors) {
            currentFloor = numFloors;
            System.out.println("You are now on floor" + currentFloor);
        } else {
            System.out.println("This building only has one floor. Try a different action");
        }

    }

    public void goDown() {
        if (currentFloor == numFloors) {
            currentFloor = 1;
            System.out.println("You are now on floor" + currentFloor);
        } else {
            System.out.println("You are on the ground floor. Try a different action.");
        }
    }

    public void exit() {
        if (insideBuilding = true) {
            insideBuilding = false;
            System.out.println("You have exited the building");
        }
        
    }

    public void locationIntro() {
        if () {

        } else if () {


        }
    }

    public String getNeighbor(String direction) {
        this.myMap.get(direction);
        return direction;
        myMap.
        // get building from the hashtable (can be null)
    }

    public void makeCity() {
        
    }

public static void main(String[] args) {
    Building Home = new Building();
    Home.numFloors = 4;
}

}
