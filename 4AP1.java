public class MovieTicket {
    private String movieName;
    private String theatreName;
    private int seatNumber;
    private double price;

    // 1. Default constructor
    public MovieTicket() {
        this("Unknown", "Not Assigned", 0, 0.0);
    }

    // 2. Constructor with movie name
    public MovieTicket(String movieName) {
        this(movieName, "Not Assigned", 0, 200.0);
    }

    // 3. Constructor with movie name and seat number
    public MovieTicket(String movieName, int seatNumber) {
        this(movieName, "PVR", seatNumber, 200.0);
    }

    // 4. Full constructor
    public MovieTicket(String movieName, String theatreName, int seatNumber, double price) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to print ticket details
    public void printTicket() {
        System.out.println("\n=== MOVIE TICKET ===");
        System.out.println("Movie: " + movieName);
        System.out.println("Theatre: " + theatreName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        System.out.println("🎟️ MOVIE TICKET BOOKING SYSTEM 🎟️");

        // Ticket 1: Default constructor
        MovieTicket t1 = new MovieTicket();

        // Ticket 2: Constructor with movie name
        MovieTicket t2 = new MovieTicket("Avengers: Endgame");

        // Ticket 3: Constructor with movie name & seat number
        MovieTicket t3 = new MovieTicket("Inception", 12);

        // Ticket 4: Full constructor
        MovieTicket t4 = new MovieTicket("Oppenheimer", "IMAX", 45, 350.0);

        // Print all tickets
        t1.printTicket();
        t2.printTicket();
        t3.printTicket();
        t4.printTicket();
    }
}
