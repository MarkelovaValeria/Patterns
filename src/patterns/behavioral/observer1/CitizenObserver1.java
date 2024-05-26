package patterns.behavioral.observer1;

public interface CitizenObserver1 {

    void onCityMetricsChanged(Ecology1 ecology, Economy1 economy);
    int getCitizenSatisfaction();
}
