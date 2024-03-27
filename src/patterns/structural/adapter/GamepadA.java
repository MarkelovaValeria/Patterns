package patterns.structural.adapter;

public class GamepadA implements Controller{
    private Gamepad gamepad;

    public GamepadA(Gamepad gamepad){
        this.gamepad = gamepad;
    }


    @Override
    public void up() {
        this.gamepad.up();
    }

    @Override
    public void down() {
        this.gamepad.down();
    }

    @Override
    public void left() {
        this.gamepad.left();
    }

    @Override
    public void right() {
        this.gamepad.right();
    }

    @Override
    public void action() {
        this.gamepad.action();
    }
}
