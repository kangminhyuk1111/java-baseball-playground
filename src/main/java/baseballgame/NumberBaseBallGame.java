package baseballgame;

import util.BaseballRandomNumber;
import util.BaseballScanner;
import util.RandomNumberUtil;
import util.ScannerUtil;

public class NumberBaseBallGame {

    private final ScannerUtil scanner;
    private final RandomNumberUtil randomNumberCreator;
    private String[] answer;

    public NumberBaseBallGame() {
        this.randomNumberCreator = new BaseballRandomNumber();
        this.scanner = new BaseballScanner();
    }

    public String[] input() {
        System.out.print("숫자를 입력해 주세요 : ");

        final String number = scanner.nextLine();

        validateInputLength(number);

        return number.split("");
    }

    public void start() {
        boolean isCorrect = false;
        randomNumberCreator.createRandomNumber();

        while (!isCorrect) {
            final String[] input = input();
        }
    }

    private void validateInputLength(final String string) {
        if (string.length() != 3) {
            throw new RuntimeException("숫자는 반드시 3자리만 입력 해야 합니다.");
        }
    }
}
