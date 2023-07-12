# Number Guessing Game 🎲

A simple number guessing game implemented in Java. The game involves a guesser and three players who try to guess a number. The umpire collects the guesses and determines the winners.

## Table of Contents
- 📜 [Introduction](#introduction)
- 🏗️ [Classes](#classes)
- 🎮 [Game Rules](#game-rules)
- 🕹️ [How to Play](#how-to-play)
- 🤝 [Contributing](#contributing)
- ⚖️ [License](#license)

## Introduction
The Number Guessing Game is a Java program that allows a guesser and three players to participate in a thrilling guessing game. The guesser provides a number, and the players try to guess the same number. The umpire compares the guesses and determines the winners based on the game rules.

## Classes
- 💡 `Guesser`: Represents the guesser in the game. It prompts the user to input a number as their guess.
- 💡 `Player`: Represents a player in the game. It prompts the user to input a number as their guess.
- 💡 `Umpire`: Handles the collection of guesses from the guesser and players, and compares them to determine the winners.
- 💡 `LaunchGame`: The main class that initiates the game by creating an instance of the `Umpire` class and calling its methods.

## Game Rules
- The guesser provides a number as their guess.
- Each player provides a number as their guess.
- The umpire compares the guesser's number with each player's number and determines the winners based on the following rules:
  - If the guesser's number matches a player's number, the player wins.
  - If multiple players guess the same number as the guesser, they both win.
  - If no player guesses the same number as the guesser, the game is lost.

## How to Play
1. 🏁 Run the `LaunchGame` class.
2. 🎯 The guesser will be prompted to enter a number as their guess.
3. 🎯 Each player will be prompted to enter a number as their guess.
4. 🏅 The umpire will compare the guesses and display the winners or inform that the game is lost.

## Contributing
Contributions to this project are welcome! If you have any suggestions, improvements, or bug fixes, please submit a pull request. For major changes, please open an issue first to discuss your ideas.

## License
This project is licensed under the 📜 [MIT License](LICENSE). Feel free to use, modify, and distribute this code as per the terms of the license.
