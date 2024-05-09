package patterns.behavioral.templateMethod;

public abstract class MissionStrategy {
    private String missionName;
    private String missionDescription;

    public MissionStrategy(String missionName, String missionDescription){
        this.missionName=missionName;
        this.missionDescription=missionDescription;
    }

    abstract void prepareMission();
    public void executeMissionTasks(){
        System.out.println("missionName - "+missionName + "\nmissionDescription - " + missionDescription);
        System.out.println("+");
        prepareMission();
        System.out.println("-");
        completeMission();
    }
    abstract void completeMission();

}
