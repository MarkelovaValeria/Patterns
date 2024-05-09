package patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CityVisitor {
    private String name;
    private String problemType;
    private List<CitizenVisitor> citizenVisitorList;

    public CityVisitor(String name, String problemType){
        this.name = name;
        this.problemType = problemType;
        citizenVisitorList = new ArrayList<>();
    }

    public void accept(Visitor visitor) {
        visitor.visitCity(this);
        for (CitizenVisitor citizen : citizenVisitorList) {
            citizen.accept(visitor);
        }
    }

    public void addCitizen(CitizenVisitor citizenVisitor){
        citizenVisitorList.add(citizenVisitor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
