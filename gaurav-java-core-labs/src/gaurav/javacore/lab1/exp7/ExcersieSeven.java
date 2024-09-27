public class ExerciseSeven {

    public boolean checkNumber(int number) {
        int lastDigit = number % 10;
        number = number / 10;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit > lastDigit) {
                return false;
            }

            lastDigit = currentDigit;
            number = number / 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Exercise7 ex = new Exercise7();

        int testNumber1 = 134468;
        int testNumber2 = 987123;

        System.out.println("Is " + testNumber1 + " an increasing number? " + ex.checkNumber(testNumber1));
        System.out.println("Is " + testNumber2 + " an increasing number? " + ex.checkNumber(testNumber2));
    }
}
