public class Main {
    public static void main(String[] args) {
        System.out.println("*** task 1 ***");
        String firstName = "Ivan ";
        String lastName = "Ivanov ";
        String middleName = "Ivanovich";
        String fullName = lastName+firstName+middleName;
        System.out.println("ФИО сотрудника - "+fullName);

        System.out.println("\n*** task 2 ***");
        System.out.println("Вывести ФИО заглавными буквами");
        String strUpp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+strUpp);

        System.out.println("\n*** task 3 ***");
        System.out.println("Заменить букву ё на букву е");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Было:");
        System.out.println("Данные ФИО сотрудника - "+fullName);
        String strE = fullName.replace('ё','е');
        System.out.println("Стало:");
        System.out.println("Данные ФИО сотрудника - "+strE);
    }
}