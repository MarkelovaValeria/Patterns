package CodeSmells.newLab6.part5.extractSubclass;

public class Manager6 extends Employeee{
     boolean hasTeam;

    public Manager6(String name, double salary, boolean hasTeam) {
        super(name, salary);
        this.hasTeam = hasTeam;
    }


    public void holdMeeting(){
        if(hasTeam){
            System.out.println(name + " is holding a meeting");
        }
    }
}
