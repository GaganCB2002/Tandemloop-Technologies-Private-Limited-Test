// Problem-3.java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Problem3 {

    public static String generateOddSeriesType2(int a) {
        if (a <= 0) {
            return "Input must be a positive integer.";
        }

        if (a == 1 || a == 2) {
            return "1";
        }

        List<Integer> series = new ArrayList<>();
        int limit;

        if (a % 2 == 1) { // a is odd
            limit = a;
        } else { // a is even
            limit = a - 1;
        }

        int currentOdd = 1;
        while (currentOdd <= limit) {
            series.add(currentOdd);
            currentOdd += 2;
        }
        return series.stream()
                     .map(String::valueOf)
                     .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer (a): ");
            int inputA = scanner.nextInt();

            String output = generateOddSeriesType2(inputA);
            System.out.println("Output: " + output);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}