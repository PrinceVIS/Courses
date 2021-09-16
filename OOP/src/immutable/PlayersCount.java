package immutable;

public class PlayersCount {
    private int minPlayers;
    private int maxPlayers;

    public PlayersCount() {
    }

    public PlayersCount(int minPlayers, int maxPlayers) {
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }


    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String toString() {
        return minPlayers + " - " + maxPlayers + " players";
    }
}
