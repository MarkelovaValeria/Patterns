package patterns.behavioral.chainOfResponsibility;

public class NpcFarmer implements NpcChain {
    private String name;
    private Inventory inventory;
    private NpcChain npcChain;

    public NpcFarmer(String name){
        this.name = name;
        inventory = new Inventory();
    }

    @Override
    public NpcChain setNpc(NpcChain npcChain) {
        this.npcChain = npcChain;
        return npcChain;
    }

    @Override
    public void checkNpcRequest(Work work, AllEnum allEnum, PlayerC playerC) {
        if(work.equals(Work.farmer)){
            if(allEnum.equals(AllEnum.apple)){
                if(playerC.getInventory().getItems().containsKey("apple")){
                    if (playerC.getInventory().getItems().get("apple")>=45) {
                        System.out.println("+");
                        playerC.getInventory().removeItem("apple", 45);
                        playerC.setCoins(playerC.getCoins()+2300);
                    } else {
                        System.out.println("You haven't enough steel");
                    }
                }
                else{
                    System.out.println("You haven't steel");
                }
            }else{
                System.out.println("-");
            }
        }else if(this.npcChain !=null){
            this.npcChain.checkNpcRequest(work, allEnum, playerC);
        }else{
            System.out.println("-");
        }
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }
}
