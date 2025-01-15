import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Room class
class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private double pricePerNight;

    public Room(int roomNumber, String roomType, boolean isAvailable, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + roomType + ") - $" + pricePerNight + " per night";
    }
}

// Hotel class
class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    // Add a room to the hotel
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Display all rooms
    public void displayRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            System.out.println(room + (room.isAvailable() ? " (Available)" : " (Booked)"));
        }
    }

    // Book a room
    public boolean bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (room.isAvailable()) {
                    room.setAvailable(false);
                    System.out.println("Room " + roomNumber + " has been successfully booked.");
                    return true;
                } else {
                    System.out.println("Room " + roomNumber + " is already booked.");
                    return false;
                }
            }
        }
        System.out.println("Room " + roomNumber + " does not exist.");
        return false;
    }

    // Check room availability
    public void checkAvailability(String roomType) {
        System.out.println("Checking availability for room type: " + roomType);
        boolean found = false;
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType) && room.isAvailable()) {
                System.out.println(room);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available rooms for the type: " + roomType);
        }
    }

    // Calculate total charges
    public double calculateCharges(int roomNumber, int nights) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room.getPricePerNight() * nights;
            }
        }
        System.out.println("Room " + roomNumber + " does not exist.");
        return 0;
    }
}

// Main class
public class HotelReservationSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Add rooms to the hotel
        hotel.addRoom(new Room(101, "Single", true, 50.0));
        hotel.addRoom(new Room(102, "Double", true, 75.0));
        hotel.addRoom(new Room(103, "Suite", true, 120.0));
        hotel.addRoom(new Room(104, "Deluxe", true, 150.0));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHotel Reservation System:");
            System.out.println("1. Display Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Check Room Availability");
            System.out.println("4. Calculate Total Charges");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter the room number to book: ");
                    int roomNumber = scanner.nextInt();
                    hotel.bookRoom(roomNumber);
                    break;
                case 3:
                    System.out.print("Enter the room type to check availability: ");
                    scanner.nextLine(); // consume the newline
                    String roomType = scanner.nextLine();
                    hotel.checkAvailability(roomType);
                    break;
                case 4:
                    System.out.print("Enter the room number: ");
                    int roomNum = scanner.nextInt();
                    System.out.print("Enter the number of nights: ");
                    int nights = scanner.nextInt();
                    double totalCharges = hotel.calculateCharges(roomNum, nights);
                    if (totalCharges > 0) {
                        System.out.println("Total charges for " + nights + " night(s): $" + totalCharges);
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Hotel Reservation System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
