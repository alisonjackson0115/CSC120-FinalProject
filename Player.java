public class Player {

    public String name;
    public int numSupplies;


    public Player(String name) {
        this.name = name;
        this.numSupplies = 0;
    }

    public int addSupplies() {
        numSupplies = numSupplies + 1;
        System.out.println("Click! Your photo was taken.");
        System.out.println("You just earned a supplies point!");
        System.out.println("You now have" + " " + numSupplies + " " + "supplies points");
        return numSupplies;
    
    }

    public void loseSupplies() {
        numSupplies = 0;
        System.out.println("You now have" + " " + numSupplies + " " + "supplies points");
    }

    }
