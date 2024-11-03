public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("task 1");

        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15000;
        int month = 0;
        while (sum <= desiredSum){
            sum += amount;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        // task 2
        System.out.println("task 2");

        int number = 0;
        while (number < 10){
            number ++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number --){
            System.out.print(number + " ");
        }
        System.out.println();

        // task 3
        System.out.println("task 3");

        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear +10; year ++){
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения состовляет " + population);
        }

        // task 4
        System.out.println("task 4");

        double percent = 7D / 100;
        desiredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < desiredSum){
            sum = (int) (sum * (1 + percent));
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        // task 5
        System.out.println("task 5");

        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }

        // task 6
        System.out.println("task 6");

        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }

        // task 7
        System.out.println("task 7");

        int firstFriday = 3;
        for (int dey = firstFriday; dey <= 31; dey += 7){
            System.out.println("Сегодня пятница, " + dey + "-е число. Необходимо подготовить отчёт");
        }

        // task 8
        System.out.println("task 8");

        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period){
            if (year > start){
                System.out.println(year);
            }
        }
    }
}