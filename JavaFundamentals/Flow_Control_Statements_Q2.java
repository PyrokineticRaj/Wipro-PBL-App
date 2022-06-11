package JavaFundamentals;

public class Flow_Control_Statements_Q2 {
    public static void main(String[] args) {
        checkNum(3);
    }

    public static void checkNum(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
