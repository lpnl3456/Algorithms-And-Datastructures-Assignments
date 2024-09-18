package Question3;

public class MovieTheater {
    final String Name = "Malaga Theater";
    int numRows;
    int seatPerRow;

    public MovieTheater(int numRows, int seatsPerRow){
        this.numRows = numRows;
        this.seatPerRow = seatsPerRow;
    }

    public String getName() {
        return Name;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getSeatPerRow() {
        return seatPerRow;
    }

    public void setSeatPerRow(int seatPerRow) {
        this.seatPerRow = seatPerRow;
    }

    
}
