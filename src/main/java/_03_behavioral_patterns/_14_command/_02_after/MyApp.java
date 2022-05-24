package _03_behavioral_patterns._14_command._02_after;

import _03_behavioral_patterns._14_command._01_before.Light;

public class MyApp {

    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new LightOnCommand(new Light()));
        myApp.press();
    }
}
