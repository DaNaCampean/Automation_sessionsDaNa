package Session4_Array_ArrayList_HashMap;
/*

    Ticket Sales Monitor
The busiest visiting period for a local attraction is approaching, and the staff needs help
managing ticket sales and calculating the weekly balance. The ticket price varies depending
on the park's visiting schedule, specifically on the time slot. Students receive a 75%
discount, seniors a 50% discount, and children enter for free.
Visiting program:
Monday: 09:00 - 18:00
Tuesday: 11:00 - 19:00
Wednesday: 08:00 - 17:00
Thursday: 09:00 - 20:00
Friday: 10:00 - 18:00.
Ticket Prices:
08:00 - 12:00 | Price: $10.0
12:00 - 17:00 | Price: $20.0
17:00 - 20:00 | Price: $30.0
● Implement the visiting timetable of the local attraction using a Map implementation of
your choice in which the keys are days of the week and the values are time intervals
(opening and closing hours).
● Create a boolean method called isOpen that will take as parameters the day of the
week and the time of the arrival (e.g. hour) and returns true if the local attractions is
open on that time or false otherwise.
● Create a method that calculates and returns the price based on the type of ticket
(child, student, adult, or senior) and the time at which it is purchased.
● Create a Java program that will allow the user to register purchases until the user
decides to exit.

●Implement a way to keep track of the total revenue for each visiting day. With each
new purchase, the values will be updated.

● Implement a purchase command that will register a new purchase.
○ The day of the week, time and type of the ticket will be specified.
○ If the chosen period does not match the visiting schedule of the local
attraction, display the message: 'The purchase is not valid for the chosen
period.' along with options to select a new period or cancel the purchase.


● Implement a command to provide the following statistics: the day with the highest
sales, the day with the lowest sales, the average sales for the entire week, and the
total number of sales for the week.
● Implement an exit command that will allow the user to exit the program.
     */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ticketSalesMonitor {

    //public static int totalSales = 0;
    public static int sale = 0;
    //public static HashMap<String, Integer> totalSalesDays = new HashMap<>();


    public static void main (String args[]) {
       // Implement a way to keep track of the total revenue for each visiting day. With each
        //new purchase, the values will be updated.
        double totalRevenue = 0;
        HashMap<String, Double> totalRevenuePerDays = new HashMap<>();

        totalRevenuePerDays.put("Monday", 0.0);
        totalRevenuePerDays.put("Tuesday", 0.0);
        totalRevenuePerDays.put("Wednesday", 0.0);
        totalRevenuePerDays.put("Thursday", 0.0);
        totalRevenuePerDays.put("Friday", 0.0);

        int totalSales = 0;

        HashMap<String, Integer> totalSalesDays = new HashMap<>();

        totalSalesDays.put("Monday", 0);
        totalSalesDays.put("Tuesday", 0);
        totalSalesDays.put("Wednesday", 0);
        totalSalesDays.put("Thursday", 0);
        totalSalesDays.put("Friday", 0);





    // Implement the visiting timetable of the local attraction using a Map implementation of
    // your choice in which the keys are days of the week and the values are time intervals (opening and closing hours).

        HashMap<String, String> visitingTimeTable = new HashMap<>();
        visitingTimeTable = visitingTimeTable();
        System.out.println("Visiting Program");

        for (String i : visitingTimeTable.keySet()) {
            System.out.println(i + " : " + visitingTimeTable.get(i));
        }
        // System.out.println("Table = " +visitingTimeTable);


    //Create a boolean method called isOpen that will take as parameters the day of the
    // week and the time of the arrival (e.g. hour) and returns true if the local attractions is
    // open on that time or false otherwise.
      //  String readDay = readPurchaseDay();

        Scanner userinput = new Scanner(System.in);
        boolean continuePurchase = true;
        double tiketPrice = 0;
        int salesNumber = 0;
        do {

            String day = readPurchaseDay(userinput);
            System.out.println("Visiting program for " + day + " is: " + visitingTimeTable.get(day));
            String time = readPurchaseTime(userinput);
            String ticketType = readPurchaseTicketType(userinput);
            //registerPurchase(day, time,ticketType);

           // System.out.println("isOpen???? = " + isOpen(day, returnHour(time)));

            //Create a method that calculates and returns the price based on the type of ticket
            //        (child, student, adult, or senior) and the time at which it is purchased.

          //  System.out.println("final price = === " + returnPrice(ticketType, returnHour(time)));

            //● Implement a purchase command that will register a new purchase.
            //○ The day of the week, time and type of the ticket will be specified.
            //○ If the chosen period does not match the visiting schedule of the local
            //attraction, display the message: 'The purchase is not valid for the chosen
            //period.' along with options to select a new period or cancel the purchase.

            tiketPrice = totalRevenuePerDays.get(day);
            salesNumber = totalSalesDays.get(day);

            totalRevenue = registerPurchase(day,returnHour(time),ticketType, userinput);


            tiketPrice = tiketPrice+totalRevenue;
            salesNumber = salesNumber + sale;
            sale = 0;

            totalRevenuePerDays.put(day,tiketPrice);
            totalSalesDays.put(day, salesNumber);

            System.out.println("REVENUE = " + totalRevenuePerDays);
            System.out.println("SALESSS = " + totalSalesDays);






            System.out.println("Do you want to add a new purchase? Enter yes to continue, no to exit ");

            String option_scanner = userinput.nextLine();

            if (option_scanner.equals("no"))
                continuePurchase = false;



        }while (continuePurchase);

        System.out.println("REVENUE finallll = " + totalRevenuePerDays);
        System.out.println("Sales  finallll = " + totalSalesDays);
        userinput.close();

        //Implement a command to provide the following statistics: the day with the highest
        // sales, the day with the lowest sales, the average sales for the entire week, and the
        // total number of sales for the week.

        System.out.println("GENERATED REPORT:");
        generated_report(totalSalesDays);



    }

    public static void generated_report(HashMap<String, Integer> sales)
    {

        //Implement a command to provide the following statistics: the day with the highest
        // sales, the day with the lowest sales, the average sales for the entire week, and the
        // total number of sales for the week.


        System.out.println("Sales HashMap = " + sales);
        for (String i : sales.keySet()) {
            System.out.println(i + " : " + sales.get(i));
        }

        int max_sales = sales.get("Monday");
        int min_sales = sales.get("Monday");

        int total_sales = 0;
        double average_sales = 0.0;

        int need_var = 0;
        String need_day_max="Monday";
        String need_day_min="Monday";

        for (String i : sales.keySet())
        {
            need_var = sales.get(i);
            if (need_var>max_sales)
                {
                    max_sales = need_var;
                    need_day_max = i;
                }
            if (need_var<min_sales)
            {
                min_sales = need_var;
                need_day_min = i;
            }

            total_sales = total_sales + sales.get(i);


        }
        System.out.println("MAX DAY = " + need_day_max + " - sales = " + sales.get(need_day_max));
        System.out.println("MIN  DAY = " + need_day_min + " - sales = " + sales.get(need_day_min));
        System.out.println("TOTAL Sales = " + total_sales);
        average_sales =total_sales/5;
        System.out.println("AVERAGE SALES = " + average_sales);



    }
    public static Double registerPurchase (String day, int hour, String ticketType, Scanner userInput) {

        //● Implement a purchase command that will register a new purchase.
        //○ The day of the week, time and type of the ticket will be specified.
        //○ If the chosen period does not match the visiting schedule of the local
        //attraction, display the message: 'The purchase is not valid for the chosen
        //period.' along with options to select a new period or cancel the purchase.

       // System.out.println("DAY = " + day);
       // System.out.println("TIME = " + hour);
       // System.out.println("TypeTicket = " + ticketType);
       // System.out.println("USER INPUT = " + isOpen(day, hour));
        boolean retry = true;
        double price=0;

        do {

            if (isOpen(day, hour)) {
                price = returnPrice(ticketType, hour);
                System.out.println("Your purchase is: Day = " + day + ", Time = " + hour + ", Type = " + ticketType + ", Price = " + price);
                retry = false;
            } else {

                System.out.println("The purchase is not valid for the chosen period.");
                System.out.println("Do you want to choose a new period? or cancel the purchase? Enter yes to choose a new time or no to cancel");
                String option_scanner = userInput.nextLine();
                if (option_scanner.equals("yes")) {
                    System.out.println("Enter new hour. Use format HH");
                    hour = Integer.parseInt(userInput.nextLine());

                } else {
                    System.out.println("Purchase is canceled");
                    retry = false;
                }
            }
           // System.out.println("RETRY = "+retry);
        }while (retry);

        System.out.println("Do you want to proceed with Ticket Purchasing? Enter yes for purchase, no for cancelling the purchase.");
        String ticketPurchase = userInput.nextLine();
        if (ticketPurchase.equals("yes")) {

            sale = 1;

        } else {
            System.out.println("Purchase is canceled");
            sale =0;

        }
        return price;
    }


    public static double returnPrice(String ticketType, int time)
    {


        ArrayList<Integer> purchaseTicket = new ArrayList<>();
       // purchaseTicket = convertTime(time);
        int ora = time;

        double ticketPricePerTime = ticketPrice(ora);
      //  System.out.println("PRET TIKET PE TIMP = " + ticketPricePerTime);

        double finalPrice = 0;
        switch (ticketType)
        {
            case "adult":
                finalPrice = ticketPricePerTime;
                break;
            case "child":
                finalPrice = 0;
                break;
            case "senior":
                finalPrice = ticketPricePerTime/2;
                break;
            case "student":
                finalPrice = ((75*ticketPricePerTime)/100)  ;
                break;

        }
        return finalPrice;


    }

    public static boolean isOpen(String day, int time)
    {
        //Create a boolean method called isOpen that will take as parameters the day of the
        // week and the time of the arrival (e.g. hour) and returns true if the local attractions is
        // open on that time or false otherwise.

      //  System.out.println("DAY = " + day);
      //  System.out.println("Hour = "+ time);

        HashMap<String, String> visitingTimeTable = new HashMap<>();
        visitingTimeTable = visitingTimeTable();

        //System.out.println(" PROGRAM = "+ visitingTimeTable.get(day));

        // ora and Min are the variable for the TicketPurchase time
        int startTime, endTime;
        ArrayList<Integer> purchaseTicket = new ArrayList<>();
        //purchaseTicket = convertTime(time);
        //int ora = purchaseTicket.get(0);
       // int min = purchaseTicket.get(1);
       // System.out.println("ORA = "+ora);
       // System.out.println("min = "+ min);


        // programPerDayHour XXX is the schedule per day
        ArrayList<Integer> programPerDay = new ArrayList<>();
        programPerDay = convertStartEndProgram(visitingTimeTable.get(day));
        int programPerDayHourStart = programPerDay.get(0);
        int programPerDayMinStart = programPerDay.get(1);
        int programPerDayHourEnd = programPerDay.get(2);
        int programPerDayMinEnd = programPerDay.get(3);
      //  System.out.println("programPerDayHourStart = "+programPerDayHourStart);
       // System.out.println("programPerDayMinStart = "+ programPerDayMinStart);
       // System.out.println("programPerDayHourEnd = "+programPerDayHourEnd);
       // System.out.println("programPerDayMinEnd = "+ programPerDayMinEnd);

        Boolean isOpen = false;
        if ((time >= programPerDayHourStart) && (time < programPerDayHourEnd))
        {
          //  System.out.println("MATCH PROGRAMUL");
            isOpen = true;
        }

        return isOpen;

    }

    public static ArrayList<Integer> convertStartEndProgram(String time)
    {
        String[] splitTimeStartEnd = time.split(" - ");

        String startTime = splitTimeStartEnd[0];
        String endTime = splitTimeStartEnd[1];
       // System.out.println("STARTtIOME = "+startTime);
      //  System.out.println("end time = " + endTime);

        //Start time convert to INT to 0, 1 and end time h and min to 2, 3

        ArrayList<Integer> TimesHourMin = new ArrayList<Integer>();

        String[] splitTimeHourMin = startTime.split(":");
        int startHour = Integer.parseInt(splitTimeHourMin[0]);
        int startMin = Integer.parseInt(splitTimeHourMin[1]);

        TimesHourMin.add(startHour);
        TimesHourMin.add(startMin);
      //  System.out.println("Int H = "+startHour);
      //  System.out.println("Int M = "+startMin);

        splitTimeHourMin = endTime.split(":");
        startHour = Integer.parseInt(splitTimeHourMin[0]);
        startMin = Integer.parseInt(splitTimeHourMin[1]);
        TimesHourMin.add(startHour);
        TimesHourMin.add(startMin);
      //  System.out.println("Int H = "+startHour);
       // System.out.println("Int M = "+startMin);

        return TimesHourMin;
    }


    public static double ticketPrice(int hour)
    {
        /*
        Ticket Prices:
            08:00 - 12:00 | Price: $10.0
            12:00 - 17:00 | Price: $20.0
            17:00 - 20:00 | Price: $30.0
         */
        // declare the prices per three intervals:
        double priceTimeIntervalOne = 10.00;
        double priceTimeIntervalTwo = 20.00;
        double priceTimeIntervalThree = 30.00;

        //declare the time intervals:
        String[] timeIntervalOne = {"08:00", "11:59"};
        String[] timeIntervalTwo = {"12:00", "16:59"};
        String[] timeIntervalThree = {"17:00", "19:59"};

      //  System.out.println(timeIntervalOne[0] + "-" + timeIntervalOne[1]);
       // System.out.println(timeIntervalTwo[0] + "-" + timeIntervalTwo[1]);
      //  System.out.println(timeIntervalThree[0] + "-" + timeIntervalThree[1]);


        String[] startHourS = timeIntervalOne[0].split(":");
        int startHour = Integer.parseInt(startHourS[0]);
        int startMin = Integer.parseInt(startHourS[1]);

      //  System.out.println("String H = "+startHourS[0]);
     //   System.out.println("String Min = "+startHourS[1]);
      //  System.out.println("Int H = "+startHour);
      //  System.out.println("Int M = "+startMin);

        String[] endTimeOne = timeIntervalOne[1].split(":");
        int endHourOne = Integer.parseInt(endTimeOne[0]);
        int endMinOne = Integer.parseInt(endTimeOne[1]);

        // Interval Two
        String[] startTimeTwo = timeIntervalTwo[0].split(":");
        int startHourTwo = Integer.parseInt(startTimeTwo[0]);
        int startMinTwo = Integer.parseInt(startTimeTwo[1]);
        String[] endTimeTwo = timeIntervalTwo[1].split(":");
        int endHourTwo = Integer.parseInt(endTimeTwo[0]);
        int endMinTwo = Integer.parseInt(endTimeTwo[1]);

        // Interval Three
        String[] startTimeThree = timeIntervalThree[0].split(":");
        int startHourThree = Integer.parseInt(startTimeThree[0]);
        int startMinThree = Integer.parseInt(startTimeThree[1]);
        String[] endTimeThree = timeIntervalThree[1].split(":");
        int endHourThree = Integer.parseInt(endTimeThree[0]);
        int endMinThree = Integer.parseInt(endTimeThree[1]);

      //  System.out.println("price hour = " + hour);

      //  System.out.println("endh1 = " +endHourOne);
      //  System.out.println("startHourTwo = " +startHourTwo);
      //  System.out.println("endHourTwo = " +endHourTwo);
      //  System.out.println("startHourThree = " +startHourThree);
      //  System.out.println("endHourThree = " +endHourThree);

        double pret=0;
        if (hour<=endHourOne)
        {
           // System.out.println("pret = " + priceTimeIntervalOne);
            pret =  priceTimeIntervalOne;
        }
        else
            if ((hour >= startHourTwo) && (hour <= endHourTwo))
        {
          //  System.out.println("pret = " + priceTimeIntervalTwo);
            pret =   priceTimeIntervalTwo;
        }
            else
            if ((hour >= startHourThree) && (hour <= endHourThree))
            {
              //  System.out.println("pret = " + priceTimeIntervalThree);
                pret =   priceTimeIntervalThree;
            }
            else
                System.out.println("Outside the Hours");

            return pret;
    }



    public static String readPurchaseTime (Scanner userInput)
    {

        System.out.println("Please enter the time of Ticket purchase. Use the format HH:MM");
        String  readTime= userInput.nextLine();

        return readTime;
    }

    public static String readPurchaseDay (Scanner userInput)
    {

        System.out.println("Please enter the day of Ticket purchase. Use the format Monday, Tuesday, Wednesday, Thursday, Friday");
        String readDay= userInput.nextLine();

        return readDay;
    }

    public static String readPurchaseTicketType (Scanner userInput)
    {

        System.out.println("Please enter the type of the Ticket: child, student, adult, or senior");
        String readType= userInput.nextLine();

        return readType;
    }
    public static ArrayList<Integer> convertTime(String time)
    {
        String[] splitTime = time.split(":");

        int startHour = Integer.parseInt(splitTime[0]);
        int startMin = Integer.parseInt(splitTime[1]);
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        arrayL.add(startHour);
        arrayL.add(startMin);
      //  System.out.println("Int H = "+startHour);
      //  System.out.println("Int M = "+startMin);
        return arrayL;
    }
    public static int returnHour(String time)
    {
        String[] splitTime = time.split(":");

        return Integer.parseInt(splitTime[0]);

    }

    public static void priceMap ()
    {
        HashMap<Integer, Integer> ticketPrice1 = new HashMap<Integer, Integer>();

    }

    public static HashMap visitingTimeTable ()
    {
        // creating the visiting TimeTable using HashMap in which the keys are days of the week and the values are time intervals
        //            (opening and closing hours).

        HashMap<String, String> visitingTimeTable = new HashMap<String, String>();
        visitingTimeTable.put("Monday", "09:00 - 18:00");
        visitingTimeTable.put("Tuesday", "11:00 - 19:00");
        visitingTimeTable.put("Wednesday", "08:00 - 17:00");
        visitingTimeTable.put("Thursday", "09:00 - 20:00");
        visitingTimeTable.put("Friday", "10:00 - 18:00");
        //System.out.println("table = "+ visitingTimeTable);



        return visitingTimeTable;

    }
}
