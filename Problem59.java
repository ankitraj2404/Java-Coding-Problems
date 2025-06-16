/* Write a Java program to create a class called "MusicLibrary" with a collection of 
songs and methods to add and remove songs, and to play a random song. */

import java.util.*;

class MusicLibrary {
    Song[] song = new Song[10];
    int count = 0;

    public void addSong(Song newSong) { // Add new song
        song[count++] = newSong;
        System.out.println("Song added successfully");

    }

    public void removeSong(String songName) { // Remove song
        if (count == 0) {
            System.out.println("No songs available");
            return;
        }
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (song[i].getsongName().equalsIgnoreCase(songName)) {
                for (int j = i; j < count - 1; j++) {
                    song[j] = song[j + 1];
                }
                song[--count] = null;
                found = true;
                System.out.println("Song removed successfully");
            }
        }
        if (!found) {
            System.out.println("Song not found");
        }
    }

    public void playRandomSong() { // Playing random song
        if (count == 0) {
            System.out.println("No songs available to play");
            return;
        }

        Random rand = new Random();
        int randomIndex = rand.nextInt(count);
        System.out.println("Now playing a random song: ");
        song[randomIndex].display();
    }

    public void showAllSong() { // Show All songs
        for (int i = 0; i < count; i++) {
            song[i].display();
        }
    }
}

class Song { // Song class
    private String songName;
    private String singerName;

    public Song(String songName, String singerName) {
        this.songName = songName;
        this.singerName = singerName;
    }

    public String getsongName() {
        return songName;
    }

    public void display() {
        System.out.print("-------------------------" + "\n");
        System.out.print("Song Name: " + songName + "\n");
        System.out.print("Singer Name: " + singerName + "\n");
        System.out.print("-------------------------" + "\n");
    }
}

public class Problem59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicLibrary library = new MusicLibrary();

        try {
            while (true) {
                System.out.print("----------MENU-----------" + "\n");
                System.out.println("1. Add new song");
                System.out.println("2. Remove existing song");
                System.out.println("3. Play Random song");
                System.out.println("4. Show All songs in the library");
                System.out.println("5. Exit");
                System.out.print("----------END---------" + "\n");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter name of the song: ");
                        String songName = sc.nextLine();
                        System.out.println("Enter singer name: ");
                        String singerName = sc.nextLine();

                        Song newSong = new Song(songName, singerName);
                        library.addSong(newSong);
                        break;

                    case 2:
                        System.out.println("Enter song name to remove: ");
                        String removeSongName = sc.nextLine();
                        library.removeSong(removeSongName);
                        break;

                    case 3:
                        library.playRandomSong();
                        break;

                    case 4:
                        library.showAllSong();
                        break;

                    case 5:
                        System.out.println("Exiting......Thank you");
                        return;

                    default:
                        System.out.println("Invalid input");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        } finally {
            sc.close();
        }
    }
}
