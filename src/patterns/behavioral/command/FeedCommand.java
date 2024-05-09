package patterns.behavioral.command;

public class FeedCommand implements Command{
    private ElfCom elfowner;
    public DomesticatedAnimal domesticatedAnimal;

    public  FeedCommand(ElfCom elfowner, DomesticatedAnimal domesticatedAnimal){
        this.elfowner = elfowner;
        this.domesticatedAnimal = domesticatedAnimal;
    }

    @Override
    public void execute() {
        elfowner.getAnimalList().get(elfowner.getAnimalList().indexOf(domesticatedAnimal)).feed();

    }
}
