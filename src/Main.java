public class Main {
    public static String calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год - високосный";
        } else {
            return year + " год - не високосный";
        }
    }
    private static String painfulUpdate(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            return "Установите обычное версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else {
            return "Установите обычное версию приложения для Android по ссылке";
        }
    }
    private static String deliveryDays(int deliveryDistance, int deliveryTime) {
        if (deliveryDistance >= 100) {
            return "Доставки нет";
        } else if (deliveryDistance < 20) {
            return "Потребуется дней: " + deliveryTime;
        } else if (deliveryDistance < 60) {
            return "Потребуется дней: " + (deliveryTime + 1);
        } else if (deliveryDistance < 100) {
            return "Потребуется дней: " + (deliveryTime + 2);
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int year = 2028;
        String result = calculateLeapYear(year);
        System.out.println(result);
        System.out.println();
        System.out.println("Задание №2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        String result2 = painfulUpdate(clientOS, clientDeviceYear);
        System.out.println(result2);
        System.out.println();
        System.out.println("Задание №3");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        String result3 = deliveryDays(deliveryDistance, deliveryTime);
        System.out.println(result3);
        }
    }




