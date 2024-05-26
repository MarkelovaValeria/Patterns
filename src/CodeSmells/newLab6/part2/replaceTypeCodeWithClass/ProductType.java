package CodeSmells.newLab6.part2.replaceTypeCodeWithClass;

public class ProductType {
    private int typeCode;
    private String typeName;

    public ProductType(int typeCode, String typeName){
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
