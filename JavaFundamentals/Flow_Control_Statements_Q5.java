package JavaFundamentals;

public class Flow_Control_Statements_Q5 {
    public static void main(String[] args) {
        char c = 'a';
        if (Character.isAlphabetic(c)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(c)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
