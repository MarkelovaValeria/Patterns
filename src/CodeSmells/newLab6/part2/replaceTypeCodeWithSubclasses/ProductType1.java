package CodeSmells.newLab6.part2.replaceTypeCodeWithSubclasses;

public class ProductType1 extends Product5{

    public ProductType1(String name) {
        super(name);
    }

    @Override
    public void process() {
        System.out.println("ProductType1 Name: "+ getName());
    }
}
