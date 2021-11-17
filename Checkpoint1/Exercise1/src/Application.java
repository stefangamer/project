import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 480);
    }

    public void run() {
        int number = SaxionApp.getRandomValueBetween(1, 21);
        int guess = 0;
        int i = 0;
        boolean gameOver = false;

        SaxionApp.printLine("Guess the number <= 20, you have 7 guesses left.");

        while (i < 7 && !gameOver) {
            guess = SaxionApp.readInt();
            if (guess == 69 || guess == 420) {
                SaxionApp.printLine("Nice. You cheesed it.");
                gameOver = true;
            } else if (guess == 42) {
                SaxionApp.printLine("No you dumbass, that's the answer to life universe and everything.");
                SaxionApp.printLine("You have 7 guesses left.");
                i++;
            } else {
                if (guess == number) {
                    SaxionApp.printLine("You won! The number was: " + number + ". It took you " + (i + 1) + " guesses.");
                    gameOver = true;
                } else {
                    if (i < 6) {
                        SaxionApp.printLine("Try again. You have " + (6 - i) + " guesses left.");
                    }
                    i++;
                }
            }
        }

        if (!gameOver) {
            SaxionApp.printLine("Game Over. The number was " + number + ".");
        }
    }

}