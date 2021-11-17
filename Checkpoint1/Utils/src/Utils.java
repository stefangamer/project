import java.util.Scanner;

public class Utils {

    /**
     * This method reads a String value from the console. The String will contain all characters (letters, numbers, symbols, white spaces) until a new line is found (the return-button is pressed). In case the user entered nothing but just pressed return an empty String ("") will be returned by this method. <br><br>
     *
     * Note: This method does <strong>not</strong> provide any prompt or feedback.
     *
     * @return The String that was entered by the user (might be "" if only the enter button was pressed).
     */
    public static String readStringFromUser() {
        Scanner myScanner = new Scanner(System.in);

        return myScanner.nextLine();
    }

    /**
     * This method reads a character value from the console. This method uses the {@link #readStringFromUser() readStringFromUser} method.<br><br>
     *
     * Note: This method does <strong>not</strong> provide any prompt or feedback.
     *
     * @return The String that was entered by the user (might be "" if only the enter button was pressed).
     */
    public static char readCharFromUser() {
        return readStringFromUser().charAt(0);
    }

    /**
     * This method reads an integer value from the console. In case no integer value was provided, the value -1 is returned instead. This method uses the {@link #readStringFromUser() readStringFromUser} method.<br><br>
     *
     * Note: This method does <strong>not</strong> provide any prompt or feedback.
     *
     * @return the integer value entered by the user, or -1 in case no integer value was typed in
     */
    public static int readIntFromUser() {
        String input = readStringFromUser();

        try {
            int result = Integer.parseInt(input);
            return result;
        } catch (NumberFormatException nfe) {
            SaxionApp.printLine("The entered value is not an integer!");
            return -1;
        }
    }

    /**
     * This method reads a double value from the console. In case no double value was provided, the value -1.0 is returned instead. This method uses the {@link #readStringFromUser() readStringFromUser} method.<br><br>
     *
     * Note: This method does <strong>not</strong> provide any prompt or feedback.
     *
     * @return the double value entered by the user, or -1.0 in case no integer value was typed in
     */
    public static double readDoubleFromUser() {
        String input = readStringFromUser();

        try {
            double result = Double.parseDouble(input);
            return result;
        } catch (NumberFormatException nfe) {
            SaxionApp.printLine("The entered value is not an integer!");
            return -1.0;
        }
    }

    /**
     * Generates a random integer value between lowerBound (inclusive) and upperBound (NOT inclusive).
     *
     * For example: <i>getRandomValueBetween(0, 10)</i> can produce any value between 0 and 9.
     *
     * @param lowerBound The specified lower bound for this random number generator. Values returned by this method will never be less than this value.
     * @param upperBound The specified upper bound for this random number generator. Values returned by this method will always be less than this value.
     * @return A value that has the following properties lowerBound &lt;= value &lt; upperBound.
     */
    public static int getRandomValueBetween(int lowerBound, int upperBound) {
        return (int) (Math.random() * (upperBound - lowerBound) + lowerBound);
    }

    /**
     * This method generates a random integer value between 1 and 10. This method uses the {@link #getRandomValueBetween(int lowerBound, int upperBound) getRandomValueBetween} method.
     *
     * @return A value that has the following properties 0 &lt;= value &lt;= 10.
     */
    public static int getRandomNumberBetweenOneAndTen() {
        return getRandomValueBetween(0, 10) + 1;
    }
}
