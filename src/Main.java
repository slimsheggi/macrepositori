public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        // task 2
        System.out.println("task 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());

        // task 3
        System.out.println("task 3");

        fullName = fullName.replace("Ivanov Ivan Ivanovich", "Иванов Семён Семёнович");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
    }
}