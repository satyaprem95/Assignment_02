import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class assignment_02_part_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.valueOf(scanner.nextInt());
        }

        // Convert array to ArrayList
        List<Integer> arrayList = Arrays.asList(array);

        System.out.println("Array converted to ArrayList:");
        System.out.println(arrayList);

        // Input ArrayList from the user
        System.out.print("\nEnter the number of elements in the ArrayList: ");
        int m = scanner.nextInt();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(); // Specify the type explicitly
        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < m; i++) {
            arrayList2.add(Integer.valueOf(scanner.nextInt()));
        }

        // Convert ArrayList to array
        Integer[] array2 = arrayList2.toArray(new Integer[arrayList2.size()]); // Specify the type explicitly

        System.out.println("\nArrayList converted to array:");
        System.out.println(Arrays.toString(array2));

        scanner.close();
    }
}





