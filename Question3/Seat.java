package Question3;

public class Seat {
    private final int seatNumber;
    private boolean reserved = false;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    //reserve seat
    public void reserveSeat(){
        if(reserved == false){
            reserved = true;
            System.out.println("Your seat had been succesffuly reserved");
        }

        else{
            System.out.println("This seat is already reserved, please select another one");
        }
    }
    //cancel seat

    public void cancelSeat(){
        if(reserved == true){
            reserved = false;
            System.out.println("Your reservation has be canceled");
        }

        else{
            System.out.println("You have not reserved this seat");
        }
    }
    

}
