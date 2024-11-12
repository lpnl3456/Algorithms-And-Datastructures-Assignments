package RecursionAssignments;

public class Assignment {


    private static int  startAddAllDidgits(int n) {
        // Base case for recursion

        if (n%2 != 0) {
            return -1;
        }
        return addAllDidgits(n);


    }
    private static int  addAllDidgits(int n) {
        // Base case for recursion

            if (n == 0) {
                return 0;
            }
            return addAllDidgits(n / 10) + (n % 10);


    }

    private static String startDecimalToBinary(int n) {
        // Base case for recursion
        if (n == 0) {
            return "0";
        }
        return decimalToBinary(n);
    }

    private static String decimalToBinary(int n) {
        // Base case for recursion
        if (n == 0) {
            return "";
        }
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(startAddAllDidgits(10));
        System.out.println(startDecimalToBinary(1));
    }

}
