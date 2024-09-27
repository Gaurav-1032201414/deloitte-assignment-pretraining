public class Exercise8 {

    public boolean checkNumber(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Exercise8 ex = new Exercise8();

        int testNumber1 = 8;
        int testNumber2 = 10;
        int testNumber3 = 16;
        int testNumber4 = 0;

        System.out.println("Is " + testNumber1 + " a power of 2? " + ex.checkNumber(testNumber1));
        System.out.println("Is " + testNumber2 + " a power of 2? " + ex.checkNumber(testNumber2));
        System.out.println("Is " + testNumber3 + " a power of 2? " + ex.checkNumber(testNumber3));
        System.out.println("Is " + testNumber4 + " a power of 2? " + ex.checkNumber(testNumber4));
    }
}
