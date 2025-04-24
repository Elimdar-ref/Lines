import java.time.LocalDate;

public class Main {
    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }

    private static void installUpdate(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > currentYear) {
            System.out.println("Установите обычное версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычное версию приложения для Android по ссылке");
        }
    }

    public static int deliverDays(int deliveryDistance) {
        int count = 1;
        if (deliveryDistance > 20) {
            count = 2;
        }
        if (deliveryDistance > 60) {
            count = 3;
        }
        if (deliveryDistance > 100) {
            count = - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");
        printLeapYear(2024);
        System.out.println();
        System.out.println("Задание №2");
        int clientOS = 0;
        int clientDeviceYear = 2025;
        installUpdate(clientOS, clientDeviceYear);
        System.out.println();
        System.out.println("Задание №3");
        int deliveryDistance = 19;
        int count = deliverDays(deliveryDistance);
        if (count == - 1) {
            System.out.println("Доставки нет");
        } else {
            System.out.printf("Доставка займет %d дней", count);
        }
    }
}