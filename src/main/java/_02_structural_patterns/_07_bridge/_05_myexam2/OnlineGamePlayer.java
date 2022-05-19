package _02_structural_patterns._07_bridge._05_myexam2;

public class OnlineGamePlayer extends GamePlayer{

    private final String id;
    private final String password;

    public OnlineGamePlayer(PlayGameAPI playGameAPI, String id, String password) {
        super(playGameAPI);
        this.id = id;
        this.password = password;
    }

    @Override
    String play() {
        return playGameAPI.playGame(id, password);
    }
}
