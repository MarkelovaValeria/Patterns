package patterns.structural.bridge;

public class MageP implements Phrase {
    @Override
    public void speak(String phrase) {
        System.out.println(phrase);
    }
}
