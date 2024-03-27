package patterns.structural.decorator;

public class Shadow_Veil extends Character {
    Character character;
    public Shadow_Veil(Character character) {
        super(character.damage, character.dexterity, character.intelligence, character.magical_Potential, character.name+", shadow veil");
        this.character = character;
    }

    @Override
    public int showDamage() {
        return character.damage;
    }

    @Override
    public int showDexterity() {
        return character.dexterity + 4;
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
