package patterns;

import patterns.creational.abstract_factory.A_Factory;
import patterns.creational.abstract_factory.A_FactoryE;
import patterns.creational.abstract_factory.Factory;
import patterns.creational.builder.Boss;
import patterns.creational.builder.BossBuilder;
import patterns.creational.builder.OptionalSkill;
import patterns.creational.factory.CharacterClass;
import patterns.creational.factory.HeroFactory;
import patterns.creational.prototype.EnemyNpc;
import patterns.creational.singleton.CharacterLive;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
        System.out.println("""
                
                0.Exit
                1. Singleton Pattern;;
                2. Factory Pattern;
                3. Abstract Pattern;
                4. Builder Pattern;
                5. Prototype Pattern;""");

            int num = scanner.nextInt();
            if(num==0){
                System.out.println("Exit...");
                break;
            }
            switch (num) {
                case 1 -> {
                    System.out.println("Singleton pattern");
                    System.out.println("Character Lives:");
                    CharacterLive characterLive = CharacterLive.getInstance();
                    System.out.println(characterLive.getLives());
                    System.out.println("""
                            What is this pattern?
                            1. Builder
                            2. Factory
                            3. Singleton""");
                    int q1 = scanner.nextInt();
                    if(q1 == 3){
                        System.out.println("Great!");
                    }
                    else{
                        System.out.println("Oops...");
                        characterLive.loseLife();
                    }
                }
                case 2 -> {
                    scanner.nextLine();
                    System.out.println("""
                            Choose your class:
                            1. Assassin;
                            2. Healer;
                            3. Mage;
                            4. Paladin;""");
                    String characterClass = scanner.nextLine();
                    HeroFactory factoryClass = new HeroFactory();
                    CharacterClass character = factoryClass.getCharacter(characterClass);
                    System.out.println(character.toString());
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.println("""
                            Chose your class:
                            1.Hero;
                            2.Enemy;""");
                    String characterClass = scanner.nextLine();
                    A_Factory aF = new A_Factory();
                    if(characterClass.equals("Hero")){
                        Factory hf = aF.create(A_FactoryE.Hero);
                        CharacterClass ch = hf.getCharacter("Assassin");
                        System.out.println(ch.toString());
                    }
                    else if(characterClass.equals("Enemy")){
                        Factory ef = aF.create(A_FactoryE.Enemy);
                        CharacterClass ch = ef.getCharacter("Spider Rom");
                        System.out.println(ch.toString());
                    }

                }
                case 4 -> {
                    Boss boss = new BossBuilder("OverLord")
                            .setHp(5432)
                            .setDamage(1000)

                            .addOptionalSkill(OptionalSkill.Aura_Symphony)
                            .addOptionalSkill(OptionalSkill.Dark_Vortex)
                            .build();
                    System.out.println(boss.toString());
                }
                case 5 -> {
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    int hp = scanner.nextInt();

                    EnemyNpc enemyNpc1 = new EnemyNpc(name, hp);
                    System.out.println(enemyNpc1.toString());
                    EnemyNpc enemyNpc2 = (EnemyNpc) enemyNpc1.doClone();
                    System.out.println(enemyNpc2.toString());
                }
            }
        }
    }
}
