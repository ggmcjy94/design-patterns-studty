package _02_structural_patterns._07_bridge._05_myexam2;

public abstract class GamePlayer {
    protected PlayGameAPI playGameAPI;

    public GamePlayer(PlayGameAPI playGameAPI) {
        this.playGameAPI = playGameAPI;
    }

    abstract  String play();


}
