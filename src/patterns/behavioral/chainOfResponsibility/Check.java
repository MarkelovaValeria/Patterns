package patterns.behavioral.chainOfResponsibility;

public interface Check {
    void checkRequest(PlayerC player, String item, int quantity, int reputation, int price);
    Check setCheck(Check check);
}
