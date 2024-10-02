package util;

import java.util.Random;

public class BaseballRandomNumber implements RandomNumberUtil{
    @Override
    public String[] createRandomNumber() {
        final Random random = new Random();

        final int first = random.nextInt(9) + 1;
        final int second = random.nextInt(9) + 1;
        final int third = random.nextInt(9) + 1;

        return new String[]{String.valueOf(first), String.valueOf(second), String.valueOf(third)};
    }
}
