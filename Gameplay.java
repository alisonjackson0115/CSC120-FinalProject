import java.util.Scanner;
import java.lang.Exception;

public class Gameplay {

    public void getHelp() {
        Scanner helpScanner = new Scanner(System.in);
        String userResponse = "";
        userResponse = helpScanner.nextLine();
        if (userResponse.equals("help")) {
            System.out.println("You've summoned help!");

        }
    }

    public void acceptChallenge() {
        System.out.println("Do you acccept the next challenge?");

    }  

    public void startGame() {
        System.out.println("You are one of the only survivors after a mysterious illness called the Fever wipes out nearly your entire city.");
        System.out.println("In order to leave the city, you must travel to different destinations, collecting supplies points by taking photos.");

    } 

    public void questOne() {
        System.out.println("Your first photo quest is the City Greenhouse, which is known for its beautiful sunrises.");
        System.out.println("The greenhouse has a risk level of 1 because it is not known for inviting danger, but proceed with caution.");
        System.out.println("To earn your supplies point, enter the greenhouse and take a photo.");
    }

    public void questTwo() {
        System.out.println("Your second photo quest is at the top of the City's tallest Skyscraper, which is 50 stories tall!");
        System.out.println("This quest has a risk level of 2 because of the dimly lit, unreliable elevator.");
        System.out.println("However, 50 flights of stairs will quickly drain your energy, which is important to keep up during your quests.");
    }

    public void whichWayUp() {
        System.out.println("How will you get to the top floor?");
        System.out.println("Type in “stairs” or “elevator” to choose your route.");
        Scanner upScanner = new Scanner(System.in);
        String userResponse = "";
        userResponse = upScanner.nextLine();
        if (userResponse.equals("stairs")) {
            System.out.println("Unfortunately, you don't have enough energy to climb 50 flights of stairs.");
        } else if (userResponse.equals("elevator")) {
            System.out.println("You're in luck!");
            System.out.println("The elevator is running for the first time in weeks and it looks like you're all alone in the City Skyscraper.");
        }
    }

    public void wrongChoice() {
        System.out.println("Please try a different route.");
    }

    public void questThree() {
        System.out.println("Alright, your third photo quest is the City Hall, with a risk level of 3.");
        System.out.println("The infrastructure is decaying and potentially dangerous survivors may be looming, so enter at your own risk.");
        System.out.println("Do you accept the challenge?");
    }
        
    public void whichHallEntrance() {
        System.out.println("Which entrance would you like to go through?");
        System.out.println("A group of other survivors is known to hang around the front entrance, but the back entrance has some rickety stairs.");
        System.out.println("Enter 'front' or 'back' to make your choice.");
        Scanner entranceScanner = new Scanner(System.in);
        String userResponse = "";
        userResponse = entranceScanner.nextLine();
        if (userResponse.equals("front")) {
            System.out.println("Phew, the survivors are not around today so the coast is clear!");
            System.out.println("Would you like to take the elevator or the stairs?");
            System.out.println("Like the City Skyscraper, the power for the elevator comes and goes.");
            System.out.println("Enter 'stairs' or 'elevator' to make your choice. ");
        } else if (userResponse.equals("back")) {
            System.out.println("Oh, no! The stairs have fallen apart and there's no way for you to enter through the back.");
        }
    }

    public void questFour() {
        System.out.println("Your fourth quest is in the City's abandoned shopping mall.");
        System.out.println("Given the amount of shelter it provides, the mall is almost always occupied by other survivors and its risk level is 4.");
        System.out.println("Sometimes they are harmless and will let you go about your business, but it's not uncommon for a group of survivors to try and steal your supplies.");
        System.out.println("You need to approach with caution and use your intuition to navigate this quest.");
        System.out.println("Are you ready to head over to the City Mall?");
    }

    public void mallInteraction() {
        System.out.println("You can already see a group of survivors milling around outside the mall's entrance");
        System.out.println("Do you take your chances and try to interact with them, or will you head for the other entrance?");
        System.out.println("Enter 'interact' or 'avoid' to make your decision.");
        Scanner mallScanner = new Scanner(System.in);
        String userResponse = "";
        userResponse = mallScanner.nextLine();
        if (userResponse.equals("approach")) {
            System.out.println("What are the odds that one of those survivors was your elementary school teacher?");
            System.out.println("They informed the rest of their group that you can be trusted, and they gave you advice for how to complete your quest without getting caught by other groups.");
            System.out.println("You head to your photo location and find the perfect shot.");
        } else if (userResponse.equals("avoid")) {
            System.out.println("It's generally good to be cautious of survivors, but you have no idea how to find the location for your photo.");
            System.out.println("It might be worth talking to them after all");
        }
    }

    public void questFive() {
        System.out.println("Very brave!");
        System.out.println("Your fifth and final photo assignment is in the abandoned City Hospital and quarantine zone.");
        System.out.println("For this quest, it's not the survivors you have to worry about—it's the Fever.");
        System.out.println("This location still harbors contagious Fever particles and one misstep can cost you all of your supplies points, which gives this quest a risk level of 5.");
        System.out.println("However, completing this task means you can leave the city and find the safety you've been seeking for so long.");
    }

    public void hospitalEntrance() {
        System.out.println("For your first decision, you must choose between entering through the hospital entrance or the quarantine entrance.");
        System.out.println("To select your path, enter 'hospital' or 'quarantine.'");
        Scanner hospitalScanner = new Scanner(System.in);
        String userResponse = "";
        userResponse = hospitalScanner.nextLine();
        if (userResponse.equals("hospital")) {
            System.out.println("This was the safer choice!");
            System.out.println("But your quest is far from complete.");
        } else if (userResponse.equals("quarantine")) {
            System.out.println("Woah, that was a close one!");
            System.out.println("As you started to enter the quarantine zone, you noticed a cart of uncapped samples and had second thoughts.");
        }
    }

    public void hazmatChoice() {
        System.out.println("Will you put on one of the hazmat suits you see laying around?");
        System.out.println("This suit might keep you safe from exposure, or it could be infected with the Fever.");
        System.out.println(" To choose whether or not you will put on the suit, enter 'suit' or 'no suit.'");
        Scanner hazmatScanner = new Scanner(System.in);
        String userResponse = "";
        userResponse = hazmatScanner.nextLine();
        if (userResponse.equals("suit")) {
            System.out.println("That was risky, but it paid off!");
            System.out.println("You can now travel to your photo destination without fear of exposure.");
        } else if (userResponse.equals("no suit")) {
            System.out.println("I'm so sorry, but without the hazmat suit you had a dangerous exposure to the Fever.");
            System.out.println("You are required to return your supplies points and enter quarantine.");
            System.out.println("You must begin with the first quest to collect supplies points again.");
            
        }
    }

    public static void main(String[] args) {
    

        Player mainPlayer = new Player("Alison");
        PlayerLocation myLocation = new PlayerLocation(0, 0);
        Camera mainCamera = new Camera("Good", 100, false);
       
        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.

        // Storage for user's responses

        System.out.println("******************");
        System.out.println("Welcome to Viral Influencer! Ready to play? Enter 'go' to begin");
        System.out.println("******************");
        Scanner gameScanner = new Scanner(System.in);
        String userResponse = gameScanner.nextLine();

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            Gameplay viral;
            viral = new Gameplay();
            
            if (userResponse.equals("go")) {
                viral.startGame();
                viral.acceptChallenge();
            }

            if (userResponse.equals("yes")) {
                viral.questOne();
            }
              
            Scanner locationScanner = new Scanner(System.in);
            String userMove = "";
            userMove = locationScanner.nextLine();  

            myLocation.directionChoices();



                if (mainPlayer.numSupplies == 1) {
                viral.acceptChallenge();
                    if (userResponse.equals("yes")) {
                    System.out.println("******************");
                    viral.questTwo();
                    System.out.println("******************");
                }

                if (userMove.equals("left")) {
                    myLocation.moveLeft();
                } else if (userMove.equals("right")) {
                    myLocation.moveRight();
                } else if (userMove.equals("up")) {
                    myLocation.moveUp();
                } else if (userMove.equals("down")){
                    myLocation.moveDown();
                }
                myLocation.getLocation();
                if (userMove.equals("right")) {
                    viral.whichHallEntrance();
                    if (userResponse.equals("back"))
                        viral.wrongChoice();
                    else {
                        mainCamera.takePhoto();
                        if (userResponse.equals("yes")) {
                            mainPlayer.addSupplies();

                        }

                    }
                }

                if (mainPlayer.numSupplies == 2) {
                viral.acceptChallenge();
                    if (userResponse.equals("yes")) {
                    System.out.println("******************");
                    viral.questThree();
                    System.out.println("******************");

                    if (userMove.equals("left")) {
                        myLocation.moveLeft();
                    } else if (userMove.equals("right")) {
                        myLocation.moveRight();
                    } else if (userMove.equals("up")) {
                        myLocation.moveUp();
                    } else if (userMove.equals("down")){
                        myLocation.moveDown();
                    }
                    myLocation.getLocation();
                    if (userMove.equals("left")) {
                        viral.whichWayUp();
                        if (userResponse.equals("stairs"))
                            viral.wrongChoice();
                        else {
                            mainPlayer.addSupplies();
                }
                }
                }
                }

                if (mainPlayer.numSupplies == 3) {
                viral.acceptChallenge();
                    if (userResponse.equals("yes")) {
                    System.out.println("******************");
                    viral.questFour();
                    System.out.println("******************");
                    }
                }

                if (mainPlayer.numSupplies == 4) {
                    viral.acceptChallenge();
                    if (userResponse.equals("yes")) {
                    System.out.println("******************");
                    viral.questFour();
                    System.out.println("******************");
                    }
                }


        

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("exit")) {
                stillPlaying = false;
            }
        } while (stillPlaying); 

        // Tidy up
        gameScanner.close();

        // Once you exit the loop, you may need to deal with various possible stopping conditions
        if (mainPlayer.numSupplies == 5) {
            System.out.println("You made it home!");
            System.out.println("Before long, you have all of your belongings packed and you have enough supplies to last the entire trip to safety!");
            System.out.println("Safe travels, and don't forget to document your trip for the blog!");
        } else { // userResponse.equals("LOSE")
            System.out.println("Better luck next time.");
        }
    }
    }











            

        
    

