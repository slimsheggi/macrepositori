import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] weights = new int []{90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights [0] = 90;
        int januaryWeight = weights [0];
        System.out.println(januaryWeight);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        // task 1
        System.out.println("task 1");

        int [] numbers = new int [3];
        numbers [0] = 1;
        numbers [1]= 2;
        numbers [2] = 3;
        System.out.println(numbers [0]);
        System.out.println(numbers [1]);
        System.out.println(numbers [2]);

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(fractionalNumbers [0]);
        System.out.println(fractionalNumbers [1]);
        System.out.println(fractionalNumbers [2]);

        int [] arbitraryArray = new int []{9, 7, 5, 3, 1};
        System.out.println(arbitraryArray [0]);
        System.out.println(arbitraryArray [1]);
        System.out.println(arbitraryArray [2]);
        System.out.println(arbitraryArray [3]);
        System.out.println(arbitraryArray [4]);

        // task 2
        System.out.println("task 2");

        System.out.println(numbers [0] + "," + numbers [1] + "," + numbers [2]);
        System.out.println(fractionalNumbers [0] + "," + fractionalNumbers [1] + "," + fractionalNumbers [2]);
        System.out.println(arbitraryArray [0] + "," + arbitraryArray [1] + "," + arbitraryArray [2] + "," + arbitraryArray [3] + "," + arbitraryArray [4]);

        // task 3
        System.out.println("task 3");

        System.out.println(numbers [2] + "," + numbers [1] + "," + numbers [0]);
        System.out.println(fractionalNumbers [2] + "," + fractionalNumbers [1] + "," + fractionalNumbers [0]);
        System.out.println(arbitraryArray [4] + "," + arbitraryArray [3] + "," + arbitraryArray [2] + "," + arbitraryArray [1] + "," + arbitraryArray [0]);

        // task 4
        System.out.println("task 4");

        for (int i = 0; i < numbers.length; i++){
            if (numbers [i] % 2 != 0) {
                numbers [i] ++;
                System.out.println(numbers[i]);
                if (i < 2)
                    System.out.println("2");
            }
        }
    }
}