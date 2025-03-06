package oop_galactiv_team;

public class HoverRacer extends SpaceCar{
    /*  int speedSunny;
      int speedSnowy;
      double fuelCapacity;
      double fuelConsumption;
*/

      public HoverRacer(String name){
          super(name);
          this.fuelCapacity = super.fuelCapacity * 1.2;
          this.fuelConsumption = super.fuelConsumption*1.3;
          this.speedSunny = super.speedSunny*2;
          this.speedSnowy = super.speedSnowy/2;
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
        return "HoverRacer{" +
                "speedSunny=" + speedSunny +
                ", speedSnowy=" + speedSnowy +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
