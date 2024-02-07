# Assignment_02

This assignment is of 3 parts:
Part-1: 
In the assignment_02_073 Java program, the main functionality is achieved through the use of the Scanner class for input and various methods for processing and outputting the data. Here's a brief description of the methods and concepts used:

Scanner class:

The Scanner class is used to read input from the console (System.in). It provides various methods like nextInt() to read different types of input (integers, strings, etc.) from the user.
main method:

The main method serves as the entry point of the Java program. It's where the execution of the program begins. In this program, the main method orchestrates the input, processing, and output of the data.
Arrays:

The program utilizes arrays (even and odd) to store the even and odd numbers entered by the user. Arrays are data structures that store multiple values of the same type in contiguous memory locations.
for loop:

The for loop is used to iterate over a sequence of elements (in this case, the numbers entered by the user) and perform operations on them. It allows the program to process each input number efficiently.
evenCount and oddCount variables:

These variables keep track of the number of even and odd numbers stored in the even and odd arrays, respectively. They are incremented each time a new even or odd number is added to the corresponding array.
Printing output:

The program uses System.out.println() statements to print the even and odd numbers stored in the arrays. This method is used to display the results to the user.
Part-2:

The Java program assignment_02_part_02 aims to find the indices of two neighboring numbers in an array with the smallest distance between them. Let's describe the code and the methods used:

Scanner class:

The Scanner class is utilized to read input from the console (System.in). It prompts the user to enter the number of elements in the array and the elements themselves.
findNearestIndex method:

This method takes an array of integers as input and returns the index of the first number among neighboring pairs with the smallest distance between them. It handles edge cases where the array is empty or contains only one element.
Main method:

The main method serves as the entry point of the program. It orchestrates the input, processing, and output functionalities. It first reads the number of elements in the array and then prompts the user to enter the elements. Afterward, it calls the findNearestIndex method to find the nearest indices of neighboring numbers with the smallest distance. Finally, it displays the result to the user.
Math.abs method:

The Math.abs method is used to calculate the absolute difference between two numbers, which represents the distance between them.
Printing output:

The program uses System.out.println() statements to display the result to the user, indicating the indices of the nearest neighboring numbers with the smallest distance between them.
Part-03:

The Java program assignment_02_part_03 allows the user to convert an array into an ArrayList and vice versa. Let's describe the code and the methods used:
Main method:

The main method serves as the entry point of the program. It orchestrates the input, processing, and output functionalities. It first reads the number of elements in the array and prompts the user to enter the elements. Then, it converts the array to an ArrayList using the Arrays.asList() method. Afterward, it prompts the user to enter the number of elements in the ArrayList and the elements themselves. Finally, it converts the ArrayList back to an array using the toArray() method and displays both the ArrayList and the array to the user.
