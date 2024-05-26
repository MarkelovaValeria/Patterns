package CodeSmells.newLab6.part3.introduceNullObject;

public class NullAddress extends Address3{
    public NullAddress() {
        super("", "");
    }

    public String getFullAddress(){
        return "No address available";
    }
}
