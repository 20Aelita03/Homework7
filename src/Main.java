public class Main {
    public static void main(String[] args) {
        // Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Task 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // Task 3
        String newFullName = "Иванов Семён Семёнович";
        newFullName = newFullName.replace('ё' , 'е');
        System.out.println("Данные ФИО сотрудника — " + newFullName);
    }
}