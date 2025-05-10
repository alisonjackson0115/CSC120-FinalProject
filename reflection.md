 Design justification and reflection:

 For this project, I designed an object-oriented text based game set in an alternate universe where a deadly virus called the Fever has killed off nearly an entire city's population. As a photographer, the main player's objective is to travel to various locations throughout the city, completing photo assignments and gaining supplies points that will eventually allow them to flee the city to safety. As an object-oriented game, I primarily envisioned my game operating via the following classes:
    - A camera class that controlled whether a photo was taken
    - A player class that keeps track of the player's supplies points
    - A player location class that keeps track of the player's movement
    - A location class that initializes the coordinates of the city's locations in a hashtable
    - A building class that holds information regarding the characteristics for each building in the city
    - A gameplay class that organizes the text-based interface and calls methods to manage the actual gameplay

The overall structure of my game consisted of the following pattern: a player would start the game, receive a quest, travel to the location of that quest, make a choice regarding their approach to the quest, take a photo, receive a supplies point, and move on to the next quest. If the player entered the wrong direction of travel or selected the wrong choice during a quest (like choosing the stairs instead of the elevator), they would receive an error message and have to re-enter the correct answer to proceed with the game. I used a gameloop to allow gameplay to continue when the player entered an incorrect answer, and this also allowed me to inform the player whether or not they had succeeded upon reaching the end of the game. I also planned to have the last quest be more high-stakes than the rest, as the player would lose all of their supplies points and have to restart the game if their final selection was incorrect. 

As a text-based game with the ability for players to choose their direction of movement and approach to tasks, I primarily made use of the Scanner method and if/then statements. Unfortunately, I was unable to successfully call and implement all of these methods in the main of my Gameplay class (as I encountered a lot of bugs), but I initialized all of the classes, attributes, and methods to the best of my ability. 

When I began the project, my overall approach was to 

 Additional Reflection:
 
 
 
 - What was your **overall approach** to tackling this project?
 - What **new thing(s)** did you learn / figure out in completing this project?
 - Is there anything that you wish you had **implemented differently**?
 - If you had **unlimited time**, what additional features would you implement?
 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.