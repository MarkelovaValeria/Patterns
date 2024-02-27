package patterns.creational.builder;

import java.util.Set;

public class Boss {
    private String name;
    private int hp;
    private int damage;
    private String specialAbility;
    private Set<String> optionalSkill;

    public Boss(BossBuilder builder) {
        this.name = builder.getName();
        this.hp = builder.getHp();
        this.damage = builder.getDamage();
        this.specialAbility = builder.getSpecialAbility();
        this.optionalSkill = builder.getOptionalSkill();

    }

    @Override
    public String toString() {
        return "Name - " + name + "\nHp - " + hp + "\nDamage - " + damage + "\nSpecial ability - " + specialAbility + "\nOptional skill - " + optionalSkill.toString();
    }
}
