package patterns.behavioral.templateMethod;

public class BattleshipMissionStrategy extends MissionStrategy{
    private BattleShip battleShip;
    private Ship enemyShip;

    public BattleshipMissionStrategy(String missionName, String missionDescription, BattleShip battleShip, Ship enemyShip) {
        super(missionName, missionDescription);
        this.battleShip = battleShip;
        this.enemyShip = enemyShip;
    }

    @Override
    void prepareMission() {
        System.out.println("add defend");
        battleShip.setDefend(battleShip.getDefend()+15);
    }

    @Override
    void completeMission() {
        while (enemyShip.getHp()>0){
            if(enemyShip.getDefend()>0){
                enemyShip.setDefend(enemyShip.getDefend()- battleShip.getDamage());
                System.out.println("-defend");
            }
            else{
                enemyShip.setHp(enemyShip.getHp()- battleShip.getDamage());
            }
        }
        System.out.println("+missionBattle");
    }
}
