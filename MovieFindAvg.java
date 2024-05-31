import java.util.*;

class Movie {
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    // Parameterized constructor
    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    // Getters and setters
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

public class MovieFindAvg {

    public static void main(String[] args) {
        // Read values for Movie objects, director, rating, and budget
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for (int i = 0; i < 4; i++) {
            int movieId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String director = scanner.nextLine();
            int rating = scanner.nextInt();
            int budget = scanner.nextInt();
            movies[i] = new Movie(movieId, director, rating, budget);
        }
        String director = scanner.next();
        int rating = scanner.nextInt();
        int budget = scanner.nextInt();

        // Call the findAvgBudgetByDirector method
        double avgBudget = findAvgBudgetByDirector(movies, director);
        if (avgBudget > 0) {
            System.out.println((int) avgBudget); // Convert double to int
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        // Call the getMovieByRatingBudget method
        Movie movie = getMovieByRatingBudget(movies, rating, budget);
        if (movie != null) {
            System.out.println(movie.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }

        // Close the scanner
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
