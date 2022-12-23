Create a package game_app
Create a class Player (you can just copy, what you already have in VolleyballPlayer)
Create a class Game with the fields:
- team1 : array of Player
- nameTeam1: String
- nameTeam2: String
- team2:  array of Player
- location: String (the place for the game)
- date (LocalDate date)
- winner
- finalScore
- method: playGame(String[] actions)
- create a constructor which takes date and location of the game
- create an empty constructor
- create all the getters and setters

In main method the flow is the following:
Create a Game object with the date and location
Scan the names of the team - set them in the game object
Hardcode the names of the players and fill them in the team arrays of the Game object
Print the game info
create an array of actions hardcoded - like (team1 serve; team2 receive; team2 atack in the 4th zone; team1 fail to receive)
make a random method which decides which team won
set final score for the game/winner and print it