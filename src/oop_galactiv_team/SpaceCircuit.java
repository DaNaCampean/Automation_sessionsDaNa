package oop_galactiv_team;

import java.util.ArrayList;
import java.util.List;

/*
Create a SpaceCircuit class that:
● Has fields for int length (circuit length) and WeatherCondition weather.
● Uses polymorphism with a list of SpaceCar objects to store competitors.


● Methods:
○ void addCar(SpaceCar car) – Adds a SpaceCar to the race.

○ void startRace() – Simulates the race.
■ Checks each SpaceCar using canFinishRace().
■ If a car can finish, calculates race time using race() method.

■ Sorts the SpaceCars by race time and announces the winner.
■ If a car can't finish, announces "Out of Fuel".
 */
public class SpaceCircuit {
    double length = 8;

    // daca pui 140 in loc de 8 -  e out of f
    WeatherCondition weather = WeatherCondition.SNOWY;

    //trebuie sa folosim polimorfism now.

   SpaceCar masina1 = new HoverRacer("hover");
   SpaceCar masina2 = new JetCar("jetCar");
   SpaceCar masina3 = new TankCruiser("tankCar");
   double rt1,rt2,rt3;


   void startRace() {
       if (masina1.canFinishRace(length, weather)){
          rt1 =  masina1.timeRace(weather, length);

       }
       else {
           System.out.println("out of fuel = " + masina1.name);
           rt1 = 1000;
       }

       if (masina2.canFinishRace(length, weather)){
           rt2 =  masina2.timeRace(weather, length);

       }
       else {
           System.out.println("out of fuel = " + masina2.name);
           rt2 = 1000;
       }

       if (masina3.canFinishRace(length, weather)){
           rt3 =  masina3.timeRace(weather, length);

       }
       else {
           System.out.println("out of fuel = " + masina3.name);
           rt3 = 1000;
       }

      if (rt1<rt2) {
          if (rt1<rt3){
              System.out.println(masina1.name + " is the winner");
          }
          else {
              System.out.println(masina3.name + " is the winner");
          }
      } else if (rt2<rt3) {
          System.out.println(masina2.name + " is the winner");

      }
      else{
          System.out.println(masina3.name + " is the winner");
      }

   }

}
