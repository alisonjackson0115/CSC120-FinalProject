import java.util.Scanner;

public class Camera {
    
    private String condition;
    private int batteryLevel;
    public boolean takePhoto;


public Camera(String condition, int batteryLevel, boolean takePhoto) {
    this.condition = "good";
    this.batteryLevel = 100;
    this.takePhoto = false;

}

public void takePhoto() {
    System.out.println("You wander around until you find the location of your photo quest.");
    System.out.println("Would you like to take your photo?");
    }
    
}
