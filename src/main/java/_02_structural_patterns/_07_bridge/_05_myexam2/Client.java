package _02_structural_patterns._07_bridge._05_myexam2;

public class Client {

    public static void main(String[] args) {
        PlayGameAPI LOL = new LOL();
        String id = "Ashe";
        String password = "bob";

        GamePlayer gamePlayer = new OnlineGamePlayer(LOL, id, password);
        System.out.println("gamePlayer = " + gamePlayer.play());
    }
}
