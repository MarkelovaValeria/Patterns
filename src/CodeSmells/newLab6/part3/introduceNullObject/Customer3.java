package CodeSmells.newLab6.part3.introduceNullObject;

public class Customer3 {
    private Address3 address3;

    public Customer3(Address3 address3){
        this.address3 = (address3 != null) ? address3 : new NullAddress();
    }

    public Address3 getAddress3() {
        return address3;
    }
}
