package patterns.behavioral.observer1;

public class Economy1 {
    private int income;
    private int unemployment;
    private final int economy;

    public Economy1(){
        this.income = 10450;
        this.unemployment = 0;
        this.economy = 5000;
    }

    public void updateEconomy(Citizen1 citizen, Ecology1 ecology){
        if(citizen.getWork().equals(Work1.unemployment)){
            ecology.setGreenZones(ecology.getGreenZones()-20);
            setUnemployment(getUnemployment()+1);
            setIncome(getIncome()-420);
        }else if(citizen.getWork().equals(Work1.farmer)){
            ecology.setAirPollutionLevel(ecology.getAirPollutionLevel()-10);
            setIncome(getIncome()+250);
        }else if(citizen.getWork().equals(Work1.chef)){
            ecology.setAirPollutionLevel(ecology.getAirPollutionLevel()+15);
            setIncome(getIncome()+200);
        }else if(citizen.getWork().equals(Work1.crafter)){
            ecology.setAirPollutionLevel(ecology.getAirPollutionLevel()+30);
            setIncome(getIncome()+350);
        }else if(citizen.getWork().equals(Work1.gardener)){
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

    public int getEconomy() {
        return economy;
    }

    public int getUnemployment() {
        return unemployment;
    }

    public void setUnemployment(int unemployment) {
        this.unemployment = unemployment;
    }
}
