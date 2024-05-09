package patterns.behavioral.chainOfResponsibility;

public class CheckReputation implements Check{

    private Check next;

    @Override
    public void checkRequest(PlayerC player, String item, int quantity, int reputation, int price) {
        if(player.getReputation() >= reputation){
            if(player.getReputation() == reputation){
            next.checkRequest(player, item, quantity, reputation, price);
            }else{
             int newprice = (int) (price * 0.85);
             next.checkRequest(player, item, quantity, reputation, newprice);
            }
        }else {
            System.out.println("You don't have enough reputation points.");
        }
    }

    @Override
    public Check setCheck(Check check) {
        this.next = check;
        return check;
    }
}
