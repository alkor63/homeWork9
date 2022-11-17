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
    public static void deliveryDays(int deliveryDistance) {
        System.out.println("Удаленность клиента "+deliveryDistance+" км");
        if (deliveryDistance > 100)
            System.out.println("Извините, так далеко мы не доставляем");
        else System.out.println("На доставку потребуется дней: " + (1+(deliveryDistance+19)/40));
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
            System.out.println("\n * Task 10-2 ");

            boolean clientOS = true;
            int clientDeviceYear = 2014;
            System.out.println("Год выпуска мобилы клиента "+clientDeviceYear);
            clientDevice(clientOS, clientDeviceYear);
            clientOS = false;
            clientDeviceYear = LocalDate.now().getYear();
            System.out.println("Год выпуска мобилы клиента "+clientDeviceYear);
            clientDevice(clientOS, clientDeviceYear);

// Task 3
            System.out.println("\n * Task 10-3 ");
            int deliveryDistance = 95;
            deliveryDays(deliveryDistance);
            deliveryDistance = 105;
            deliveryDays(deliveryDistance);

    }
}