package CodeSmells.newLab6.part1.inlineClass;

public class Person {
    private String name;
    private String street;
    private String city;
    private String country;

    public Person(String name, String street, String city, String country){
        this.name = name;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void personInfo(){
        System.out.println(name+"\nAddress: "+street+", " + city+", " + country);
    }
}
