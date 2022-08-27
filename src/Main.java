public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для `Андроид` по ссылке");
        } else {
            System.out.println("Ос не поддерживается");
        }
        int year = 2020;
        if (clientOS == 0 && year > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && year < 2015) {
            System.out.println("Установите лайт версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year > 2015) {
            System.out.println("Установите версию приложения для Андроид по ссылке");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите лайт версию приложения для Андроид по ссылке");
        } else {
            System.out.println("Ос не поддерживается");
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високасным ");
        } else {
            System.out.println(year + " год не является високасным ");
        }int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println(year + " Доставка займёт 1 день ");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println(year + " Доставка займёт 2 дня ");
        } else if (deliveryDistance >= 60 && deliveryDistance < 110) {
            System.out.println(year + " Доставка займёт 3 дня ");
        } else {
            System.out.println(year + " Сюда доставка не производиться ");
        }
        int month = 10;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(year + " Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(year + " Это весений месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(year + " Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(year + " Это осенний месяц");
                break;
            default:
                System.out.println(year + "Нет такого месяца");
        }
    }


}
