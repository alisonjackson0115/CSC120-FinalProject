import java.util.Scanner;
import java.lang.Exception;

public class Gameplay {

    int numSupplies = 0;

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

    public void moveAround() {
        System.out.println("------------------");
            System.out.println("up");
            System.out.println("down");
            System.out.println("left");
            System.out.println("right");
            System.out.println("--------------------");
    }

    public void startGame() {

        System.out.println("Ready to play? Enter 'yes' to begin");
        Scanner gameScanner = new Scanner(System.in);
        String startChoice;
        startChoice = gameScanner.nextLine();

        if (startChoice.equals("yes")) {
            System.out.println("Ok, let's set the scene.");
            System.out.println("You are one of the only survivors after a mysterious illness called the Fever wipes out nearly your entire city.");
            System.out.println("In order to leave the city, you must travel to different destinations, collecting supplies points by taking photos.");
            System.out.println("Right now, you are at Home");
            System.out.println("Enter 'go' to receive your first quest");
            
            String questOneReady = gameScanner.nextLine();
            if (questOneReady.equals("go")) {
                questOne();
            }


        } else { 
            System.out.println("I didn't understand that, try again");
            //throw RuntimeException("I'm not sure what that means. Type 'yes' to receive your first quest.");

        }

    } 

    public void questOne() {
        System.out.println("Your first photo quest is the City Greenhouse, which is known for its beautiful sunrises.");
        System.out.println("The greenhouse has a risk level of 1 because it is not known for inviting danger, but proceed with caution.");
        System.out.println("To earn your supplies point, enter the greenhouse and take a photo.");
        System.out.println("Do you accept the challenge? Type 'yes' to continue.");
        
        Scanner questOneScanner = new Scanner(System.in);
        String questOneChoice = questOneScanner.nextLine();

        if (questOneChoice.equals("yes")) {
            System.out.println("To move throughout the city and find the City Greenhouse, type in one of the following directions:");
            moveAround();
        
            String questOneDirection = questOneScanner.nextLine();
            if (questOneDirection.equals("right")) {
                System.out.println("You are at the City Greenhouse! Would you like to enter? Type 'yes.'");
                String questOneEnter = questOneScanner.nextLine();
                if (questOneEnter.equals("yes")) {
                    System.out.println("You are now inside the Greenhouse.");
                    System.out.println("You wander around until you find the pond—the location of your photo quest.");
                    System.out.println("Would you like to take your first photo?");

                    String questOnePhoto = questOneScanner.nextLine();
                    if (questOnePhoto.equals("yes")) {
                        addSupplies();
                        System.out.println("Are you ready for your second quest?");

                        String questTwoReady = questOneScanner.nextLine();
                        if (questTwoReady.equals("yes")) {
                            questTwo();
                        }

                    }
                }

            } else {

            }
         
        }

    }

    public void questTwo() {
        System.out.println("Your second photo quest is at the top of the City's tallest Skyscraper, which is 50 stories tall!");
        System.out.println("This quest has a risk level of 2 because of the dimly lit, unreliable elevator.");
        System.out.println("However, 50 flights of stairs will quickly drain your energy, which is important to keep up during your quests.");
        System.out.println("Do you accept the challenge?");

        Scanner questTwoScanner = new Scanner(System.in);
        String questTwoAccept = questTwoScanner.nextLine();

        while (true) {
            if (questTwoAccept.equals("yes")) {
            System.out.println("Enter a direction to move throughout the city.");
            System.out.println("Remember you are currently at the City Greenhouse. ");
            moveAround();

            String questTwoDirection = questTwoScanner.nextLine();

            if (questTwoDirection.equals("up")) {
                System.out.println("You made it to the skyscraper!");
                System.out.println("How will you get to the roof?");
                System.out.println("Type in “stairs” or “elevator” to choose your route.");

                String questTwoChoice = questTwoScanner.nextLine();
                for (questTwoChoice.equals("elevator")) {
            
                    System.out.println("You're in luck!");
                    System.out.println("The elevator is running for the first time in weeks and it looks like you're all alone in the City Skyscraper.");
                    System.out.println("Now that you've made it to the top floor, would you like to take your picture?");
                    
                    String questTwoPhoto = questTwoScanner.nextLine();
                    if (questTwoPhoto.equals("yes")) {
                        addSupplies();

                        System.out.println("Are you ready for your third quest?");

                        String questThreeReady = questTwoScanner.nextLine();
                        if (questThreeReady.equals("yes")) {
                            questThree();
                        }
                    }


                } else if {
                    System.out.println("you can't take the stairs. try again");


                }
            }
            
                }


            }
        }


    }

    public void questThree() {
        System.out.println("Alright, your third photo quest is the City Hall, with a risk level of 3.");
        System.out.println("The infrastructure is decaying and potentially dangerous survivors may be looming, so enter at your own risk.");
        System.out.println("Do you accept the challenge?");
        
        Scanner questThreeScanner = new Scanner(System.in);
        String questThreeAccept = questThreeScanner.nextLine();

        if (questThreeAccept.equals("yes")) {
            System.out.println("Enter a direction to move throughout the city.");
            System.out.println("Remember you are currently at the City Skyscraper. ");
            moveAround();

            String questThreeDirection = questThreeScanner.nextLine();
            if (questThreeDirection.equals("left")) {
                System.out.println("You made it to the City Hall!");
                System.out.println("Which entrance would you like to go through?");
                System.out.println("A group of other survivors is known to hang around the front entrance, but the back entrance has some rickety stairs.");
                System.out.println("Enter 'front' or 'back' to make your choice.");

                String questThreeFirstChoice = questThreeScanner.nextLine();
                if (questThreeFirstChoice.equals("front")) {

                    System.out.println("Phew, the survivors are not around today so the coast is clear!");
                    System.out.println("Would you like to take the elevator or the stairs?");
                    System.out.println("Like the City Skyscraper, the power for the elevator comes and goes.");
                    System.out.println("Enter 'stairs' or 'elevator' to make your choice. ");

                    String questThreeSecondChoice = questThreeScanner.nextLine();
                    while (questThreeSecondChoice.equals("stairs")) {

                        System.out.println("Good choice!");
                        System.out.println("The power is currently out and the elevator isn't running.");
                        System.out.println("Would you like to take your picture now?");

                        String questThreePhoto = questThreeScanner.nextLine();
                        if (questThreePhoto.equals("yes")) {
                            addSupplies();

                            System.out.println("Are you ready for your fourth quest?");

                            String questFourReady = questThreeScanner.nextLine();
                            if (questFourReady.equals("yes")) {
                                questFour();
                            } 

                        }

                    }

                }

            }


                // } else {
                //     if (questThreeSecondChoice.equals("elevator")) {
                //         System.out.println("try again");
                //         String questThreeSecondCorrectChoice = questThreeScanner.nextLine();
                // }

                // }

    public void questFour() {
        System.out.println("Your fourth quest is in the City's abandoned shopping mall.");
        System.out.println("Given the amount of shelter it provides, the mall is almost always occupied by other survivors and its risk level is 4.");
        System.out.println("Sometimes they are harmless and will let you go about your business, but it's not uncommon for a group of survivors to try and steal your supplies.");
        System.out.println("You need to approach with caution and use your intuition to navigate this quest.");
        System.out.println("Are you ready to head over to the City Mall?");

        Scanner questFourScanner = new Scanner(System.in);
        String questFourMove = questFourScanner.nextLine();

        if (questFourMove.equals("yes")) {
            System.out.println("Enter a direction to move throughout the city.");
            System.out.println("Remember you are currently at the City Hall. ");
            moveAround();

            String questFourDirection = questFourScanner.nextLine();
            if (questFourDirection.equals("left")) {
                System.out.println("You made it to the City Mall!");
                System.out.println("You can already see a group of survivors milling around outside the mall's entrance");
                System.out.println("Do you take your chances and try to interact with them, or will you head for the other entrance?");
                System.out.println("Enter 'interact' or 'move' to make your decision.");

                    String questFourFirstChoice = questFourScanner.nextLine();
                    if (questFourFirstChoice.equals("move")) {

                        System.out.println("There's a reason why they say you should trust your gut.");
                        System.out.println("It turned out those survivors would've tried to take your supplies points away.");
                        System.out.println("As you enter the mall through the back way, you see a familiar figure among another group of survivors.");
                        System.out.println("Will you approach them or try to hide from their view?");
                        System.out.println("Enter 'approach' or 'hide' to make your decision.");

                        String questFourSecondChoice = questFourScanner.nextLine();
                        if (questFourSecondChoice.equals("approach")) {

                            System.out.println("What are the odds that one of those survivors was your elementary school teacher?");
                            System.out.println("They informed the rest of their group that you can be trusted, and they gave you advice for how to complete your quest without getting caught by other groups.");
                            System.out.println("You head to your photo location and find the perfect shot.");
                            System.out.println("Are you ready to take your photo?");

                            String questFourPhoto = questFourScanner.nextLine();
                            if (questFourPhoto.equals("yes")) {
                                addSupplies();

                                System.out.println("Are you ready for your fifth and final quest?");

                                String questFiveReady = questFourScanner.nextLine();
                                if (questFiveReady.equals("yes")) {
                                    questFive();
                                } 
                            }

                        }



                    }

                }
            }
            

            }

    public void questFive() {
        System.out.println("Very brave!");
        System.out.println("Your fifth and final photo assignment is in the abandoned City Hospital and quarantine zone.");
        System.out.println("For this quest, it's not the survivors you have to worry about—it's the Fever.");
        System.out.println("This location still harbors contagious Fever particles and one misstep can cost you all of your supplies points, which gives this quest a risk level of 5.");
        System.out.println("However, completing this task means you can leave the city and find the safety you've been seeking for so long.");
        System.out.println("Would you like to head to the City Hospital and try your hand at this challenge?");

        Scanner questFiveScanner = new Scanner(System.in);
        String questFiveMove = questFiveScanner.nextLine();

            if (questFiveMove.equals("yes")) {
                System.out.println("Enter a direction to move throughout the city.");
                System.out.println("Remember you are currently at the City Mall. ");
                moveAround();

                String questFiveDirection = questFiveScanner.nextLine();
                if (questFiveDirection.equals("down")) {
                    System.out.println("You've arrived at the City Hospital.");
                    System.out.println("For your first decision, you must choose between entering through the hospital entrance or the quarantine entrance.");
                    System.out.println("To select your path, enter 'hospital' or 'quarantine.'");

                    String questFiveFirstChoice = questFiveScanner.nextLine();
                    if (questFiveFirstChoice.equals("hospital")) {

                        System.out.println("This was the safer choice!");
                        System.out.println("But your quest is far from complete.");
                        System.out.println("Will you put on one of the hazmat suits you see laying around?");
                        System.out.println("This suit might keep you safe from exposure, or it could be infected with the Fever.");
                        System.out.println(" To choose whether or not you will put on the suit, enter 'yes' or 'no.'");

                        String questFiveSecondChoice = questFiveScanner.nextLine();
                        if (questFiveSecondChoice.equals("yes")) {

                            System.out.println("That was risky, but it paid off!");
                            System.out.println("You can now travel to your photo destination without fear of exposure.");
                            System.out.println("Would you like to take your final photo?");

                            String questFivePhoto = questFiveScanner.nextLine();
                            if (questFivePhoto.equals("yes")) {
                                addSupplies();
                                System.out.println("Congratulations, you have collected all of the supplies points needed to leave the city!");
                                System.out.println("The last thing you need to do is return home.");
                                System.out.println("");
                                System.out.println("");
                                moveAround();

                                String questFiveHome = questFiveScanner.nextLine();
                                if (questFiveHome.equals("right")) {
                                    System.out.println("You made it home!");
                                    System.out.println("Before long, you have all of your belongings packed and you have enough supplies to last the entire trip to safety!");
                                    System.out.println("Safe travels, and don't forget to document your trip for the blog!");
                                    System.out.println("Play again?");

                                    String playAgain = questFiveScanner.nextLine();
                                    if (playAgain.equals("yes")) {
                                        startGame();
                                    }

                                }


                        }




                    }

                    
                }
            
            }


        }

    }

}


    public static void main(String[] args) {
    

        Player mainPlayer = new Player("Alison", 0, "Home");
        Camera mainCamera = new Camera("Good", 100, "Home", "City Greenhouse", false, false);
        CityMap myMap = new cityMap();
        Building home = new Building("Home", 15, 1, true, true, 0);
        Building greenhouse = new Building("City Greenhouse", 1, 1, false, false, 1);
        Building cityHall = new Building("City Hall", 3, 1, true, false, 3);
        Building hospital = new Building("City Hospital", 5, 1, true, false, 5);
        Building skyscraper = new Building("City Skyscraper", 50, 1, true, false, 2);
        Building mall = new Building("City Mall", 2, 1, true, false, 4);
        
        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("******************");
        System.out.println("WELCOME TO MY GAME");
        System.out.println("******************");

        // Instructions are sometimes helpful
        System.out.println("Enter WIN to win, LOSE to lose, anything else to continue playing.");

        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            // ************************************************
            // The stuff that happens in your game will go here
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            Gameplay viral;
            viral = new Gameplay();
            viral.startGame();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            //  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
            if (userResponse.equals("WIN") || userResponse.equals("LOSE")) {
                stillPlaying = false;
            }
        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping conditions
        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("Better luck next time.");
        }


}

}

}



            

        
    

