import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание №3
        int seconds = 4500;
        int min = seconds / 60;
        int hour = min / 60;
        System.out.println("В 4500 секундах: " + min + " минут " + "и " + seconds % 60 + " секунд");
        System.out.println("В 4500 секундах: " + hour + " час " + min % 60 + " минут " + "и " + seconds % 60 + " секунд");
        System.out.println("В 4500 секундах: " + hour / 24 + " дней " + hour + " час " + min % 60 + " минут " + "и " + seconds % 60 + " секунд");
        System.out.println("В 4500 секундах: " + hour / 24 / 7 + " недель " + hour / 24 + " дней " + hour + " час " + min % 60 + " минут " + "и " + seconds % 60 + " секунд");

        // Задание №4
        System.out.print("Введите любое 4-х значное целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (1000 > number || number > 9999) {
            System.out.println("Вы ввели не 4-х значное число");
        } else {
            int result = (number % 10) * 1000 + ((number / 10) % 10) * 100 + ((number / 100) % 10) * 10 + (number / 1000);
            System.out.println("Число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа: " + result);
        }

        // Задание №5
        System.out.print("Введите любое 4-х значное целое число: ");
        int number1 = scan.nextInt();
        if (1000 > number1 || number1 > 9999) {
            System.out.println("Вы ввели не 4-х значное число");
        } else {
            int num_1 = (number1 % 10);
            int num_2 = ((number1 / 10) % 10);
            int num_3 = ((number1 / 100) % 10);
            int num_4 = (number1 / 1000);
            if (num_1 != num_2 && num_1 != num_3 && num_1 != num_4 && num_2 != num_3 && num_2 != num_4 && num_4 != num_3) {
                System.out.println("Все цифры числа различны");
            } else {
                System.out.println("Не все цифры числа различны");
            }
        }

        // Задание №6
        System.out.print("Введите любое целое число: ");
        int number2 = scan.nextInt();
        if (1000 > number2 && number2 > 100) {
            System.out.println("Число является 3-х значным");
        } else {
            System.out.println("Число не является 3-х значным");
        }
        int numLast = number2 % 10;
        if (numLast != 7) {
            System.out.println("Последняя цифра не является семеркой");
        } else {
            System.out.println("Последняя цифра является семеркой");
        }
        if (number2 % 2 > 0) {
            System.out.println("Введенное число является не четным");
        } else {
            System.out.println("Введенное число является четным");
        }

        // Задание №7
        System.out.print("Введите радиус картонки: ");
        int r = scan.nextInt();
        System.out.print("Введите ширину отверстия: ");
        int a = scan.nextInt();
        System.out.print("Введите длину отверстия: ");
        int b = scan.nextInt();

        if (r * r >= (a * a + b * b) / 4) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }
    }
}
