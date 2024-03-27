package patterns.structural.decorator;

public class Sword extends Character{
    Character character;
    public Sword(Character character) {
        super(character.damage, character.dexterity, character.intelligence, character.magical_Potential, character.name+", sword");
        this.character = character;
    }

    @Override
    public int showDamage() {
        return character.damage + 3;
    }

    @Override
    public int showDexterity() {
        return character.dexterity - 1;
    }

    @Override
    public int showIntelligence() {
        return character.intelligence;
    }

    @Override
    public int showMagic() {
        return character.magical_Potential;
    }
}
