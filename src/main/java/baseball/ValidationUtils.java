package baseball;

public class ValidationUtils {

    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 10;

    public static boolean validNo(int no) {
        return no > MIN_VALUE && no < MAX_VALUE;
    }
}
