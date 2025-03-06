package oop_galactiv_team;

public abstract class SpaceCar {
    String name;
    double fuelCapacity = 100;
    double fuelConsumption = 10;
    // era int inainte la astea de mai jos
    double speedSunny = 80;
    double speedRainy = 60;
    double speedSnowy = 40;

    public SpaceCar(String name) {
        this.name = name;
    }

    public abstract double timeRace(WeatherCondition condition, double distance);


    public boolean canFinishRace(double distance, WeatherCondition condition){
        return fuelCapacity / fuelConsumption >= distance;
    }


    //public void refuel();
//void refuel() – Restores the SpaceCar’s fuel to maximum capacity.



}
