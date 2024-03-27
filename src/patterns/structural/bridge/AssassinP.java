package patterns.structural.bridge;

public class AssassinP implements Phrase {
    @Override
    public void speak(String phrase) {
        System.out.println(phrase);
    }
}
