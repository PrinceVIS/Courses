package immutable;

public final class BoardGame {
    private final String name;
    private final String playTime;
    private final PlayersCount playersCount;

    public BoardGame(String name, String playTime, PlayersCount playersCount) {
        this.name = name;
        this.playTime = playTime;
        PlayersCount clonePlayersCount = new PlayersCount();
        clonePlayersCount.setMinPlayers(playersCount.getMinPlayers());
        clonePlayersCount.setMaxPlayers(playersCount.getMaxPlayers());
        this.playersCount = clonePlayersCount;
    }
}
