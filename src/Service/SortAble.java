package Service;

import Classes.Movie;

import java.util.List;

public interface SortAble {
    String sortByMovieName(List<Movie> movies);
    String sortByYear(List<Movie>movies);
    String sortByDirector(List<Movie>movies);
}
