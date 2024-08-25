

    import java.util.Scanner;
    import java.util.HashMap;
    import java.util.Map;


    public class priceT {

        public static void main(String[] args) {

            // Create a Map to store the visiting timetable
            Map<String, String> visitingTimetable = new HashMap<>();

            // Populate the Map with visiting days and corresponding time intervals
            visitingTimetable.put("Monday", "09:00 - 18:00");
            visitingTimetable.put("Tuesday", "11:00 - 19:00");
            visitingTimetable.put("Wednesday", "08:00 - 17:00");
            visitingTimetable.put("Thursday", "09:00 - 20:00");
            visitingTimetable.put("Friday", "10:00 - 18:00");

            // Display the visiting timetable
            System.out.println("Visiting Timetable:");
            for (Map.Entry<String, String> entry : visitingTimetable.entrySet()) {
                String day = entry.getKey();
                String hours = entry.getValue();
                System.out.println(day + ": " + hours);
            }


            Scanner scanner = new Scanner(System.in);

            // Prompt user for input
            System.out.print("Enter the time in HH:MM format (24-hour): ");
            String inputTime = scanner.nextLine();

            // Validate the input
            if (!isValidTime(inputTime)) {
                System.out.println("Invalid time format. Please enter time in HH:MM format.");
                return;
            }

            // Parse hour and minute
            String[] parts = inputTime.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);

            // Calculate ticket price based on the interval
            double price = calculateTicketPrice(hour, minute);

            // Output the result
            if (price >= 0) {
                System.out.printf("The price of the ticket at %s is: $%.2f%n", inputTime, price);
            } else {
                System.out.println("Time is out of the selling intervals.");
            }

            scanner.close();
        }

        private static boolean isValidTime(String time) {
            return time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
        }

        private static double calculateTicketPrice(int hour, int minute) {
            if (hour < 8 || hour > 20 || (hour == 20 && minute > 0)) {
                return -1; // Outside of operational hours
            }

            if (hour >= 8 && hour < 12) {
                return 10.0;
            } else if (hour >= 12 && hour < 17) {
                return 20.0;
            } else { // hour >= 17 and hour < 20
                return 30.0;
            }
        }
    }

/*
The expression time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]") is a regular expression used in Java to validate whether a string represents a valid time in the 24-hour format ("HH:MM"). Let's break it down step by step:

1. time.matches(...)
The matches() method checks if the entire string (time in this case) matches the given regular expression. If it does, it returns true; otherwise, it returns false.
2. Regular Expression Breakdown
The pattern itself is ([01]?[0-9]|2[0-3]):[0-5][0-9]. Here's how it works:
a. ([01]?[0-9]|2[0-3])
This part of the regex is used to match the hour (HH) component of the time.
([01]?[0-9]...):
[01]? – Matches an optional 0 or 1. (This means that we could have "0" or "1" at the start of the hour, which allows for hours like 00, 01, 02, etc.)
[0-9] – Matches any digit from 0 to 9. This means that the hour can be represented as a number between 0 and 19.
| – This stands for "or". This means either the left-hand side or the right-hand side of the condition can match.
(2[0-3]): – Matches hours starting with 2 followed by any digit from 0 to 3, which allows for valid hours from 20 to 23.
So, this whole part matches valid hours:

From 00 to 09 (thanks to the optional leading zero and the last digit being 0-9)
From 10 to 19
From 20 to 23
b. :
This simply matches the colon character (:) that separates the hour and minute in the time format.
c. [0-5][0-9]
This part matches the minute (MM) component of the time.
[0-5] – Matches any digit from 0 to 5, which corresponds to the first digit of the minutes.
[0-9] – Matches any digit from 0 to 9, which corresponds to the second digit of the minutes.
Thus, valid minutes can range from 00 to 59.

Overall Meaning:
The entire expression ([01]?[0-9]|2[0-3]):[0-5][0-9] checks if the input string:

Represents a valid hour in 24-hour format (from 00 to 23)
Followed by a colon (:)
Followed by valid minutes (from 00 to 59)
Examples:
00:00 -> Valid
12:30 -> Valid
23:59 -> Valid
24:00 -> Invalid (24 is not a valid hour)
12:60 -> Invalid (60 is not a valid minute)
8:30 -> Valid (as it allows for a single digit hour)
In summary, this regex validates that the input string fits the expected format for representing time in 24-hour format, ensuring both the hour and minute components are within their valid ranges.


 */
