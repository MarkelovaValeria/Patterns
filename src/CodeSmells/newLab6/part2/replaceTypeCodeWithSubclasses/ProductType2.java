package CodeSmells.newLab6.part2.replaceTypeCodeWithSubclasses;

public class ProductType2 extends Product5{
    public ProductType2(String name) {
        super(name);
    }

    @Override
    public void process() {
        System.out.println("ProductType2 Name: "+ getName());
    }
}
