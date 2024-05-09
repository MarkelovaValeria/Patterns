package patterns.behavioral.mediator;

public class ConcreteMediator implements Mediator{
    private PlayerM playerM;
    private EnemyM enemyM;

    public ConcreteMediator(PlayerM playerM, EnemyM enemyM){
        this.playerM = playerM;
        this.enemyM = enemyM;

    }
    @Override
    public void attack() {
        enemyM.damagePlayer(playerM);
    }

    @Override
    public void collecting(Items items) {
        System.out.println("collect item");
        playerM.getInventory().addItem(items.getName(), items.getQuantity());
    }
}
