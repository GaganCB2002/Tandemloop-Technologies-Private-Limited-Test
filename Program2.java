// Problem-2.java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Problem2 {

    public static String generateOddSeriesType1(int a) {
        if (a <= 0) {
            return "Input must be a positive integer.";
        }

        List<Integer> series = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1;
            series.add(oddNumber);
        }

        // Convert List<Integer> to a comma-separated String
        return series.stream()
                     .map(String::valueOf)
                     .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer (a): ");
            int inputA = scanner.nextInt();

            String output = generateOddSeriesType1(inputA);
            System.out.println("Output: " + output);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}