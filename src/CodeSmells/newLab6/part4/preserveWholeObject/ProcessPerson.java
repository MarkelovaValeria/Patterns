package CodeSmells.newLab6.part4.preserveWholeObject;

public class ProcessPerson {
    public void process(Person7 person7){
        System.out.println("Processing person - " + person7.getName());
        System.out.println("Age - " + person7.getAge());
        System.out.println("Address - " + person7.getAddress());
    }
}
