package ClassesImpl;

import Classes.Movie;
import Service.SortAble;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAbleImpl implements SortAble {

    @Override
    public String sortByMovieName(List<Movie> movies) {
        System.out.println("Sort by movie name from A to Z : ");
        movies.stream().sorted(Comparator.comparing(Movie::getName)).forEach(s-> System.out.println(s.toString()));
        System.out.println("Sort be movie name from Z to A : ");
        movies.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(s-> System.out.println(s.toString()));
        return "Successfully sort by movie name !";
    }

    @Override
    public String sortByYear(List<Movie> movies) {
        System.out.println("Sort by movie year Ascending");
        movies.stream().sorted(Comparator.comparingInt(Movie::getYear)).forEach(s-> System.out.println(s.toString()));
        System.out.println("Sort by movie year Descending");
        movies.stream().sorted((o1, o2) -> o2.getYear()-o1.getYear()).forEach(s-> System.out.println(s.toString()));
return "Successfully sort by movie year !";
    }

    @Override
    public String sortByDirector(List<Movie> movies) {
        System.out.println("Sort by director : ");
        movies.stream().sorted(Comparator.comparing(o -> o.getDirector().getName())).forEach(s-> System.out.println(s.toString()));
return "Successfully sort by movie director !";
    }
}
