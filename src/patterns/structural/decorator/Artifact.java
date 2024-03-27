package patterns.structural.decorator;

public class Artifact extends Character{
    Character character;
    public Artifact(Character character) {
        super(character.damage, character.dexterity, character.intelligence, character.magical_Potential, character.name+", artifact");
        this.character = character;
    }

    @Override
    public int showDamage() {
        return character.damage - 2;
    }

    @Override
    public int showDexterity() {
        return character.dexterity + 3;
    }

    @Override
    public int showIntelligence() {
        return character.intelligence;
    }

    @Override
    public int showMagic() {
        return character.magical_Potential + 2;
    }
}
