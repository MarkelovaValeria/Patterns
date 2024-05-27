package CodeSmells.newLab6.part5.pullUpConstructorBody;

public class Animal3 {
    String name;
    int age;

    public Animal3(String name, int age){
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
