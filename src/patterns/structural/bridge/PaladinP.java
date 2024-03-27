package patterns.structural.bridge;

public class PaladinP implements Phrase {
    @Override
    public void speak(String phrase) {
        System.out.println(phrase);
    }
}
