import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        task1(year);
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Введите опреационную систему, где 0 - iOS, 1 - Android");
        int clientOS = scanner.nextInt();
        System.out.println("Введите год выпуска устройства:");
        int clientDeviceYear = scanner.nextInt();
        task2(clientOS, clientDeviceYear);
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Введите расстояние от офиса до адреса доставки карты:");
        int deliveryDistance = scanner.nextInt();
        if (task3(deliveryDistance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется " + task3(deliveryDistance) + " дней для доставки");
        }
    }

    public static void task1(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Этот год высокосный");
        } else if (year % 400 == 0) {
            System.out.println("Этот год высокосный");
        } else {
            System.out.println("Этот год не высокосный");
        }
    }

    public static void task2 (int clientOS, int clientDeviceYear) {

        while (true) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            } else {
                throw new RuntimeException("Такой ОС не существует");
            }
        }

    }

    public static int task3(int deliveryDistance) {

        int day = 1;
        if (deliveryDistance < 20) {
            return day;
        } else if (deliveryDistance < 60) {
            return (day + 1);
        } else if (deliveryDistance < 100) {
            return (day + 2);
        } else {
            return 0;
        }
    }

}