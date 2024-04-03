package patterns;

import patterns.creational.abstract_factory.A_Factory;
import patterns.creational.abstract_factory.A_FactoryE;
import patterns.creational.abstract_factory.Factory;
import patterns.creational.builder.Boss;
import patterns.creational.builder.BossBuilder;
import patterns.creational.builder.OptionalSkill;
import patterns.creational.factory.*;
import patterns.creational.prototype.EnemyNpc;
import patterns.creational.singleton.CharacterLive;
import patterns.structural.adapter.Controller;
import patterns.structural.adapter.Gamepad;
import patterns.structural.adapter.GamepadA;
import patterns.structural.adapter.Keyboard;
import patterns.structural.bridge.*;
import patterns.structural.composite.LeafEnemy;
import patterns.structural.composite.LeafFood;
import patterns.structural.composite.LeafNPC;
import patterns.structural.composite.Region;
import patterns.structural.decorator.Artifact;
import patterns.structural.decorator.Player;
import patterns.structural.decorator.Shadow_Veil;
import patterns.structural.decorator.Sword;
import patterns.structural.facade.Character;
import patterns.structural.facade.PlayerF;
import patterns.structural.flyweight.Characteristic;
import patterns.structural.newBridge.AssassinLvl;
import patterns.structural.newBridge.CharacterLvl;
import patterns.structural.newBridge.HealerLvl;
import patterns.structural.proxy.PlayerProxy;
import patterns.structural.proxy.ProxyPlayerAction;
import patterns.structural.flyweight.FactoryF;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
        System.out.println("""
                
                Patterns:
                Cretional:
                1. Singleton Pattern;;
                2. Factory Pattern;
                3. Abstract Pattern;
                4. Builder Pattern;
                5. Prototype Pattern;
                
                Structural:
                6. Adapter Pattern;
                7. Composite Pattern;
                8. Proxy Pattern;
                9. Flyweight Pattern;
                10. Facade Pattern;
                11. Bridge Pattern;
                12. Decorator Pattern;""");

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
                    CharacterClass character = factoryClass.getCharacter(CharacterE.valueOf(characterClass));
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
                        CharacterClass ch = hf.getCharacter(CharacterE.Assassin);
                        System.out.println(ch.toString());
                    }
                    else if(characterClass.equals("Enemy")){
                        Factory ef = aF.create(A_FactoryE.Enemy);
                        CharacterClass ch = ef.getCharacter(CharacterE.SpiderRom);
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
                case 6 -> {
                    Gamepad gamepad = new Gamepad();
                    Controller gamepadA = new GamepadA(gamepad);
                    Controller keyboard = new Keyboard();

                    // Використання методів контролерів
                    System.out.println("Using Gamepad A:");
                    gamepadA.up();
                    gamepadA.down();
                    gamepadA.left();
                    gamepadA.right();
                    gamepadA.action();

                    System.out.println("\nUsing Keyboard:");
                    keyboard.up();
                    keyboard.down();
                    keyboard.left();
                    keyboard.right();
                    keyboard.action();
                }
                case 7 -> {
                    Region region = new Region("Desert",5);
                    LeafNPC npc = new LeafNPC("NPC1", 15,3);
                    region.add(npc);
                    region.add(new LeafEnemy("Name1", "Type1", 175, 25));
                    region.add(new LeafFood("Fruit1", "Type1", -1));
                    region.add(new LeafNPC("NPC2", 45, 250));

                    region.display();

                    region.remove(npc);

                    region.display();
                }
                case 8 ->{
                    PlayerProxy player = new PlayerProxy("Yukki");
                    PlayerProxy player2 = new PlayerProxy("Yukki");
                    ProxyPlayerAction login = new ProxyPlayerAction();
                    login.action(player);
                    login.action(player2);
                    login.action(player);
                }
                case 9 ->{
                    Characteristic sword1 = new Characteristic("Sword1", FactoryF.getCharacteristic(140, 5));
                    Characteristic sword2 = new Characteristic("Sword2", FactoryF.getCharacteristic(240, 15));

                    System.out.println("Sword1: \nDamage - " + sword1.getDamage() + "\nLevel - " + sword1.getLevel());
                    System.out.println("Sword2: \nDamage - " + sword2.getDamage() + "\nLevel - " + sword2.getLevel());


                }
                case 10 ->{
                    PlayerF player001 = new PlayerF("Yukki",45);
                    player001.actionHit();
                }
                case 11 -> {
                    AssassinLvl assassinLvl = new AssassinLvl();
                    HealerLvl healerLvl = new HealerLvl();
                    CharacterLvl characterLvl = new CharacterLvl("Yukki", healerLvl);
                    characterLvl.lvlUp();

                    CharacterLvl characterLvl2 = new CharacterLvl("Yukki", assassinLvl);
                    characterLvl2.lvlUp();





                    Phrase Ab = new characterP();
                    Phrase Hb = new characterP();
                    Phrase Mb = new characterP();
                    Phrase Pb = new characterP();

                    Assassin assassin = new Assassin();
                    assassin.setBridge(Ab);
                    assassin.sayPhrase();

                    Healer healer = new Healer();
                    healer.setBridge(Hb);
                    healer.sayPhrase();

                    Mage mage = new Mage();
                    mage.setBridge(Mb);
                    mage.sayPhrase();

                    Paladin paladin = new Paladin();
                    paladin.setBridge(Pb);
                    paladin.sayPhrase();

                }
                case 12 -> {
                    Player player = new Player(3,0,0,2, "Player001");
                    System.out.println(player.toString());

                    Artifact artifact = new Artifact(player);
                    System.out.println(artifact.toString());

                    Sword sword = new Sword(artifact);
                    System.out.println(sword.toString());

                    Shadow_Veil shadowVeil = new Shadow_Veil(sword);
                    System.out.println(shadowVeil.toString());
                }
            }
        }
    }
}
