import java.util.Arrays;//for built-in method 

public class Array1 {
    public static void main(String[] args) {
        
        //ways of declaration
        int[] arr1 = new int[5];                 
        int[] arr2 = {1, 2, 3, 4, 5};           
        int arr3[] = new int[]{10, 20, 30};      

        //assigning values to arr1
        arr1[0] = 5;
        arr1[1] = 10;
        arr1[2] = 15;
        arr1[3] = 20;

        //printing arrays
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));

        //length of array
        System.out.println("Length of arr1: " + arr1.length);

        //sorting array
        Arrays.sort(arr1);
        System.out.println("Sorted arr1: " + Arrays.toString(arr1));

        //searching in array
        int index = Arrays.binarySearch(arr1, 15);
        System.out.println("Index of 15 in arr1: " + index);

        //Copying arrays
        int[] arrCopy = Arrays.copyOf(arr2, arr2.length);
        System.out.println("Copied arr2: " + Arrays.toString(arrCopy));

        //Filling array with a value
        int[] arrFill = new int[5];
        Arrays.fill(arrFill, 99);
        System.out.println("Filled array: " + Arrays.toString(arrFill));

        //Multi-dimensional arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix element [1][2]: " + matrix[1][2]); // 6

        // Loop through 2D array
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        //enhanced loop
        System.out.print("arr2 using for-each: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
