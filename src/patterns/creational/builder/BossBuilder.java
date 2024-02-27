package patterns.creational.builder;

import java.util.HashSet;
import java.util.Set;

public class BossBuilder {
    private String name;
    private int hp;
    private int damage;
    private String specialAbility;
    private Set<String> optionalSkill;
    public BossBuilder(String name){
        this.name = name;
        optionalSkill = new HashSet<>();
    }

    public BossBuilder setHp(int hp){
        this.hp = hp;
        return this;
    }

    public BossBuilder setDamage(int damage){
        this.damage = damage;
        return this;
    }
    public BossBuilder setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
        return this;
    }

    public BossBuilder addOptionalSkill(OptionalSkill skill) {
        this.optionalSkill.add(skill.toString());
        return this;
    }

    public Boss build() {
        return new Boss(this);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public Set<String> getOptionalSkill() {
        return optionalSkill;
    }
}
