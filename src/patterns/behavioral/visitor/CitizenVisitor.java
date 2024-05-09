package patterns.behavioral.visitor;

public class CitizenVisitor {
    private String name;
    private String illness;
    private int hp;
    public CitizenVisitor(String name, String illness, int hp){
        this.name = name;
        this.illness = illness;
        this.hp = hp;
    }
    public void accept(Visitor visitor) {
        visitor.visitCitizen(this);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
