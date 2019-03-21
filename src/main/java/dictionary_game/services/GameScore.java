package dictionary_game.services;

public class GameScore {

    public static String username;
    public static int score = 0;

    public static void getScore() {
        System.out.println("Username: " + username + " " + "points " + score);
    }
}
