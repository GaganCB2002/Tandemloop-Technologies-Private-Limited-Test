// Problem-4.java
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem4 {

    public static Map<Integer, Integer> countMultiples(List<Integer> inputList) {
        List<Integer> divisors = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Integer, Integer> resultCounts = new HashMap<>();

        // Initialize all counts to 0
        for (int divisor : divisors) {
            resultCounts.put(divisor, 0);
        }

        for (int divisor : divisors) {
            for (int number : inputList) {
                if (number % divisor == 0) {
                    resultCounts.put(divisor, resultCounts.get(divisor) + 1);
                }
            }
        }
        return resultCounts;
    }

    public static void main(String[] args) {
        List<Integer> inputData = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        Map<Integer, Integer> output = countMultiples(inputData);

        System.out.println("Input: " + inputData);
        System.out.println("Output: " + output);

       
    }
}