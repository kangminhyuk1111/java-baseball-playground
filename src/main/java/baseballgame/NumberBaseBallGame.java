package baseballgame;

import java.util.Random;
import java.util.Scanner;

public class NumberBaseBallGame {

    private final Scanner scanner;
    private String[] answer;

    public NumberBaseBallGame(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String[] input() {
        System.out.print("숫자를 입력해 주세요 : ");

        final String number = scanner.nextLine();

        validateInputLength(number);

        return number.split("");
    }

    public void start() {
        boolean isCorrect = false;
        createRandomNumber();

        while (!isCorrect) {
            final String[] input = input();
        }
    }

    private void validateInputLength(final String string) {
        if (string.length() != 3) {
            throw new RuntimeException("숫자는 반드시 3자리만 입력 해야 합니다.");
        }
    }

    private void createRandomNumber() {
        final Random random = new Random();

        final int first = random.nextInt(9) + 1;
        final int second = random.nextInt(9) + 1;
        final int third = random.nextInt(9) + 1;

        answer = new String[]{String.valueOf(first), String.valueOf(second), String.valueOf(third)};
    }
}
