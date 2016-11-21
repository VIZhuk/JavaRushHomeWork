package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;

        for (int i = 0; i < 4; i++) {
            int enter = Integer.parseInt(reader.readLine());
            if (enter > max) max = enter;
        }

        System.out.println(max);

    }
}
