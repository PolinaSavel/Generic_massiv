//Реализовать класс для работы с массивом. Разработать метод, производящий поиск значения в массиве.
// Если значение не найдено — выбрасывать исключение. Если найдено — возвращать его.
package org.example;

import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Printer print = new Printer();
        Integer[] number = {5, 4, 8, 0, 6, 1, 3};

        Scanner scanner = new Scanner(in);
        System.out.println("Vvedite 4islo: ");
        int poisk = scanner.nextInt();

        print.<Integer>print(number, poisk);

    }
}
