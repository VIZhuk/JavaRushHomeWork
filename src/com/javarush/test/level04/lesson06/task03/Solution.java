package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Integer a[] = new Integer[3];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i <= 2; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(a, Collections.reverseOrder());

        for(Integer n : a) {
            System.out.println(n);
        }

    }
}
