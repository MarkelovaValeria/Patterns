package patterns;

import CodeSmells.newLab5.task1.NewUserListProcessor;
import CodeSmells.newLab5.task1.User;
import CodeSmells.newLab5.task2.largeClass.*;
import CodeSmells.newLab5.task2.order.NewItem;
import CodeSmells.newLab5.task2.order.NewOrder;
import CodeSmells.newLab5.task2.order.ProcessOrder;
import CodeSmells.newLab6.part1.extractClass.Employee3;
import CodeSmells.newLab6.part1.extractClass.EmployeeInfo;
import CodeSmells.newLab6.part1.hideDelegate.Department;
import CodeSmells.newLab6.part1.hideDelegate.Employee5;
import CodeSmells.newLab6.part1.inlineClass.Person;
import CodeSmells.newLab6.part1.introduceForeignMethod.Client;
import CodeSmells.newLab6.part1.introduceLocalExtension.DateHelper;
import CodeSmells.newLab6.part1.introduceLocalExtension.DateHelperExtended;
import CodeSmells.newLab6.part1.moveField.Company;
import CodeSmells.newLab6.part1.moveField.Employee;
import CodeSmells.newLab6.part1.moveMethod.Account;
import CodeSmells.newLab6.part1.moveMethod.Bank;
import CodeSmells.newLab6.part1.removeMiddleMan.Department6;
import CodeSmells.newLab6.part1.removeMiddleMan.Employee6;
import CodeSmells.newLab6.part2.changeBidirectionalAssociationToUnidirectional.Department2;
import CodeSmells.newLab6.part2.changeBidirectionalAssociationToUnidirectional.Employee8;
import CodeSmells.newLab6.part2.changeReferenceToValue.ImmutablePoint;
import CodeSmells.newLab6.part2.changeUnidirectionalAssociationToBidirectional.Course;
import CodeSmells.newLab6.part2.changeUnidirectionalAssociationToBidirectional.Student;
import CodeSmells.newLab6.part2.changeValueToReference.Product;
import CodeSmells.newLab6.part2.duplicateObservedData.Order3;
import CodeSmells.newLab6.part2.duplicateObservedData.OrderManager;
import CodeSmells.newLab6.part2.encapsulateCollection.Book;
import CodeSmells.newLab6.part2.encapsulateCollection.Library;
import CodeSmells.newLab6.part2.encapsulateField.Person3;
import CodeSmells.newLab6.part2.replaceArrayWithObject.Car;
import CodeSmells.newLab6.part2.replaceArrayWithObject.CarData;
import CodeSmells.newLab6.part2.replaceDataValueWithObject.Customer;
import CodeSmells.newLab6.part2.replaceDataValueWithObject.Order2;
import CodeSmells.newLab6.part2.replaceSubclassWithFields.Circle;
import CodeSmells.newLab6.part2.replaceSubclassWithFields.Rectangle;
import CodeSmells.newLab6.part2.replaceTypeCodeWithClass.Product4;
import CodeSmells.newLab6.part2.replaceTypeCodeWithClass.ProductType;
import CodeSmells.newLab6.part2.replaceTypeCodeWithState_Strategy.CompletedOrderStatus;
import CodeSmells.newLab6.part2.replaceTypeCodeWithState_Strategy.Order5;
import CodeSmells.newLab6.part2.replaceTypeCodeWithSubclasses.Product5;
import CodeSmells.newLab6.part2.replaceTypeCodeWithSubclasses.ProductType1;
import CodeSmells.newLab6.part2.replaceTypeCodeWithSubclasses.ProductType2;
import CodeSmells.newLab6.part2.selfEncapsulateField.EmployeeS;
import patterns.behavioral.chainOfResponsibility.Work;
import patterns.behavioral.command.*;
import patterns.behavioral.chainOfResponsibility.*;
import patterns.behavioral.iterator.Iterator;
import patterns.behavioral.iterator.PlayerGroup;
import patterns.behavioral.iterator.PlayerIt;
import patterns.behavioral.mediator.*;
import patterns.behavioral.memento.*;
import patterns.behavioral.observer1.*;
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

import java.util.*;

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
                21. Visitor;
                
                Code Smells:
                22. Lab5;
                23. Lab6;
                """);

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
                    City1 city = new City1("City");
                    CitySubject1 citySubject1 = new CitySubject1();

                    Citizen1 citizenObserver1 = new Citizen1("name1", 100, Work1.farmer);
                    Citizen1 citizenObserver2 = new Citizen1("name2", 100, Work1.gardener);
                    Citizen1 citizenObserver3 = new Citizen1("name3", 100, Work1.crafter);

                    city.addCitizen(citizenObserver1);
                    city.addCitizen(citizenObserver2);
                    city.addCitizen(citizenObserver3);

                    citySubject1.addCity(city);
                    citySubject1.updateCity();

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
                case 22 ->{
                    System.out.println("===== User List =====");
                    User user = new User("Sprigg4n", "?", "?", "?");
                    User user2 = new User("admin", "?", "?", "?");
                    ArrayList<User> userList = new ArrayList<>();
                    userList.add(user);
                    NewUserListProcessor newUserListProcessor = new NewUserListProcessor(userList);
                    newUserListProcessor.addUser(user2);

                    newUserListProcessor.sendEmailToUser(user);
                    newUserListProcessor.processUserList();
                    newUserListProcessor.adminCount();

                    System.out.println("===== Order =====");

                    NewItem item1 = new NewItem("item1", 22.5);
                    NewItem item2 = new NewItem("item2", 1213.87);

                    NewOrder newOrder1 = new NewOrder("Sprigg4n");
                    newOrder1.addItem(item1);
                    newOrder1.addItem(item2);

                    ProcessOrder processOrder = new ProcessOrder();
                    processOrder.addOrder(newOrder1);
                    processOrder.processOrder();

                    System.out.println("===== Large Class =====");

                    Friends friends = new Friends();
                    friends.addFriend("friend1");

                    Tasks tasks = new Tasks();
                    tasks.addTask("task1");

                    UserL userL = new UserL("Sprigg4n", 18, "?");
                    userL.getEnemies().addEnemy("enemy1");
                    userL.getFriends().addFriend("friend1");
                    userL.getTasks().addTask("task1");
                    userL.displayInfo();
                    userL.getFriends().displayInfo();
                    userL.getTasks().displayInfo();
                    userL.getEnemies().displayInfo();

                    userL.getEnemies().removeEnemy("enemy1");
                    userL.getFriends().addFriend("friend2");
                    userL.getEnemies().displayInfo();
                    userL.getFriends().displayInfo();
                }
                case 23->{
                    System.out.println("===== Move Method =====");
                    Account account1 = new Account(1000, 5.0);
                    Account account2 = new Account(2000, 3.5);
                    Account account3 = new Account(1500, 4.0);

                    List<Account> accounts = new ArrayList<>();
                    accounts.add(account1);
                    accounts.add(account2);
                    accounts.add(account3);

                    Bank bank = new Bank(accounts);

                    bank.processAccounts();
                    System.out.println("===== Move Field =====");
                    Company company = new Company();
                    Employee emp1 = new Employee("Yukki");
                    Employee emp2 = new Employee("Sprigg4n");

                    company.addEmployee(emp1, 50000);
                    company.addEmployee(emp2, 60000);

                    company.printEmployeeSalaries();
                    System.out.println("===== Extract Class =====");

                    Employee3 employee3 = new Employee3("Name1", "Engineering",75000);
                    EmployeeInfo info = new EmployeeInfo(employee3);
                    info.printEmployeeDetails();

                    System.out.println("===== Inline Class =====");
                    Person person = new Person("Yukki", "street1", "city", "country");
                    person.personInfo();

                    System.out.println("===== Hide Delegate =====");
                    Employee5 manager = new Employee5("name1", null);
                    Department department = new Department("Engineering", manager);
                    Employee5 employee5 = new Employee5("name2", department);

                    System.out.println("Manager's name: "+ employee5.getManagerName());

                    System.out.println("===== Remove Middle Man =====");
                    Employee6 manager6 = new Employee6("name1", null);
                    Department6 department6 = new Department6("Engineering", manager6);
                    Employee6 employee6 = new Employee6("name2", department6);

                    System.out.println("Manager's name: "+ employee6.getDepartment().getManagerName());

                    System.out.println("===== Introduce Foreign Method =====");
                    Client client = new Client();
                    client.doSomething();

                    System.out.println("===== Introduce Local Extension =====");
                    Calendar calendar = Calendar.getInstance();
                    Date startDate = calendar.getTime();
                    calendar.add(Calendar.DAY_OF_MONTH, 10);
                    Date endDate = calendar.getTime();

                    Date newDate = DateHelper.addDays(startDate, 5);
                    System.out.println("Date after adding 5 days: " + newDate);

                    long daysDiff = DateHelperExtended.daysBetween(startDate, endDate);
                    System.out.println("Days between startDate and endDate: " + daysDiff);

                    System.out.println("=============================");
                    System.out.println("Part 2");
                    System.out.println("===== Self Encapsulate Field ======");

                    EmployeeS employeeS = new EmployeeS("name4", 17000);
                    System.out.println("Salary: " + employeeS.getSalary());

                    employeeS.raiseSalary(3000);
                    System.out.println("Salary: "+ employeeS.getSalary());

                    System.out.println("===== Replace Data Value with Object =====");

                    Customer customer = new Customer("customer1");

                    Order2 order2 = new Order2(customer, 250);

                    System.out.println("Customer: " + order2.getCustomer().getName());
                    System.out.println("Amount: "+ order2.getAmount());

                    order2.getCustomer().setName("newName");
                    System.out.println("Customer: " + order2.getCustomer().getName());

                    System.out.println("===== Change Value to Reference =====");
                    Product product1 = new Product("name1", 25, "USD");
                    Product product2 = new Product("name2", 25, "USD");
                    Product product3 = new Product("name3", 65, "USD");

                    System.out.println("Currency of product1: " + product1.getCurrency());
                    System.out.println("Currency of product2: " + product2.getCurrency());
                    System.out.println("Currency of product3: " + product3.getCurrency());

                    System.out.println("product1 and product2 have the same currency object: " + (product1.getCurrency() == product2.getCurrency()));

                    System.out.println("===== Change Reference to Value =====");
                    ImmutablePoint point1 = new ImmutablePoint(1, 2);
                    ImmutablePoint point2 = new ImmutablePoint(1, 2);
                    ImmutablePoint point3 = new ImmutablePoint(3, 4);

                    System.out.println("Point 1: " + point1);
                    System.out.println("Point 2: " + point2);
                    System.out.println("Point 3: " + point3);

                    System.out.println("Point 1 equals Point 2: " + point1.equals(point2));
                    System.out.println("Point 1 equals Point 3: " + point1.equals(point3));

                    System.out.println("===== Replace Array with Object =====");
                    List<Car> cars = new ArrayList<>();
                    cars.add(new Car("Toyota", 20000, 2018));
                    cars.add(new Car("BMW", 40000, 2020));
                    cars.add(new Car("Honda", 25000, 2019));

                    CarData carData = new CarData(cars);

                    System.out.println("===== Duplicate Observes Data =====");
                    OrderManager orderManager = new OrderManager();

                    Order3 order31 = new Order3("name1", "name2", 1);
                    Order3 order32 = new Order3("name4", "name5", 3);

                    orderManager.addOrder(order31);
                    orderManager.addOrder(order32);

                    for (Order3 order3: orderManager.getOrders()){
                        System.out.println("Customer: " + order3.getCustomerName() + ", Product: " + order3.getProductName() + ", Quantity: " + order3.getQuantity());
                    }

                    System.out.println("===== Change Unidirectional Association to Bidirectional =====");
                    Student student1 = new Student("student1");
                    Student student2 = new Student("student2");

                    Course course1 = new Course("course1");
                    Course course2 = new Course("course2");

                    student2.enrollCourse(course1);
                    student1.enrollCourse(course1);
                    student1.enrollCourse(course2);

                    System.out.println(student1.getName() + " enrolled in courses:");
                    for (Course course : student1.getCourses()) {
                        System.out.println(course.getTitle());
                    }

                    System.out.println("\nStudents enrolled in the course " + course1.getTitle() + ":");
                    for (Student student : course1.getStudents()) {
                        System.out.println(student.getName());
                    }

                    System.out.println("\nStudents enrolled in the course " + course2.getTitle() + ":");
                    for (Student student : course2.getStudents()) {
                        System.out.println(student.getName());
                    }

                    System.out.println("===== Change Bidirectional Association to Unidirectional =====");
                    Employee8 employee81 = new Employee8("employee1");
                    Employee8 employee82 = new Employee8("employee2");

                    List<Employee8> employee8s = new ArrayList<>();
                    employee8s.add(employee81);
                    employee8s.add(employee82);

                    Department2 department2 = new Department2("department", employee8s);
                    for (Employee8 employee8: department2.getEmployees()){
                        System.out.println(employee8.getName());
                    }

                    System.out.println("===== Replace Magic Number with Symbolic Constant =====");
                    final int numberOfItem = 100;
                    List<String> items = new ArrayList<>();

                    for (int i = 0; i < numberOfItem; i++) {
                        items.add("Item " + i);
                    }

                    for (String item : items) {
                        System.out.println(item);
                    }

                    System.out.println("===== Encapsulate Field =====");

                    Person3 person3 = new Person3(23);
                    System.out.println(person3.getAge());

                    System.out.println("===== Encapsulate Collection =====");
                    Book book1 = new Book("book1");
                    Book book2 = new Book("book2");

                    List<Book> books = new ArrayList<>();
                    Library library = new Library(books);
                    library.addBook(book1);
                    library.addBook(book2);

                    for(Book book : library.getBooks()){
                        System.out.println(book.getTitle());
                    }

                    System.out.println("===== Replace Type Code with Class =====");

                    ProductType type1 = new ProductType(1, "type1");
                    ProductType type2 = new ProductType(2, "type2");

                    Product4 product41 = new Product4("product1", type1);
                    Product4 product42 = new Product4("product2", type2);

                    System.out.println("Product 1: " + product41.getName() + ", Type: " + type1.getTypeName());
                    System.out.println("Product 2: " + product42.getName() + ", Type: " + type2.getTypeName());

                    System.out.println("===== Replace Type Code with Subclasses =====");
                    Product5 product51 = new ProductType1("Product1");
                    Product5 product52 = new ProductType2("Product2");

                    product51.process();
                    product52.process();

                    System.out.println("===== Replace Type Code with State/Strategy =====");
                    Order5 order5 = new Order5();
                    order5.processOrder();
                    order5.processOrder();
                    order5.setStatus(new CompletedOrderStatus());
                    order5.processOrder();

                    System.out.println("===== Replace Subclass with Fields =====");
                    Circle circle = new Circle(2);
                    System.out.println("Circle area - " + circle.getArea());
                    System.out.println("Circle perimeter - " + circle.getPerimeter());

                    Rectangle rectangle = new Rectangle(4, 6);
                    System.out.println("Rectangle area - " + rectangle.getArea());
                    System.out.println("Rectangle perimeter - " + rectangle.getPerimeter());
                }
            }
        }
    }
}
