package Question3;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Seat> seats = new ArrayList<Seat>();
    public  static void createSeats(int numSeats){

        for(int seatNumber = 0; seatNumber < numSeats; seatNumber++){
            seats.add(new Seat(seatNumber + 1));
        }
    }


    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(5, 8);
        Seat displaySeats [][] = new Seat[theater.getNumRows()][theater.getSeatPerRow()];
        int numSeats = (theater.getNumRows() * theater.getSeatPerRow());

        for(int i = 0; i < displaySeats[1].length; i++){
            
        }

        createSeats(numSeats);




    }
}
