package patterns.structural.facade;

public class CharacterBuilder {

    private Character character;

    public CharacterBuilder(){
        this.character = new Character();
    }
    public void buildMage(String name){
        character.setType("Mage");
        character.setAbility("Magic spells casting");
        character.setAppearance("");
        character.setEquipment("Magic book and scrolls");
        character.setLevel(1);
        character.setName(name);
    }

    public void buildElf(String name){
        character.setType("Healer");
        character.setAppearance("Graceful and elegant");
        character.setAbility("Healing spells and abilities");
        character.setEquipment("");
        character.setLevel(5);
        character.setName(name);
    }

    public Character getCharacter() {
        return character;
    }

}
