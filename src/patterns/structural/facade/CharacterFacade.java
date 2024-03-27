package patterns.structural.facade;

public class CharacterFacade {

    private  CharacterBuilder characterBuilder;

    public CharacterFacade(){
        this.characterBuilder = new CharacterBuilder();
    }

    public void createMage(String name){
        characterBuilder.buildMage(name);
    }

    public void createElf(String name){
        characterBuilder.buildElf(name);
    }

    public Character getCharacter() {
        return characterBuilder.getCharacter();
    }
}
