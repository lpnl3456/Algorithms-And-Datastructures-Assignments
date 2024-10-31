package Assignment7;

public class Main {
    public static void main(String[] args) {

        StackArrays stack = new StackArrays(7);

        stack.push(3);
        stack.push(6);
        stack.push(12);
        stack.push(67);
        stack.push(92);
        stack.push(1);
        stack.push(9);

        stack.peek();

        stack.pop();
        stack.peek();

        stack.pop();
        stack.peek();

        stack.pop();
        stack.peek();

        stack.pop();
        stack.peek();

        stack.pop();
        stack.peek();
    }
}
