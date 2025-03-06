package oop_galactiv_team;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*  SpaceCar firstcar = new HoverRacer("Masina 1");
        System.out.println(firstcar.timeRace(WeatherCondition.SUNNY, 100));
        System.out.println(firstcar);

        System.out.println("CAN Finish Race = " + firstcar.canFinishRace(9, WeatherCondition.SNOWY));
        //daca pun 10 - da false asta, daca pun 9, da TRUE


        ArrayList<SpaceCar> myCircuit = new ArrayList<>();

        List<SpaceCar> myList = new ArrayList<>();
*/


       SpaceCircuit circuit1 = new SpaceCircuit();

       circuit1.startRace();
    }
}