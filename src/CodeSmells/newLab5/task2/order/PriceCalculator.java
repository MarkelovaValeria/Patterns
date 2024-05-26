package CodeSmells.newLab5.task2.order;

import java.util.List;

class PriceCalculator {
    public double calculateTotalPrice(List<NewItem> items) {
        double price = 0.0;
        for (NewItem item: items) {
            price+=item.getPrice();
        }
        return price;
    }
}