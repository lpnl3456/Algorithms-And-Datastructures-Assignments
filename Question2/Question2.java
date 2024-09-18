package Question2;

public class Question2 {
    int arr [][] = null;

    public Question2 (int sizeOfFirstArray, int sizeOfSecondArray){
    arr = new int [sizeOfFirstArray] [sizeOfSecondArray];

    for (int i = 0; i < arr.length; i++){
        for(int array2i = 0; array2i < arr[i].length; array2i++){
            arr[i][array2i] = Integer.MIN_VALUE;
        }
    }
    }

    public void insert(int valueToInsert, int index1, int index2){
        try {
            if (arr[index1][index2] == Integer.MIN_VALUE){
                arr[index1][index2] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This Cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }

     //Traverse an array
     public void traverse(){
        try {
            for (int i = 0; i < arr.length; i++){
                System.out.println("Row " + (i + 1) +  " Values: ");
                for(int array2i = 0; array2i < arr[i].length; array2i++){
                    System.out.println(arr[i][array2i] + " ");
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }

    public void searchArray (int valueToSearch){
        for (int i = 0; i < arr.length; i++){
            for(int array2i = 0; array2i < arr[i].length; array2i++){
            if (arr[i][array2i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i + " " + array2i);
                return;
            }
        }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void deleteValueAtIndex (int index1, int index2) {
        try {
            arr[index1] [index2] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        Question2 doubeArray = new Question2(3,4);

        doubeArray.insert(6, 0, 1);
        doubeArray.insert(3, 2, 3);
        doubeArray.insert(7, 1, 1);

        doubeArray.traverse();

        doubeArray.searchArray(9);

        doubeArray.deleteValueAtIndex(2, 1);
        doubeArray.traverse();
    }
}
