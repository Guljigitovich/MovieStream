package ClassesImpl;

import Classes.Movie;
import Service.FindAble;

import java.util.List;
import java.util.Scanner;

public class FindAbleImpl implements FindAble {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        movies.forEach(s-> System.out.println(s.toString()));
        return movies;
    }

    @Override
    public String findMovieByName(List<Movie> movies) {
        System.out.println("Write the movie name : ");
        String movieName = new Scanner(System.in).nextLine();
        movies.stream().filter(s->s.getName().equals(movieName.toUpperCase())).forEach(s-> System.out.println(s.toString()));
        return "Successfully found by name!\n" +
                "Movie name : "+movieName;
    }

    @Override
    public String findMovieByActorName(List<Movie> movies) {
        System.out.println("Write the actor name : ");
        String actorName = new  Scanner(System.in).nextLine();
        movies.stream().filter(s->s.getCast().getActorFullName().equals(actorName.toUpperCase())).forEach(x-> System.out.println(x.toString()));
  return "Successfully found by name!\n"+"Actor name :"+actorName;
    }

    @Override
    public int findMovieByYear(List<Movie> movies) {
        System.out.println("Write the movie year : ");
        int movieYear = new Scanner(System.in).nextInt();
        movies.stream().filter(x->x.getYear() == movieYear).forEach(s-> System.out.println(s.toString()));
        return movieYear;
    }

    @Override
    public String findMovieByDirector(List<Movie> movies) {
        System.out.println("Write the movie director name : ");
        String movieDirector = new Scanner(System.in).nextLine();
        movies.stream().filter(s->s.getDirector().getLastName().equals(movieDirector.toUpperCase())).forEach(x-> System.out.println(x.toString()));
 return "Successfully found by name director!\n"+
         "Director name "+movieDirector;
    }

    @Override
    public String findMovieByDescription(List<Movie> movies) {
        System.out.println("Write the movie description : ");
        String descriptionName = new  Scanner(System.in).nextLine();
        movies.stream().filter(s->s.getDescription().equals(descriptionName.toUpperCase())).forEach(s-> System.out.println(s.toString()));
        return "Successfully found by movie description!\n"+
                "Movie description "+descriptionName;
    }

    @Override
    public String findMovieByRole(List<Movie> movies) {
        System.out.println("Write the movie actor role : ");
        String roleName = new  Scanner(System.in).nextLine();
        movies.stream().filter(s->s.getCast().getRole().equals(roleName.toUpperCase())).forEach(s-> System.out.println(s.toString()));
        return "Successfully found by movie a actor role!\n"+
                "Actor role in movie "+roleName;
    }
}
