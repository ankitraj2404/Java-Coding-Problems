/* Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, 
and methods for adding and retrieving reviews. */

import java.util.*;

class Movie {
    private String title;
    private String director;
    private String review;
    Actors actor[] = new Actors[5];
    int count = 0;

    public Movie(String title, String director) {
        this.director = director;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addActor(Actors newActor) {
        actor[count++] = newActor;
        System.out.println("Actor added successfully");
    }

    public void addReview(String review) {
        this.review = review;
    }

    public void displayMovie() {
        System.out.print("------------------------" + "\n");
        System.out.print("Movie Name: " + title + "\n");
        System.out.print("Director Name: " + director + "\n");
        System.out.print("Review of the movie: " + review + "\n");
        System.out.print("------------------------" + "\n");
    }

    public void showAllActors() {
        for (int i = 0; i < count; i++) {
            actor[i].display();
        }
    }
}

class Actors {
    private String actorName;
    private int actorAge;

    public Actors(String actorName, int actorAge) {
        this.actorAge = actorAge;
        this.actorName = actorName;
    }

    public void display() {
        System.out.print("-------------------" + "\n");
        System.out.print("Actor Name: " + actorName + "\n");
        System.out.print("Actors Age: " + actorAge + "\n");
        System.out.print("-------------------" + "\n");
    }
}

public class Problem61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Movie title: ");
        String title = sc.nextLine();
        System.out.println("Enter the director of the movie: ");
        String director = sc.nextLine();

        Movie newMovie = new Movie(title, director);

        System.out.println("Enter the review for the movie " + newMovie.getTitle());
        String review = sc.nextLine();

        newMovie.addReview(review);

        System.out.println("Enter the name and age of the Actor in movie " + newMovie.getTitle());
        String actorName = sc.nextLine();
        int actorAge = sc.nextInt();
        sc.close();

        Actors actor1 = new Actors(actorName, actorAge);
        newMovie.addActor(actor1);

        newMovie.displayMovie();
        newMovie.showAllActors();

    }

}
