package CodeSmells.newLab6.part2.encapsulateField;

public class Person3 {
    private int age;

    public Person3(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
