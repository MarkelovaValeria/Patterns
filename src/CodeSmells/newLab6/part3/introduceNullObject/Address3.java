package CodeSmells.newLab6.part3.introduceNullObject;

public class Address3 {
    private String street;
    private String city;

    public Address3(String street, String city){
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getFullAddress(){
        return street + ", " + city;
    }
}
