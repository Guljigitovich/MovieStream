import Classes.Cast;
import Classes.Director;
import Classes.Movie;
import ClassesImpl.FindAbleImpl;
import ClassesImpl.SortAbleImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cast cast = new Cast("Dwayne Johnson","Black Adam");
        Cast cast1 = new Cast("Ryan Reynolds","Deadpool");
        Cast cast2 = new Cast("Leonardo Dicaprio","Jack");
        Cast cast3 = new Cast("Vin Diesel","Dominic Toretto");
        Cast cast4 = new Cast("Scarlett Johansson","Natasha Romanoff");
        ArrayList<Cast> casts = new ArrayList<>(
                Arrays.asList(cast,cast1,cast2,cast3,cast4)
        );

        Director director = new Director("Jaume ","Collet Serra");
        Director director1 = new Director("James ","Cameron");
        Director director2 = new Director("Tim ","Miller");
        Director director3 = new Director("Justin ","Lin");
        Director director4 = new Director("Keit ","Shordland");
        ArrayList<Director>directors = new ArrayList<>(
                Arrays.asList(director1,director4,director2,director3,director)
        );

        Movie movie = new Movie("Deadpool",2016,"Comic Marvel",director,cast1);
        Movie movie1 = new Movie("Titanic",1997,"Romantic Drama, Movie Disaster",director2,cast2);
        Movie movie2 = new Movie("Black Adam",2022,"Comic DC",director3,cast);
        Movie movie3 = new Movie("Black Widow",2021,"Comic Marvel",director1,cast4);
        Movie movie4 = new Movie("Fast and Furious",2001,"Crime Thriller",director4,cast3);
        ArrayList<Movie>movies = new ArrayList<>(
                Arrays.asList(movie1,movie2,movie4,movie3,movie)
        );

        FindAbleImpl findAble = new FindAbleImpl();
        SortAbleImpl sortAble = new SortAbleImpl();


        while (true) {
           try {
               System.out.print("""
                       Press 1 : Get all movies.
                       Press 2 : Find movie by name.
                       Press 3 : Find movie actor name .
                       Press 4 : Find movie description .
                       Press 5 : Find movie director name .
                       Press 6 : Find movie by year.
                       Press 7 : Find movie by role .
                       Press 8 : Sort by movie name.
                       Press 9 : Sort movie year .
                       Press 10 : Sort by director.
                                    
                       """);
               System.out.println("Write the number !");
               int number = new Scanner(System.in).nextInt();
               switch (number) {
                   case 1 -> System.out.println(findAble.getAllMovies(movies));
                   case 2 -> System.out.println(findAble.findMovieByName(movies));
                   case 3 -> System.out.println(findAble.findMovieByActorName(movies));
                   case 4 -> System.out.println(findAble.findMovieByDescription(movies));
                   case 5 -> System.out.println(findAble.findMovieByDirector(movies));
                   case 6 -> System.out.println(findAble.findMovieByYear(movies));
                   case 7 -> System.out.println(findAble.findMovieByRole(movies));
                   case 8 -> System.out.println(sortAble.sortByMovieName(movies));
                   case 9 -> System.out.println(sortAble.sortByYear(movies));
                   case 10 -> System.out.println(sortAble.sortByDirector(movies));
               }
           }catch (InputMismatchException e){
               System.out.println("You must write a number not a word");
           }
        }
    }
}