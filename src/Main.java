public class Main {
    public static void main(String[] args) {

     // task 1
        System.out.println("task 1");

        int [] expenses = new int []{1, 2, 3, 4, 5};
        int totalExpenses = 0;

        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
        }

        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        // task 2
        System.out.println("task 2");

        int [] expenses1 = new int []{1, 2, 3, 4, 5};
        int totalExpenses1 = 0;
        int minExpenses = expenses1[0];
        int maxExpenses = expenses1[0];

        for (int i = 0; i < expenses1.length; i++) {
            totalExpenses1 += expenses1[i];
            if (expenses1[i] < minExpenses) {
                minExpenses = expenses1[i];
            }
            if (expenses1[i] > maxExpenses) {
                maxExpenses = expenses1[i];
            }
        }

        System.out.println("Сумма трат за месяц составила " + totalExpenses1 + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей.");

        // task 3
        System.out.println("task 3");

        int [] expenses2 = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < expenses2.length; i++) {
            sum += expenses2[i];
        }
        double average = (double) sum / expenses2.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        // task 4
        System.out.println("task 4");

        char[] reverseFullName  = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.println(reverseFullName[i - 1]);
        }
    }
}