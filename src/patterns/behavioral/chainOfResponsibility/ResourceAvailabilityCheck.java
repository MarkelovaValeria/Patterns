package patterns.behavioral.chainOfResponsibility;

public class ResourceAvailabilityCheck implements Check{
    private Check next;



    @Override
    public void checkRequest(PlayerC player, String item,int quantity, int reputation, int price) {
        if(player.getInventory().getItems().containsKey(item)){
                int itemQuantity = player.getInventory().getItems().get(item);
                if (itemQuantity >= quantity) {
                    System.out.println("+");
                    player.getInventory().removeItem(item, quantity);
                    next.checkRequest(player,item, quantity, reputation, price);
                } else {
                    System.out.println("-");
                }
            }
        else{
            System.out.println("-");
        }
    }

    @Override
    public Check setCheck(Check check) {
        this.next = check;
        return check;
    }
}
