package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0507 Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
Пример для чисел 1 2 2 4 5 -1:
2.8
Пример для чисел 4 3 2 1 -1:
2.5

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. После ввода -1 программа должна корректно завершить работу.
4. Если ввести: 1 2 2 4 5 -1, программа должна вывести 2.8.
5. Если ввести: -100 0 100 -1, программа должна вывести 0.0.
6. Если ввести: 1 -1, программа должна вывести 1.0.
7. Выведенный результат должен соответствовать заданию для любых входных данных.

*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = 0;
        double sum = 0;

        while(true) {
            int n = sc.nextInt();
            if(n==-1)
                break;
            sum+=n;
            amount++;
        }
    double result = sum/amount;
        System.out.println(result);
    }
}




