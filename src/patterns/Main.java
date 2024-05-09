package patterns;

import patterns.behavioral.chainOfResponsibility.Work;
import patterns.behavioral.command.*;
import patterns.behavioral.chainOfResponsibility.*;
import patterns.behavioral.iterator.Iterator;
import patterns.behavioral.iterator.PlayerGroup;
import patterns.behavioral.iterator.PlayerIt;
import patterns.behavioral.mediator.*;
import patterns.behavioral.memento.*;
import patterns.behavioral.observer.*;
import patterns.behavioral.state.CalmState;
import patterns.behavioral.state.Mage1;
import patterns.behavioral.state.ScaredState;
import patterns.behavioral.state.State;
import patterns.behavioral.strategy.AttackStrategy;
import patterns.behavioral.strategy.DefendStrategy;
import patterns.behavioral.strategy.HealStrategy;
import patterns.behavioral.strategy.Strategy;
import patterns.behavioral.templateMethod.*;
import patterns.behavioral.visitor.CitizenVisitor;
import patterns.behavioral.visitor.CityVisitor;
import patterns.behavioral.visitor.MagicDoctor;
import patterns.behavioral.visitor.Visitor;
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
import patterns.structural.facade.PlayerF;
import patterns.structural.flyweight.Characteristic;
import patterns.structural.newBridge.AssassinLvl;
import patterns.structural.newBridge.CharacterLvl;
import patterns.structural.newBridge.HealerLvl;
import patterns.structural.proxy.PlayerProxy;
import patterns.structural.proxy.ProxyPlayerAction;
import patterns.structural.flyweight.FactoryF;

import java.util.ArrayList;
import java.util.List;
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
                12. Decorator Pattern;
                
                Behavioral:
                13. Chain of Responsibility;
                14. Command;
                15. Iterator;
                16. Mediator&Memento;
                17. Observer;
                18. State;
                19. Strategy;
                20. Template Method;
                21. Visitor;""");

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
                case 13 -> {
                    Check resources = new ResourceAvailabilityCheck();
                    Check reputation = new CheckReputation();
                    Check price = new CheckPrice();

                    resources.setCheck(reputation);
                    reputation.setCheck(price);

                    PlayerC playerC = new PlayerC("Yukki", 10, 205, 22, 10250);
                    playerC.getInventory().addItem("wood", 45);
                    playerC.getInventory().addItem("apple", 78);
                    playerC.getInventory().addItem("steel", 405);

                    resources.checkRequest(playerC, "wood", 30, 3, 120);
                    resources.checkRequest(playerC, "wood", 30, 3, 120);
                    resources.checkRequest(playerC, "rock", 2, 1, 1);
                    resources.checkRequest(playerC, "wood", 3, 22, 120);
                    resources.checkRequest(playerC, "wood", 1, 22, 1000);


                    System.out.println("-----------------------------------------------------------------------------------");
                    NpcChain npcCrafter = new NpcCrafter("Crafter1");
                    NpcChain npcChef = new NpcChef("Chef1");
                    NpcChain npcFarmer = new NpcFarmer("Farmer1");

                    npcCrafter.setNpc(npcChef);
                    npcChef.setNpc(npcFarmer);

                    npcCrafter.checkNpcRequest(Work.crafter, AllEnum.sword, playerC);
                    playerC.getInventory().showItems();
                    System.out.println("coins - "+playerC.getCoins());
                    npcCrafter.checkNpcRequest(Work.chef,AllEnum.cake, playerC);
                    playerC.getInventory().showItems();
                    System.out.println("coins - "+playerC.getCoins());
                    npcCrafter.checkNpcRequest(Work.farmer, AllEnum.apple, playerC);
                    playerC.getInventory().showItems();
                    System.out.println("coins - "+playerC.getCoins());

                }
                case 14 ->{

                    ElfCom elfowner = new ElfCom("Yukki", 25, 240, 145);


                    WildAnimal animal = new WildAnimal("Red panda", 10, 450, 25, "apple");
                    elfowner.allCommand(new TameCommand(animal, elfowner));


                    elfowner.allCommand(new FeedCommand(elfowner, elfowner.getAnimalList().get(0)));

                }
                case 15 ->{
                    PlayerIt playerIt1 = new PlayerIt("name1", 5, 25, 15);
                    PlayerIt playerIt2 = new PlayerIt("name2", 15, 32, 110);
                    PlayerIt playerIt3 = new PlayerIt("name3", 20, 45,  250);

                    PlayerGroup playerGroup = new PlayerGroup();
                    playerGroup.addPlayer(playerIt1);
                    playerGroup.addPlayer(playerIt2);
                    playerGroup.addPlayer(playerIt3);

                    Iterator playerGroupCreater = playerGroup.createIterator();

                    while (playerGroupCreater.hasNext()){
                        playerGroupCreater.next().getInventory().addItem("sword", 1);

                    }
                    playerGroupCreater.reset();

                    while (playerGroupCreater.hasNext()){
                        playerGroupCreater.next().getInventory().showItems();
                    }
                }
                case 16 ->{
                    History history = new History();
                    PlayerM playerM = new PlayerM("Sprigg4n", 1, 100, 250, "Item location");
                    EnemyM enemyM = new EnemyM("Yukki", 250, 100, 6);
                    Mediator mediator = new ConcreteMediator(playerM, enemyM);
                    playerM.setMediator(mediator);



                    history.addMemento(playerM.save());
                    playerM.collectingItem(new Items("sword", 1));
                    playerM.getInventory().showItems();


                    playerM.setLocation("enemy location");
                    history.addMemento(playerM.save());
                    playerM.attack(enemyM);
                    System.out.println(playerM.getHp());

                    playerM.restore(history.getMemento(0));
                    System.out.println(playerM.getHp());
                    playerM.setLvl(10);
                    playerM.attack(enemyM);
                    playerM.getInventory().showItems();

                }
                case 17 ->{
                    Observer observer = new Observer();
                    Ecology ecology = new Ecology();
                    Economy economy = new Economy();
                    City city1 = new City("city1");
                    Citizen citizen11 = new Citizen("citizen11", 3500, patterns.behavioral.observer.Work.gardener);
                    Citizen citizen21 = new Citizen("citizen21", 250, patterns.behavioral.observer.Work.unemployment);
                    Citizen citizen31 = new Citizen("citizen31", 350, patterns.behavioral.observer.Work.crafter);
                    city1.addCitizen(citizen11);
                    city1.addCitizen(citizen21);
                    city1.addCitizen(citizen31);

                    City city2 = new City("city2");
                    Citizen citizen12 = new Citizen("citizen12", 345, patterns.behavioral.observer.Work.chef);
                    Citizen citizen22 = new Citizen("citizen22", 500, patterns.behavioral.observer.Work.crafter);
                    Citizen citizen32 = new Citizen("citizen32", 244, patterns.behavioral.observer.Work.gardener);
                    city2.addCitizen(citizen12);
                    city2.addCitizen(citizen22);
                    city2.addCitizen(citizen32);

                    observer.addCity(city1);
                    observer.addCity(city2);

                    observer.updateCity();
                }
                case 18 ->{
                    State calmState = new CalmState();
                    State scaresState = new ScaredState();

                    Mage1 mage1 = new Mage1("mage1", 27, 100, 100, 5);
                    mage1.changeState(scaresState);

                    System.out.println(mage1.getDamage());
                    mage1.changeState(calmState);

                    System.out.println(mage1.getDamage());
                }
                case 19 ->{
                    Strategy attack = new AttackStrategy();
                    Strategy defend = new DefendStrategy();
                    Strategy heal = new HealStrategy();

                    Mage1 mage = new Mage1("mage1", 27, 100, 100, 5);
                    Mage1 mage2 = new Mage1("mage2", 15, 100, 100, 5);

                    mage.setStrategy(attack);
                    mage.executeStrategy(mage2);
                    System.out.println(mage2.getHp());

                    mage.setStrategy(heal);
                    mage.executeStrategy(mage2);
                    System.out.println(mage2.getHp());

                    mage.setStrategy(defend);
                    mage.executeStrategy(mage2);
                    System.out.println(mage2.getDefend());
                }
                case 20 ->{
                    BattleShip battleShip = new BattleShip(100, 20, 45);
                    ResearchShip researchShip = new ResearchShip(100, 40);
                    Ship enemyShip = new BattleShip(100, 35, 43);

                    MissionStrategy battleship = new BattleshipMissionStrategy("enemyShip", "attack", battleShip, enemyShip);
                    battleship.executeMissionTasks();
                    List<String> list = new ArrayList<>();
                    list.add("item1");
                    list.add("item2");
                    list.add("item3");

                    MissionStrategy researchMission = new MissionStrategyForAResearchShip("1", "item3", researchShip, list, "item3");
                    researchMission.executeMissionTasks();
                }
                case 21 ->{
                    Visitor magicDoctor = new MagicDoctor("name1", "specialization1");


                    CitizenVisitor citizenVisitor1 = new CitizenVisitor("name1", "illness1", 45);
                    CitizenVisitor citizenVisitor2 = new CitizenVisitor("name2", "illness2", 75);

                    CityVisitor cityVisitor1 = new CityVisitor("city", "proble67mType1");
                    cityVisitor1.addCitizen(citizenVisitor1);
                    cityVisitor1.addCitizen(citizenVisitor2);


                    cityVisitor1.accept(magicDoctor);
                }
            }
        }
    }
}
