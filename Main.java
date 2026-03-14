public class Main {

    // Constant for total rows of the pyramid
    private static final int TOTAL_ROWS = 5;

    public static void main(String[] args) {

        for (int i = 1; i <= TOTAL_ROWS; i++) {

            // Print spaces
            for (int j = 1; j <= TOTAL_ROWS - i; j++) {
                System.out.print("  ");
            }

            // Ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
