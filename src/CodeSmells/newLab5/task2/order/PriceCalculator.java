package CodeSmells.newLab5.task2.order;

import java.util.List;

class PriceCalculator {
    public double calculateTotalPrice(List<NewOrder> orders) {
        double price = 0.0;
        for (NewOrder order: orders) {
            price+=order.getPrice();
        }
        return price;
    }
}