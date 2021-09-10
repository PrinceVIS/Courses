package immutable;

public final class BoardGame {
    private final String name;
    private final String playTime;

    public BoardGame(String name, String playTime) {
        this.name = name;
        this.playTime = playTime;
    }

    public BoardGame setName(String name) {
    return new BoardGame(name, playTime);
    }

    public BoardGame setPlayTime(String playTime) {
        return new BoardGame(name, playTime);
    }
}
