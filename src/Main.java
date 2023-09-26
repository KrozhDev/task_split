import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * код, с помощью которого можно разделить строку на части
         */

        String string = "Split me into the parts";

        String splitSymbol = " ";

        String[] splittedString = string.split(splitSymbol);

        for (String word: splittedString) {
            System.out.print(word + ";");
        }
    }
}
