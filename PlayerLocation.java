public class PlayerLocation extends Location {

    public int x_coord;
    public int y_coord;

    public PlayerLocation(int x_coord, int y_coord) {
        super(x_coord, y_coord);

    }

    public void moveLeft() {
        x_coord -= 10;
        if ((x_coord > 10) || (x_coord < -10)) {
            System.out.println("Woops, you're beyond city limits! Enter a different direction");
    
        }
    }
    
    public void moveRight() {
        x_coord += 10;
        if ((x_coord > 10) || (x_coord < -10)) {
            System.out.println("Woops, you're beyond city limits! Enter a different direction");
        }
    }
    
    public void moveUp() {
        y_coord += 10;
        if ((y_coord > 10) || (y_coord < 0)) {
            System.out.println("Woops, you're beyond city limits! Enter a different direction");
        }
    }
    
    public void moveDown() {
        y_coord -= 10;
        if ((y_coord > 10) || (y_coord < 0)) {
            System.out.println("Woops, you're beyond city limits! Enter a different direction");
        }
    }

    public void getLocation() {
        if ((x_coord == 0) || (y_coord == 0)) {
            System.out.println("You are at Home");
        } else if ((x_coord == 10) || (y_coord == 0)) {
            System.out.println("You are at the Greenhouse");
        } else if ((x_coord == -10) || (y_coord == 0)) {
            System.out.println("You are at the Hospital");
        } else if ((x_coord == 0) || (y_coord == 10)) {
            System.out.println("You are at the City Hall");
        } else if ((x_coord == 10) || (y_coord == 10)) {
            System.out.println("You are at the Skyscraper");
        } else if ((x_coord == -10) || (y_coord == 10)) {
            System.out.println("You are at the Mall");
        }

    }


    public void directionChoices() {
        System.out.println("To move throughout the city, type in one of the following directions:");
        System.out.println("------------------");
        System.out.println("up");
        System.out.println("down");
        System.out.println("left");
        System.out.println("right");
        System.out.println("--------------------");
        }

    public static void main(String[] args) {

        PlayerLocation myLocation = new PlayerLocation(0, 0);
        myLocation.getLocation();

    }

}

    


