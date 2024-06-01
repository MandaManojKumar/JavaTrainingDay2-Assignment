package Movie_Get_Movie_By_Genre;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for (int i = 0; i < 4; i++) {
            String movieName = scanner.next();
            String company = scanner.next();
            String genre = scanner.next();
            int budget = scanner.nextInt();
            movies[i] = new Movie(movieName, company, genre, budget);
        }
        String searchGenre = scanner.next();

        Movie[] resultMovies = getMovieByGenre(movies, searchGenre);

        for (Movie movie : resultMovies) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }


        scanner.close();
    }

    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                result.add(movie);
            }
        }
        return result.toArray(new Movie[0]);
    }
}
