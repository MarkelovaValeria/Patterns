package patterns.structural.bridge;

public class characterP implements Phrase {
    @Override
    public void speak(String phrase) {
        System.out.println(phrase);
    }
}
