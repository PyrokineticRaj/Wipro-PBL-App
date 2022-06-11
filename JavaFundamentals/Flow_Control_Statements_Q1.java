package JavaFundamentals;

public class Flow_Control_Statements_Q1 {
    public static void main(String[] args) {
        checkNum(4);
        sameDigit(23, 34);
    }

    public static void checkNum(int a) {
        if (a == 0) {
            System.out.println("Zero");
        } else if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void sameDigit(int a, int b) {
        if (a % 10 == b % 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
