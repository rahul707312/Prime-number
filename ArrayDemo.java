//Getting started with array seaching sorting and diplaying content of array
//Step 1: Create a class named ArrayDemo and add the main method to it.
//Step 2: Declare an array of integers and initialize it with some values.
//Step 3: Display the contents of the array using a loop.
//Step 4: Implement a method to search for a specific value in the array and return its index.
//Step 5: Implement a method to sort the array in ascending order using a sorting algorithm (e.g., bubble sort, selection sort, or insertion sort).
//Step 6: Call the search and sort methods from the main method and display the results
public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original array:");
        displayArray(numbers);
        
        int valueToSearch = 5;
        int index = searchArray(numbers, valueToSearch);
        if (index != -1) {
            System.out.println("Value " + valueToSearch + " found at index: " + index);
        } else {
            System.out.println("Value " + valueToSearch + " not found in the array.");
        }
        
        sortArray(numbers);
        System.out.println("Sorted array:");
        displayArray(numbers);
    }
    
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Return the index of the found value
            }
        }
        return -1; // Return -1 if the value is not found
    }
    
    public static void sortArray(int[] array) {
        // Implementing bubble sort algorithm
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
