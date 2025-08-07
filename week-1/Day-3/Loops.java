public class Loops {

    public static void main(String[] args) {

        // 1. For Loop
        System.out.println("== For Loop ==");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. While Loop
        System.out.println("== While Loop ==");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 3. Do-While Loop
        System.out.println("== Do-While Loop ==");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // 4. For-Each Loop
        System.out.println("== For-Each Loop ==");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // 5. Nested Loop
        System.out.println("== Nested Loop ==");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println(); 
        }
    }
}
