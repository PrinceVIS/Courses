import immutable.BoardGame;
import immutable.PlayersCount;

public class Main {
    public static void main(String[] args) {
        PlayersCount playersCount = new PlayersCount(4,8);
        BoardGame obscurio = new BoardGame("Obscurio", "45-1.30", playersCount);
        System.out.println("playersCount = " + playersCount.toString());
        playersCount.setMinPlayers(5);
        System.out.println("playersCount = " + playersCount.toString());
    }
}
