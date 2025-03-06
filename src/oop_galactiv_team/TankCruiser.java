package oop_galactiv_team;

public class TankCruiser extends SpaceCar{
//TankCruiser – Slow but extremely fuel-efficient. Moves steadily even in SNOWY weather. High durability.

      public TankCruiser(String name) {
          super(name);

          this.fuelConsumption = super.fuelConsumption * 0.5;
          this.speedSunny = super.speedRainy * 0.8;
          this.speedSnowy = super.speedRainy * 0.8;
          this.speedRainy = super.speedRainy * 0.8;
          //super vine din spaceCar information

      }

      @Override
      public double timeRace(WeatherCondition condition, double distance){
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
        return "TankCruiser{" +
                "speedSunny=" + speedSunny +
                ", speedSnowy=" + speedSnowy +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
