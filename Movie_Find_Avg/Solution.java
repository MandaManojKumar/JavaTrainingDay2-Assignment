package Movie_Find_Avg;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for (int i = 0; i < 4; i++) {
            int movieId = scanner.nextInt();
            scanner.nextLine(); 
            String director = scanner.nextLine();
            int rating = scanner.nextInt();
            int budget = scanner.nextInt();
            movies[i] = new Movie(movieId, director, rating, budget);
        }
        String director = scanner.next();
        int rating = scanner.nextInt();
        int budget = scanner.nextInt();


        double avgBudget = findAvgBudgetByDirector(movies, director);
        if (avgBudget > 0) {
            System.out.println((int) avgBudget); 
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }


        Movie movie = getMovieByRatingBudget(movies, rating, budget);
        if (movie != null) {
            System.out.println(movie.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }


        scanner.close();
    }

    public static double findAvgBudgetByDirector(Movie[] movies, String director) {
        int count = 0;
        int totalBudget = 0;
        for (Movie movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                totalBudget += movie.getBudget();
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalBudget / count;
    }

    public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget) {
        for (Movie movie : movies) {
            if (movie.getRating() == rating && movie.getBudget() == budget && budget % rating == 0) {
                return movie;
            }
        }
        return null;
    }
}
