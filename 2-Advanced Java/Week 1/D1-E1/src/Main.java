import flight.Exceptions.InvalidInputException;
import flight.Models.Flight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidInputException {
        Scanner Sc = new Scanner(System.in);
        do
        {
            try {
                System.out.println("Enter the passenger name");
                String name = Sc.nextLine();
                System.out.println("Enter destination");
                String destination = Sc.nextLine();
                System.out.println("Enter the date of journey (dd-mm-yyyy)");
                String dateString = Sc.nextLine();
                System.out.println("Enter the number of seats to be booked");
                String bookedSeats = Sc.nextLine();
                if (name == null || name.isEmpty() ||
                            destination == null || destination.isEmpty() ||
                            dateString == null || dateString.isEmpty() || bookedSeats == null || bookedSeats.isEmpty() || Integer.parseInt(bookedSeats) < 0) {
                    throw new InvalidInputException("Invalid Input");
                }

                // Create an instance of DateTimeFormatter using the pattern
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                // Parse the date string using the formatter
                LocalDate date = LocalDate.parse(dateString, formatter);
                System.out.println("Enter the number of passengers");

                String[] flightDetailsArray = {name, destination, dateString, bookedSeats};
                Flight flight = new Flight(flightDetailsArray[0], flightDetailsArray[1], date, Integer.parseInt(flightDetailsArray[3]));
                System.out.println("Flight Details");
                System.out.println("Flight Name: " + flight.getName());
                System.out.println("Destination: " + flight.getDestination());
                System.out.println("Date: " + flight.getDate());
                System.out.println("Seats booked: " + flight.getBookedSeats());
                if (flight.checkAvailability()) {
                    System.out.println("Booking available");
                } else {
                    System.out.println("Booking closed");
                }
                System.out.println("Do you want to continue?(yes/no)");
                Sc.nextLine();
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format");
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid Input");
            } finally {
                System.out.println("Do you want to continue?(yes/no)");
            }
        } while (!Sc.nextLine().equals("exit"));
        throw new InvalidInputException("Invalid Input");
    }
}
