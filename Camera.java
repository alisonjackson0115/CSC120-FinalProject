public class Camera {
    
    private String condition;
    private int batteryLevel;
    public String playerLocation;
    public String questLocation;
    public boolean takePhoto;
    public boolean uploadPhoto;

public Camera(String condition, int batteryLevel, String location, String questlocation, boolean takePhoto, boolean uploadPhoto) {
    this.condition = "good";
    this.batteryLevel = 100;
    this.playerLocation = "Home";
    // this.questLocation = questLocation;
    this.takePhoto = false;
    this.uploadPhoto = false;
}

public void takePhoto() {
    if (questLocation.equals(playerLocation)) {
        takePhoto = true;
    }
    
}

public void uploadPhoto() {
    if (takePhoto = true) {
        uploadPhoto = true;
    }
}
 
}
