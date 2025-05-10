import java.util.Random;
import java.util.Hashtable;

public class Building {
    
    public String name;
    private int numFloors;
    private int currentFloor;    
    private boolean hasElevator;
    public boolean insideBuilding;
    public int riskLevel;
    
    
 
    public Building(String name, int numFloors, int currentFloor, boolean hasElevator, boolean insideBuilding, int riskLevel) {
        this.name = name;
        this.numFloors = numFloors;
        this.currentFloor = 1;
        this.hasElevator = true;
        this.insideBuilding = false;
        this.riskLevel = riskLevel;
        

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


public static void main(String[] args) {
    Building Home = new Building();
    Home.numFloors = 4;

}

}
