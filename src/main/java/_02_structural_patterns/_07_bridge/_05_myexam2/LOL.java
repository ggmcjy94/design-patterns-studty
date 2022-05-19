package _02_structural_patterns._07_bridge._05_myexam2;

public class LOL implements PlayGameAPI{
    @Override
    public String playGame(String id, String password) {
        return "LOL Connect complete! [id=" + id + " password=" + password + "]";
    }
}
