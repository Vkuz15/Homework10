public class Main {
    public static void main(String[] args) {

        //Задача 2

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.toUpperCase();
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }
}