package patterns.behavioral.visitor;

public interface Visitor {
    void visitCity(CityVisitor cityVisitor);
    void visitCitizen(CitizenVisitor citizenVisitor);
}
