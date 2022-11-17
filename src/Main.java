public class Main {
    public static void main(String[] args) {
        System.out.println("*** task 1 ***");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = String.join(" ",lastName,firstName,middleName);
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

        String[] words = fullName.split(" ");
        for (String word: words) System.out.println(word);
// Задачки со звездочками *****************
        System.out.println("********* Задачки со звездочками **********");
        fullName = "Ivanov Ivan Ivanovich";
// Ф И О разделяют два пробела
// для гарантии можно использовать тример, чтоб быть уверенным, что перед и после ФИО ннет пробелов
        fullName = fullName.trim();
        int index1 = fullName.indexOf(" ");
        int index2 = fullName.lastIndexOf(" ");
        lastName = fullName.substring(0,index1);
        firstName = fullName.substring(index1+1,index2);
        middleName = fullName.substring(index2+1);
        System.out.println("Имя сотрудника - "+firstName);
        System.out.println("Фамилия сотрудника - "+lastName);
        System.out.println("Отчество сотрудника - "+middleName);
// *************************************************************
        fullName = "ivanov ivan ivanovich";
        System.out.println("\nБыло: "+fullName);
// индексы (номера) пробелов нашли в предыдущей задаче
// сейчас мы знаем где начинается каждое слово
// нужно извлечь первую букву и перевести ее в верхний регистр
        char ch1 = fullName.charAt(0);
        char ch2 = Character.toUpperCase(ch1);
        String replFN = fullName.replace(ch1,ch2);
        System.out.println("Стало: "+replFN);

        String ssttrr = "aabccddefgghiijjkk";
        for (int i = 0; i<(ssttrr.length()-1); i++){
            if (ssttrr.charAt(i) == ssttrr.charAt(i+1)) System.out.print(ssttrr.charAt(i));
        }
        System.out.println("\nЗакончили задачи со звёздами");
    }
}