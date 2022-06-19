package JavaFundamentals;

public class Flow_Control_Statements_Q3 {
    public static void main(String[] args) {
        String output = "";
        if (args[0] == "") {
            System.out.println("No values");
        } else {
            for (String a : args) {
                output = output + a + ",";
            }
            System.out.println(output.substring(0, output.length() - 1));
        }
    }
}
