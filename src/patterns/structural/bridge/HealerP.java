package patterns.structural.bridge;

public class HealerP implements Phrase {

    @Override
    public void speak(String phrase) {
        System.out.println(phrase);
    }
}
