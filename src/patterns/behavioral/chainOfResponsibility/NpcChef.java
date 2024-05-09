package patterns.behavioral.chainOfResponsibility;

public class NpcChef implements NpcChain {
    private String name;
    private Inventory inventory;
    private NpcChain npcChain;

    public NpcChef(String name){
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
        if(work.equals(Work.chef)){
            if(allEnum.equals(AllEnum.cake)){
                if(playerC.getInventory().getItems().containsKey("apple")){
                    if (playerC.getInventory().getItems().get("apple")>=15) {
                        System.out.println("+");
                        playerC.getInventory().removeItem("apple", 15);
                        playerC.getInventory().addItem("cake", 1);
                        playerC.setCoins(playerC.getCoins()-3);
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
            this.npcChain.checkNpcRequest(work, allEnum,playerC);
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
