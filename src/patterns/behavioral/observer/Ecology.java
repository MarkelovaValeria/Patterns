package patterns.behavioral.observer;

public class Ecology {
    private int airPollutionLevel;
    private int waterPollutionLevel;
    private int greenZones;

    public Ecology(){
        this.airPollutionLevel = 0;
        this.waterPollutionLevel = 0;
        this.greenZones = 50;
    }

    public int getAirPollutionLevel() {
        return airPollutionLevel;
    }

    public void setAirPollutionLevel(int airPollutionLevel) {
        this.airPollutionLevel = airPollutionLevel;
    }

    public int getWaterPollutionLevel() {
        return waterPollutionLevel;
    }

    public void setWaterPollutionLevel(int waterPollutionLevel) {
        this.waterPollutionLevel = waterPollutionLevel;
    }

    public int getGreenZones() {
        return greenZones;
    }

    public void setGreenZones(int greenZones) {
        this.greenZones = greenZones;
    }

    public void updateGreenZones() {
        if (airPollutionLevel >= 65 && waterPollutionLevel >= 65) {
            greenZones -= 30;
        } else if (airPollutionLevel >= 65 || waterPollutionLevel >= 65) {
            greenZones -= 15;
        } else {
            greenZones += 5;
        }
        System.out.println("\nairPollutionLevel - " + airPollutionLevel + "\nwaterPollutionLevel - " + waterPollutionLevel + "\ngreenZones - " + greenZones);
    }

}
