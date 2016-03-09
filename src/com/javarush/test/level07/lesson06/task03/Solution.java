package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        int length_max = 0;
        int length_min;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (String text : list) {
            if (text.length() > length_max) {
                length_max = text.length();
            }
        }

        length_min = length_max;
        for (String text : list) {
            if (text.length() < length_min) {
                length_min = text.length();
            }
        }

        for (String text : list) {
            if (text.length() == length_min) {
                System.out.println(text);
            }
        }

    }
}
