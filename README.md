# Number Guessing Game

This is a simple number guessing game implemented in Java. The program randomly selects a number between 1 and 100, and the player has 10 attempts to guess the number. After each guess, the program will provide feedback on whether the guess was too low, too high, or correct.

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/NumberGuessingGame.git
    cd NumberGuessingGame
    ```

2. Compile the Java program:
    ```bash
    javac src/NumberGuessingGame.java -d bin
    ```

3. Run the Java program:
    ```bash
    java -cp bin NumberGuessingGame
    ```

## Game Rules

- The program will prompt you to guess a number between 1 and 100.
- You have 10 attempts to guess the correct number.
- After each guess, the program will inform you if your guess was too low, too high, or correct.
- If you guess the number within 10 attempts, you win. Otherwise, the game will reveal the correct number and end.

## Example Output
Guess a number between 1 and 100:
50
Too high!
Guess a number between 1 and 100:
25
Too low!
Guess a number between 1 and 100:
37
Correct! You win! It took you 3 tries.
