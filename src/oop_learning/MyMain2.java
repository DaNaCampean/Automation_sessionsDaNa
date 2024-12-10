package oop_learning;

public class MyMain2 {

        public static void main(String[] args) {
// Initialize movies
            Movie ep5 = new Movie();
            ep5.setName("Star Wars: Episode V - The Empire Strikes Back");
            ep5.setScore(8.7); ep5.setYear(1980); ep5.setLength(124);
            Movie ep4 = new Movie();
            ep4.setName("Star Wars: Episode IV - A New Hope"); ep4.setScore(8.6);
            ep4.setYear(1977);
            ep4.setLength(121);
            Movie ep6 = new Movie();
            ep6.setName("Star Wars: Episode VI - Return of the Jedi"); ep6.setScore(8.3);
            ep6.setYear(1983);
            ep6.setLength(131);
// Compare ep4 and ep5 System.out.printf(
            """
            ep4, ep5 comparisons:
            name
            year
            score
            length
            passed years: %d
            """,
                    Movie.compareName(ep4, ep5), Movie.compareYear(ep4, ep5), Movie.compareScore(ep4, ep5), Movie.compareLength(ep4, ep5), Movie.comparePassedYears(ep4, ep5)
);
// Create a movie series
            MovieSeries series = new MovieSeries(); series.add(ep5);
            series.add(ep4);
            series.add(ep6);
// Sort and print the series series.sort(); series.print();
        } }
}
