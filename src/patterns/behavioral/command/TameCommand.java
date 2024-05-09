package patterns.behavioral.command;

public class TameCommand implements Command{
    private WildAnimal wildAnimal;
    private ElfCom elf;

    public TameCommand(WildAnimal wildAnimal, ElfCom elf){
        this.wildAnimal = wildAnimal;
        this.elf = elf;
    }

    @Override
    public void execute() {
        if(elf.getInventory().getItems().containsKey(wildAnimal.getFood()) && elf.getInventory().getItems().get(wildAnimal.getFood())>=wildAnimal.getQuantity()){
            DomesticatedAnimal domesticatedAnimal = wildAnimal.tame();
            elf.getAnimalList().add(domesticatedAnimal);
            elf.getInventory().removeItem(wildAnimal.getFood(), wildAnimal.getQuantity());
            System.out.println("A wild animal was tamed by " + elf.getName());
        }else{
            System.out.println("You can't tame");
            elf.setHp(elf.getHp() - 15);
        }
    }
}
