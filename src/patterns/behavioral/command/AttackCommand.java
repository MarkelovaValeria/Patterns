package patterns.behavioral.command;

public class AttackCommand implements Command{
    private ElfCom elfowner;
    private DomesticatedAnimal domesticatedAnimal;

    public AttackCommand(ElfCom elfowner, DomesticatedAnimal domesticatedAnimal){
        this.domesticatedAnimal = domesticatedAnimal;
        this.elfowner = elfowner;
    }
    @Override
    public void execute() {
        elfowner.getAnimalList().get(elfowner.getAnimalList().indexOf(domesticatedAnimal)).attack();
    }
}
