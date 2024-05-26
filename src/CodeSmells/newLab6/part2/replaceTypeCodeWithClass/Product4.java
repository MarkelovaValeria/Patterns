package CodeSmells.newLab6.part2.replaceTypeCodeWithClass;

public class Product4 {
    private String name;
    private ProductType productType;

    public Product4(String name, ProductType productType){
        this.name = name;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
