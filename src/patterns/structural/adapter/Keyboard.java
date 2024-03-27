package patterns.structural.adapter;

public class Keyboard implements Controller{

    @Override
    public void up() {
        System.out.println("up arrow");
    }

    @Override
    public void down() {
        System.out.println("down arrow");
    }

    @Override
    public void left() {
        System.out.println("left arrow");
    }

    @Override
    public void right() {
        System.out.println("right arrow");
    }

    @Override
    public void action() {
        System.out.println("button E");
    }
}
