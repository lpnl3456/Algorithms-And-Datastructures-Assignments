import java.util.Scanner;

public class QuestionOne {
    
    //Funcation to add temperature to an array
    public static double [] inputTemp(int amountOfTemp){
        Scanner scanner = new Scanner(System.in);
        

         double []tempArray =  new double[amountOfTemp];

        for(int i = 0; i < amountOfTemp; i++){

            System.out.println("Enter the month's temperature: ");
            tempArray[i] = scanner.nextDouble();
            System.out.println("Temperature Added");
            System.out.println();

        }
        return tempArray;

    }

    //Funcation to get the average temperature
    public static double getAverageTemp(double [] tempertures){
        double sum = 0.0;

        for(int i = 0; i < tempertures.length; i++){
            sum+= tempertures[i];
        }

        return sum/tempertures.length;

    }

    //Funcation to get the amount of temperatures that are above the avarage temperature
    public static int aboveAverge(double averge, double [] tempertures){
        int amountAboveAverge = 0;

       for (int i = 0; i < tempertures.length; i++){

            if(tempertures[i] > averge){
                amountAboveAverge++;
            }            

        }
        return amountAboveAverge;

    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entr the amount of temperatures to be added");

        int amountOfTemps = scanner.nextInt();

         double [] tempertures = inputTemp(amountOfTemps);

         double averge = getAverageTemp(tempertures);
         System.out.println("The avarage temperature is " + averge);

        System.out.println("There are " + aboveAverge(averge, tempertures) + " temperature above the averge temperatures");

    }
}
