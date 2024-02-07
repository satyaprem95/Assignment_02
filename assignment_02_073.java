import java.util.Scanner;
public class assignment_02_073 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring arrays for even and odd numbers
        int[] even;
        int[] odd;
        // Initialize counts for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Creating arrays based on the number of elements entered by the user
        even = new int[n];
        odd = new int[n];

        // Accepting numbers from the user and moving them to respective arrays
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }

        // Displaying even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        // Displaying odd numbers
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}


