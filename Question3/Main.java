package Question3;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static ArrayList<Seat> seats = new ArrayList<Seat>();

    //Method to create all the seats
    public  static void createSeats(int numSeats){

        for(int seatNumber = 0; seatNumber < numSeats; seatNumber++){
            seats.add(new Seat(seatNumber + 1));
        }
    }

    //Method to display the seats
    public static void displaySeats(Seat displaySeats [][]){
        for(int i = 0; i < displaySeats.length-1; i++){
            System.out.print((i) + " ");
            for(int i2 = 0; i2 < displaySeats[i].length; i2++){

                if(displaySeats[i][i2].isReserved() == false){
                    System.out.print("A ");
                }
                else{
                    System.out.print("T ");
                }
            }
            System.out.println();
            System.out.println();
        }

        System.out.print("  " + 1 + " ");
        
        for(int i2 = 1; i2 < displaySeats[0].length; i2++){
            
            System.out.print( (i2 + 1) +" ");
        }
        System.out.println("");
        
    }

    //Method to reserve a seat
    public static void reserveSeat(){
        Scanner input = new Scanner(System.in);
        boolean foundSeat = false;
        int seatNumber =  0;


        System.out.println("Enter the seat number you wish to reserve");
        try{
         seatNumber = input.nextInt();
        }

        catch(InputMismatchException e){
            
        }
        System.out.println("");

        for(Seat seat: seats){

            if(seat.getSeatNumber() == seatNumber){
                seat.reserveSeat();
                foundSeat = true;
            }
        }

        if(foundSeat == false){
            System.out.println("Seat does not exist");
        }
    }

    //Method to cancel a reservation
    public static void cancelSeat(){
        Scanner input = new Scanner(System.in);
        boolean foundSeat = false;
        int seatNumber =  0;


        System.out.println("Enter the seat number you wish to cancel");
    
        try{
         seatNumber = input.nextInt();
        }

        catch(InputMismatchException e){
            
        }
        for(Seat seat: seats){

            if(seat.getSeatNumber() == seatNumber){
                seat.cancelSeat();
                foundSeat = true;
            }
        }

        if(foundSeat == false){
            System.out.println("Seat does not exist");
        }



    }



    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(5, 8);
        Seat displaySeats [][] = new Seat[theater.getNumRows()][theater.getSeatPerRow()];
        int numSeats = (theater.getNumRows() * theater.getSeatPerRow());
        boolean exit = false;
        Scanner input = new Scanner(System.in);

       

        createSeats(numSeats);

        for(int i = 0; i < displaySeats.length - 1; i++){
            for(int i2 = 0; i2 < displaySeats[i].length; i2++){

                int seatNumber = (i*10) + (i2);
                Seat seat = seats.get(seatNumber);
                displaySeats[i][i2] = seat;
            }
        }

        

        while (exit == false){
            System.out.println("Welcome to " + theater.getName() + ", please enter an option");
            System.out.println("Main Menu \n1. Reserve Seat (1) \n2. Cancel A reservation (2) \n3. Exit( 3)");
            String option = input.nextLine();

            System.out.println();
            switch(option){
                case "1":
                displaySeats(displaySeats);
                reserveSeat();
                break;
                case "2":
                displaySeats(displaySeats);
                cancelSeat();
                break;

                case "3":
                exit = true;
                System.out.println("Thank you for using the program");
                break;

                default:
                System.out.println("Invalid input- Please try again");
                break;
            }

            System.out.println();

        }




    }
}
