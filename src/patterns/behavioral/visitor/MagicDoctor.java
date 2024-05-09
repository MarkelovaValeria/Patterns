package patterns.behavioral.visitor;

public class MagicDoctor implements Visitor{
    private String name;
    private String specialization;

    public MagicDoctor(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void visitCity(CityVisitor cityVisitor) {
        System.out.println("Doctor " + name + " visited city " + cityVisitor.getName());
    }

    @Override
    public void visitCitizen(CitizenVisitor citizenVisitor) {
        System.out.println("Doctor " + name + " treats a citizen " + citizenVisitor.getName());
        citizenVisitor.setHp(100);
        System.out.println(citizenVisitor.getHp());
    }
}
