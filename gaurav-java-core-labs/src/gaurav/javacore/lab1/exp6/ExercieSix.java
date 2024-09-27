public class ExerciseSix {

    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;  // i^2
            sum += i;  // sum of numbers
        }

        int squareOfSum = sum * sum;

        return squareOfSum - sumOfSquares;
    }

    public static void main(String[] args) {
        Exercise6 ex = new Exercise6();
        int result = ex.calculateDifference(10);
        System.out.println("Difference: " + result);
    }
}
