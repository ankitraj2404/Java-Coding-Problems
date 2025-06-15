/*
 Write a Java program to create a class called "Airplane" with a flight number, destination, 
 and departure time attributes, and methods to check flight status and delay.
 */

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;

    public Airplane(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void checkDelay(LocalTime currenTime) {
        if (currenTime.isAfter(departureTime)) {
            System.out.println(this.flightNumber + " flight is delayed");
        } else {
            System.out.println(this.flightNumber + " is not delayed");
        }
    }

    public void display() {
        System.out.print("---------------------------------" + "\n");
        System.out.print("Flight Number: " + flightNumber + "\n");
        System.out.print("Destination: " + destination + "\n");
        System.out.print("Departure Time: " + departureTime + "\n");
        System.out.print("---------------------------------" + "\n");
    }

}

public class Problem56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM");
        System.out.println("Enter the flight number and destination: ");
        String flightNumber = sc.nextLine();
        String destination = sc.nextLine();

        Airplane plane1 = new Airplane(flightNumber, destination);

        System.out.println("Enter the departure time: ");
        String time = sc.nextLine();

        LocalTime departureTime = LocalTime.parse(time, formatter);
        plane1.setDepartureTime(departureTime);

        plane1.display();

        System.out.println("Enter the current time(HH:MM): ");
        String currentTime = sc.nextLine();
        sc.close();

        LocalTime newTime = LocalTime.parse(currentTime, formatter);
        plane1.checkDelay(newTime);
    }
}