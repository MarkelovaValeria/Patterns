package patterns.behavioral.chainOfResponsibility;

public class CheckPrice implements Check{



    @Override
    public void checkRequest(PlayerC player, String item, int quantity, int reputation, int price) {
        if(player.getCoins() >= price){

                System.out.println(player.getName() + "bought a/an" + item + "for" + price + "монет.");
                player.setCoins(player.getCoins()-price);
                System.out.println("Number of coins left - " + player.getCoins());
        }else{
            System.out.println("Insufficient coins");
        }
    }

    @Override
    public Check setCheck(Check check) {
        return check;

    }

}
