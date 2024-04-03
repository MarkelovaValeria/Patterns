package patterns.structural.facade;

public class PlayerF {
    private String name;
    private int lvl;
    private CharacterBuilder characterBuilder;

    public PlayerF(String name, int lvl){
        this.name = name;
        this.lvl = lvl;
        this.characterBuilder = new CharacterBuilder();
    }

    public void actionHit(){
        characterBuilder.getSword();
        characterBuilder.chop();
        characterBuilder.hit();
        characterBuilder.moveAway();
    }

}
