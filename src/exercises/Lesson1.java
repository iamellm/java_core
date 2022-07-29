package exercises;

public class Lesson1 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Alina", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Evgeny", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Andrew", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Andy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Will", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if(playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
