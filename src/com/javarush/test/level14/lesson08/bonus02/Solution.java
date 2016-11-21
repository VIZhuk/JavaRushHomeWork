package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int min;
        int max;
        int result = 0;
        if (a < b) {
            min = a;
            max = b;
        }
        else {
            min = b;
            max = a;
        }
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= min; i++) {
            if ((min % i) == 0 ) {
                arr.add(i);
            }
        }

        for (Integer variable : arr)
        {
            if ((max % variable) == 0) {
                result = variable;
            }
        }

//        for (Integer variable : arr)
//        {
//            System.out.println(variable);
//        }
        System.out.println(result);
    }
}
