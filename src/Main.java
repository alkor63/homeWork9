import java.time.LocalDate;

public class Main {

    public static void leapYear(int yearNum) {
    double yearDiv4 = yearNum / 4.0;
            if(yearDiv4 %1!=0.0)System.out.println(yearNum +" - не високосный год");
        else if(yearDiv4 %25==0.0&&yearDiv4 %100!=0.0)System.out.println(yearNum +" - не високосный год");
        else System.out.println(yearNum +" - високосный год");
        }
    public static void clientDevice(boolean clientOS, int clientDeviceYear) {
        String lightVersion;
        if (clientDeviceYear >= 2015) lightVersion = " ";
        else lightVersion = " облегченную ";
        if (clientOS) System.out.println("Установите"+lightVersion+"версию приложения для Android по ссылке");
        else System.out.println("Установите"+lightVersion+"версию приложения для iOS по ссылке");
    }
        public static void main(String[] args) {

        System.out.println(" * Task 10-1 ");
        int yearNum = 2100;
        leapYear(yearNum);
        yearNum = 2000;
        leapYear(yearNum);
        int currentYear = LocalDate.now().getYear();
        System.out.print("Текущий год ");
        leapYear(currentYear);
// Task 2
        System.out.println("\n * Task 2 ");

        boolean clientOS = true;
            int clientDeviceYear = 2014;
            System.out.println("Год выпуска мобилы клиента "+clientDeviceYear);
            clientDevice(clientOS, clientDeviceYear);
            clientOS = false;
            clientDeviceYear = LocalDate.now().getYear();
            System.out.println("Год выпуска мобилы клиента "+clientDeviceYear);
            clientDevice(clientOS, clientDeviceYear);

// Task 3
        System.out.println(" * Task 3 ");

// Task 4
        System.out.println(" * Task 4 ");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + (1+(deliveryDistance+19)/40));


        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = String.join(" ",lastName,firstName,middleName);
        System.out.println("ФИО сотрудника - "+fullName+"\n");

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