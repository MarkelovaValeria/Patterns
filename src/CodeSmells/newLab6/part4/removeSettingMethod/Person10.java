package CodeSmells.newLab6.part4.removeSettingMethod;

public class Person10 {
    private String name;
    private int age;
    public Person10(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
