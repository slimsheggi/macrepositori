import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("task 1");

        int [] numbers = new int [3];
        numbers [0] = 1;
        numbers [1]= 2;
        numbers [2] = 3;
        System.out.println(Arrays.toString(numbers));

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(fractionalNumbers));

        int [] arbitraryArray = new int []{9, 7, 5, 3, 1};
        System.out.println(Arrays.toString(arbitraryArray));

        // task 2
        System.out.println("task 2");

        System.out.println(numbers [0] + "," + numbers [1] + "," + numbers [2]);
        System.out.println(fractionalNumbers [0] + "," + fractionalNumbers [1] + "," + fractionalNumbers [2]);
        System.out.println(arbitraryArray [0] + "," + arbitraryArray [1] + "," + arbitraryArray [2] + "," + arbitraryArray [3] + "," + arbitraryArray [4]);

        // task 3
        System.out.println("task 3");

        for (int i = 2; i < numbers.length; i--){
            if (i >= 1){
                System.out.println(numbers[i] + ", ");
            } else if (i == 0){
                System.out.println(numbers[i]);
            }
        }

        for (int i = 2; i < fractionalNumbers.length; i--){
            if (i >= 1){
                System.out.println(fractionalNumbers[i] + ", ");
            } else if (i == 0){
                System.out.println(fractionalNumbers[i]);
            }
        }

        for (int i = 4; i < arbitraryArray.length; i--){
            if (i >= 1){
                System.out.println(arbitraryArray[i] + ", ");
            } else if (i == 0){
                System.out.println(arbitraryArray[i]);
            }
        }

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