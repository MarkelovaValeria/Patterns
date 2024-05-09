package patterns.behavioral.observer;

public class Economy {
    private int income;
    private int unemployment;

    public Economy(){
        this.income = 10450;
        this.unemployment = 0;
    }

    public void updateEconomy(Citizen citizen, Ecology ecology){
        if(citizen.getWork().equals(Work.unemployment)){
            ecology.setGreenZones(ecology.getGreenZones()+20);
            setUnemployment(getUnemployment()+1);
            setIncome(getIncome()-420);
        }else if(citizen.getWork().equals(Work.farmer)){
            ecology.setAirPollutionLevel(ecology.getAirPollutionLevel()-10);
            setIncome(getIncome()+250);
        }else if(citizen.getWork().equals(Work.chef)){
            ecology.setAirPollutionLevel(ecology.getAirPollutionLevel()+15);
            setIncome(getIncome()+200);
        }else if(citizen.getWork().equals(Work.crafter)){
            ecology.setAirPollutionLevel(ecology.getAirPollutionLevel()+30);
            setIncome(getIncome()+350);
        }else if(citizen.getWork().equals(Work.gardener)){
            ecology.setAirPollutionLevel(ecology.getAirPollutionLevel()-25);
            setIncome(getIncome()+250);
        }
        System.out.println("----------------------"+"\nincome - "+income +"\nunemployment - "+ unemployment);
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }



    public int getUnemployment() {
        return unemployment;
    }

    public void setUnemployment(int unemployment) {
        this.unemployment = unemployment;
    }
}
