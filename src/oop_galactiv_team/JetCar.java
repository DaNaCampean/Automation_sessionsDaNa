package oop_galactiv_team;

///public class JetCar extends {

//}
// JetCar – Balanced speed across all weather conditions but lower fuel capacity. Efficient in fuel consumption.

public class JetCar extends SpaceCar{

    public JetCar(String name){
        super(name);
        this.fuelCapacity = super.fuelCapacity * 0.8;
        this.fuelConsumption = super.fuelConsumption*0.7;

    }

    @Override
    public double timeRace(WeatherCondition condition, double  distance){
        double i=0;
        System.out.println("distanta = " + distance + "speedSunny = " + speedSunny + "vremea este: " + condition);
        switch (condition){
            case WeatherCondition.RAINY: i = (double) distance /this.speedRainy;
            case WeatherCondition.SNOWY: i = (double) distance /this.speedSnowy;
            case WeatherCondition.SUNNY:
            {i = (double) distance /speedSunny;
                System.out.println("sunt in sunny");
                System.out.println("distanta = " + distance + "speedSunny = " + speedSunny + "vremea este: " + condition + "i-ul este: " + i);
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return "JetCar{" +
                "speedSunny=" + speedSunny +
                ", speedSnowy=" + speedSnowy +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}

