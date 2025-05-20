# Tandemloop-Technologies-Private-Limited-Test
---------------------------------------------------------------------------Program 1 -------------------------------------------------------------------------------
Java CLI Calculator
This project provides a simple command-line interface (CLI) calculator application written in Java. It supports basic arithmetic operations: addition, subtraction, multiplication, and division.

Logic Explained
The Calculator class is the core of this application, encapsulating the functionality for performing calculations.

add(double a, double b): Takes two double arguments and returns their sum.
subtract(double a, double b): Takes two double arguments and returns their difference.
multiply(double a, double b): Takes two double arguments and returns their product.
divide(double a, double b): Takes two double arguments. It includes a crucial error handling mechanism:
If the divisor (b) is 0, it returns the String "Error: Cannot divide by zero!".
Otherwise, it returns the quotient as a String. This method returns a String to accommodate the error message.
calculate(double a, double b, String operation): This is the central method for orchestrating the operations. It takes two numbers and a String representing the desired operation.
It uses a switch statement to determine which arithmetic method to call based on the operation String (case-insensitive).
It converts the double results of the arithmetic operations to String before returning them.
If an unsupported operation is provided, it returns "Error: Invalid operation type."
main(String[] args): This is the entry point of the application.
It uses the Scanner class to get user input from the console for the two numbers and the desired operation.
It includes a try-catch-finally block for robust error handling:
try: Attempts to read user input and perform the calculation.
catch (java.util.InputMismatchException e): Catches errors if the user enters non-numeric input for the numbers, printing an appropriate error message.
finally: Ensures that the Scanner object is closed, releasing system resources, regardless of whether an exception occurred or not.
How to Run the File
To compile and run this Java calculator application, follow these steps:

Prerequisites
Java Development Kit (JDK): Make sure you have a JDK installed on your system. You can download it from the official Oracle website or use an open-source distribution like OpenJDK.
Steps
Save the Code:
Save the provided Java code into a file named Calculator.java.

Open a Terminal or Command Prompt:
Navigate to the directory where you saved Calculator.java using your terminal or command prompt.

Compile the Java Code:
Use the Java compiler (javac) to compile the .java file into a .class file:

Bash

javac Calculator.java
If compilation is successful, a file named Calculator.class will be created in the same directory. If there are any errors, javac will report them.

Run the Compiled Code:
Now, execute the compiled Java code using the Java Virtual Machine (java):

Bash

java Calculator
Example Interaction:
When you run the program, you will see prompts in your console:
-------------------------------------------------------------------------------output---------------------------------------------------------------------------------
Enter first number (a): 10
Enter second number (b): 5
Enter type of operation (add, subtract, multiply, divide): add
Result: 15.0
Enter first number (a): 10
Enter second number (b): 0
Enter type of operation (add, subtract, multiply, divide): divide
Result: Error: Cannot divide by zero!
Enter first number (a): hello
Invalid input. Please enter valid numbers.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Program2-------------------------------------------------------------------------------------------



Odd Series Generator
This Java program generates a series of odd numbers up to a specified count. Given a positive integer 'a', it will produce the first 'a' odd numbers.

Logic Explained
The core functionality resides within the Problem2 class, specifically in the generateOddSeriesType1 method.

generateOddSeriesType1(int a): This static method takes an integer a as input.
Input Validation: It first checks if a is a positive integer. If a is less than or equal to 0, it returns an error message: "Input must be a positive integer."
Series Generation:
It initializes an ArrayList called series to store the generated odd numbers.
It then iterates from i = 1 up to a. In each iteration, it calculates the oddNumber using the formula 2 * i - 1. This formula ensures that for i=1, the odd number is 1; for i=2, it's 3, and so on.
Each calculated oddNumber is added to the series list.
Output Formatting: After generating all the odd numbers, it converts the List<Integer> into a comma-separated String. This is achieved using Java Streams:
series.stream(): Creates a stream from the list of integers.
.map(String::valueOf): Converts each Integer in the stream to its String representation.
.collect(Collectors.joining(", ")): Joins all the String representations into a single string, with each number separated by ", ".
main(String[] args): This is the program's entry point.
It uses a Scanner object to get integer input from the user.
It includes a try-catch-finally block for robust error handling:
try: Attempts to read the integer input and calls generateOddSeriesType1 to get the result.
catch (java.util.InputMismatchException e): Catches an exception if the user enters non-integer input, printing an "Invalid input. Please enter an integer." message.
finally: Ensures that the scanner object is closed to prevent resource leaks, regardless of whether an error occurred.
How to Run the File
Follow these steps to compile and execute the Java program:

Prerequisites
Java Development Kit (JDK): Ensure you have a JDK installed on your system. You can download it from the official Oracle website or use an open-source distribution like OpenJDK.
Step-by-Step Instructions
Save the Code:
Save the provided Java code into a file named Problem2.java.

Open a Terminal or Command Prompt:
Navigate to the directory where you saved Problem2.java using your terminal or command prompt.

Compile the Java Code:
Use the Java compiler (javac) to compile the .java file into a .class file:

Bash

javac Problem2.java
If the compilation is successful, a file named Problem2.class will be created in the same directory. If there are any syntax errors in the code, javac will report them.

Run the Compiled Code:
Now, execute the compiled Java code using the Java Virtual Machine (java):

Bash
------------------------------------------------------------------------------------OUTPUT-------------------------------------------------------------------------------------------
java Problem2
Example Interactions:
When you run the program, you'll see a prompt asking for input:

Successful Execution:

Enter an integer (a): 5
Output: 1, 3, 5, 7, 9
Invalid Input (Non-positive Integer):

Enter an integer (a): 0
Output: Input must be a positive integer.
Invalid Input (Non-integer):

Enter an integer (a): abc
Invalid input. Please enter an integer.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Program3-----------------------------------------------------------------------------------------




Odd Series Generator (Type 2)
This Java program generates a series of odd numbers up to a specified limit, which is determined by the input integer 'a'. Unlike a fixed count, this version generates odd numbers that are less than or equal to 'a' if 'a' is odd, or less than 'a' if 'a' is even.

Logic Explained
The core logic of this program is encapsulated within the Problem3 class, specifically in the generateOddSeriesType2 method.

generateOddSeriesType2(int a): This static method takes an integer a as input and returns a string representing the odd series.

Input Validation:
It first checks if a is a positive integer. If a is less than or equal to 0, it immediately returns the error message: "Input must be a positive integer."
It also handles special cases for a = 1 or a = 2. In both scenarios, the desired output is "1", as 1 is the only odd number less than or equal to 1 or 2.
Determining the Limit:
An integer variable limit is introduced to define the upper bound for the odd numbers to be generated.
If a is an odd number (a % 2 == 1), the limit is set to a itself. This means the series will include odd numbers up to and including a.
If a is an even number (a % 2 == 0), the limit is set to a - 1. This ensures that the series only includes odd numbers strictly less than a.
Series Generation:
An ArrayList named series is initialized to store the odd numbers.
A while loop is used to generate the series. It starts with currentOdd = 1 and continues as long as currentOdd is less than or equal to the calculated limit.
In each iteration, currentOdd is added to the series list, and then currentOdd is incremented by 2 to get the next odd number.
Output Formatting: Finally, the method converts the List<Integer> into a comma-separated String using Java Streams:
series.stream(): Creates a stream of integers from the list.
.map(String::valueOf): Converts each integer in the stream to its String representation.
.collect(Collectors.joining(", ")): Joins all the string representations into a single string, with each number separated by ", ".
main(String[] args): This is the main method where the program execution begins.

It creates a Scanner object to read input from the user.
It uses a try-catch-finally block for robust error handling:
The try block attempts to:
Prompt the user to "Enter an integer (a): ".
Read the integer input using scanner.nextInt().
Call generateOddSeriesType2(inputA) to obtain the odd series string.
Print the "Output: " followed by the generated series.
The catch (java.util.InputMismatchException e) block is executed if the user enters input that is not an integer. It prints an error message: "Invalid input. Please enter an integer."
The finally block is guaranteed to execute, regardless of whether an exception occurred or not. Its purpose is to close the scanner object (scanner.close()) to release system resources and prevent resource leaks.
How to Run the File
To compile and run this Java program, please follow these step-by-step instructions:

Prerequisites
Java Development Kit (JDK): You need to have a Java Development Kit (JDK) installed on your operating system. You can download the latest version from the official Oracle website or use an open-source distribution like OpenJDK.
Step-by-Step Instructions
Save the Code:
Save the provided Java code into a file named Problem3.java. Ensure the filename exactly matches the class name.

Open a Terminal or Command Prompt:
Open your preferred terminal (on Linux/macOS) or Command Prompt/PowerShell (on Windows).
Navigate to the directory where you saved Problem3.java using the cd command. For example, if you saved it in a folder named JavaPrograms on your desktop:

Bash

cd Desktop/JavaPrograms
Compile the Java Code:
Use the Java compiler (javac) to compile the .java source file into a .class bytecode file. This step checks for syntax errors and translates your human-readable code into machine-executable instructions.

Bash

javac Problem3.java
If the compilation is successful, a file named Problem3.class will be created in the same directory. If there are any errors in your code, javac will display them in the terminal, indicating the line numbers where the errors occurred.

Run the Compiled Code:
After successful compilation, you can execute the compiled Java program using the Java Virtual Machine (java).

Bash
-----------------------------------------------------------------------------------OUTPUT--------------------------------------------------------------------------------------------
java Problem3
Example Interactions:
When you run the program, you will be prompted to enter an integer. Here are some examples of how the program will interact:

Example 1: Input 'a' is an odd number

Enter an integer (a): 7
Output: 1, 3, 5, 7
Example 2: Input 'a' is an even number

Enter an integer (a): 6
Output: 1, 3, 5
Example 3: Input 'a' is 1

Enter an integer (a): 1
Output: 1
Example 4: Input 'a' is 2

Enter an integer (a): 2
Output: 1
Example 5: Invalid Input (Non-positive integer)

Enter an integer (a): -5
Output: Input must be a positive integer.
Example 6: Invalid Input (Non-integer character)

Enter an integer (a): hello
Invalid input. Please enter an integer.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Program4------------------------------------------------------------------------------------------




Multiple Counter
This Java program counts how many numbers in a given list are multiples of specific divisors (1 through 9). It provides a clear mapping of each divisor to its total count of multiples found in the input list.

Logic Explained
The core functionality of this program resides within the Problem4 class, particularly in the countMultiples method.

countMultiples(List<Integer> inputList): This static method takes a List of Integer objects as input and returns a Map where keys are the divisors (1-9) and values are the counts of their multiples.

Divisors Definition: It first defines a List named divisors containing integers from 1 to 9. These are the numbers for which we want to count multiples.
Initialize Result Map: A HashMap named resultCounts is created. This map will store our final counts. It's initialized by setting the count for each divisor (from 1 to 9) to 0. This ensures that every divisor has an entry in the map, even if no multiples are found for it.
Counting Multiples: The program uses nested loops to perform the counting:
Outer Loop: Iterates through each divisor in the divisors list.
Inner Loop: For each divisor, it iterates through every number in the inputList.
Multiples Check: Inside the inner loop, if (number % divisor == 0) checks if the number is a multiple of the current divisor. The modulo operator (%) returns the remainder of a division. If the remainder is 0, it means number is perfectly divisible by divisor.
Increment Count: If a number is a multiple, its corresponding count in resultCounts is incremented by 1 using resultCounts.put(divisor, resultCounts.get(divisor) + 1);.
Return Results: After checking all numbers against all divisors, the method returns the resultCounts map.
main(String[] args): This is the entry point of the program.

Input Data: It defines a sample List of integers called inputData which will be processed by the countMultiples method.
Method Call: It calls the countMultiples method with inputData and stores the returned map in the output variable.
Print Output: Finally, it prints both the inputData list and the calculated output map to the console, showing the counts of multiples for each divisor.
How to Run the File
To compile and execute this Java program, follow these steps:

Prerequisites
Java Development Kit (JDK): Ensure you have a JDK installed on your system. You can download it from the official Oracle website or use an open-source alternative like OpenJDK.
Step-by-Step Instructions
Save the Code:
Save the provided Java code into a file named Problem4.java. Make sure the filename exactly matches the class name.

Open a Terminal or Command Prompt:
Open your preferred terminal (on Linux/macOS) or Command Prompt/PowerShell (on Windows). Navigate to the directory where you saved Problem4.java using the cd command. For example:

Bash

cd path/to/your/java/files
Compile the Java Code:
Use the Java compiler (javac) to compile the .java source file into a .class bytecode file. This step checks for syntax errors and translates your code into a format the Java Virtual Machine (JVM) can understand.

Bash

javac Problem4.java
If the compilation is successful, a file named Problem4.class will be created in the same directory. If there are any errors in your code, javac will display them in the terminal.

Run the Compiled Code:
After successful compilation, you can execute the compiled Java program using the Java Virtual Machine (java).

Bash

java Problem4
Example Output:
When you run the program, you will see output similar to this:

Input: [1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]
Output: {1=11, 2=7, 3=4, 4=3, 5=3, 6=2, 7=0, 8=1, 9=1}
This output indicates that:

There are 11 numbers in the input list that are multiples of 1.
There are 7 numbers that are multiples of 2.
And so on.
There are 0 numbers that are multiples of 7.
Number Multiples Counter
This Java program takes a list of integers and counts how many of those integers are multiples of each number from 1 to 9. The results are stored in a HashMap, where the keys are the divisors (1 through 9) and the values are the counts of their respective multiples found in the input list.

Logic Explained
The core of this application lies in the Problem4 class and its countMultiples method.

countMultiples(List<Integer> inputList): This static method is responsible for performing the counting.

Divisors Definition: It first defines a fixed list of divisors from 1 to 9 using Arrays.asList().
Result Map Initialization: A HashMap<Integer, Integer> called resultCounts is created. This map will store each divisor as a key and its corresponding count of multiples as the value.
Initializing Counts to Zero: Before counting, the program iterates through the divisors list and initializes the count for each divisor in resultCounts to 0. This ensures that all divisors from 1 to 9 are present in the map, even if no multiples are found for a particular divisor in the input list.
Counting Multiples:
The code then enters a nested loop:
The outer loop iterates through each divisor in the divisors list (from 1 to 9).
The inner loop iterates through each number in the inputList.
Inside the inner loop, it checks if number is a multiple of the current divisor using the modulo operator (%). If number % divisor == 0, it means number is a multiple of divisor.
If it's a multiple, the count for that divisor in the resultCounts map is incremented by 1 using resultCounts.put(divisor, resultCounts.get(divisor) + 1);.
Return Value: Finally, the method returns the resultCounts map, which contains the total count of multiples for each divisor from 1 to 9.
main(String[] args): This is the entry point of the program.

Input Data: It defines a sample List<Integer> called inputData containing a set of numbers. You can modify this list to test with different numbers.
Method Call: It calls the countMultiples method with inputData and stores the returned map in the output variable.
Printing Results: It then prints both the inputData list and the calculated output map to the console, showing the original numbers and the counts of their multiples for each divisor.
How to Run the File
To compile and run this Java program on your system, follow these steps:

Prerequisites
Java Development Kit (JDK): Ensure you have a JDK installed. You can download it from Oracle's official site or use an open-source version like OpenJDK.
Step-by-Step Instructions
Save the Code:
Save the provided Java code into a file named Problem4.java. Make sure the file name matches the class name exactly.

Open a Terminal or Command Prompt:
Open your command-line interface. Use the cd command to navigate to the directory where you saved Problem4.java.

Compile the Java Code:
Use the Java compiler (javac) to compile your source code:

Bash
--------------------------------------------------------------------------------------------OUTPUT-----------------------------------------------------------------------------------
javac Problem4.java
If there are no errors, this command will create a Problem4.class file in the same directory. If you encounter any errors, check your code for typos or syntax mistakes.

Run the Compiled Code:
Execute the compiled Java program using the java command:

Bash

java Problem4
Example Output:
When you run the program, you will see output similar to this:

Input: [1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]
Output: {1=11, 2=8, 3=4, 4=3, 5=2, 6=2, 7=0, 8=1, 9=1}
This output indicates:

There are 11 numbers in the input list that are multiples of 1.
There are 8 numbers in the input list that are multiples of 2.
There are 4 numbers in the input list that are multiples of 3.
And so on, up to multiples of 9.

------------------------------------------------------------------------------------------END----------------------------------------------------------------------------------------
