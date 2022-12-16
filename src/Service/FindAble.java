package Service;

import Classes.Movie;

import java.util.List;

public interface FindAble {
    List<Movie> getAllMovies(List<Movie>movies);
    String findMovieByName(List<Movie>movies);
   String findMovieByActorName(List<Movie>movies);
    int findMovieByYear(List<Movie>movies);
    String findMovieByDirector(List<Movie>movies);
    String findMovieByDescription(List<Movie>movies);
    String findMovieByRole(List<Movie>movies);
}
