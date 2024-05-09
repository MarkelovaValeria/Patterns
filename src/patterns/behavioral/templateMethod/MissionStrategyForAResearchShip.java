package patterns.behavioral.templateMethod;

import patterns.behavioral.chainOfResponsibility.Inventory;

import java.util.List;

public class MissionStrategyForAResearchShip extends MissionStrategy{
    private ResearchShip researchShip;
    private List<String> itemsList;
    private String searchItem;
    public MissionStrategyForAResearchShip(String missionName, String missionDescription, ResearchShip researchShip, List<String> itemsList, String searchItem) {
        super(missionName, missionDescription);
        this.researchShip = researchShip;
        this.itemsList = itemsList;
        this.searchItem = searchItem;
    }

    @Override
    void prepareMission() {
        System.out.println("Create new Inventory");
        researchShip.setInventory(new Inventory());
        System.out.println("add defend");
        researchShip.setDefend(researchShip.getDefend()+15);
    }

    @Override
    void completeMission() {
        for(String item : itemsList){
            if(searchItem.equals(item)){
                researchShip.getInventory().addItem(item, 1);
                System.out.println("+missionResearch");
                return;
            }
        }
        System.out.println("-missionResearch");
    }
}
