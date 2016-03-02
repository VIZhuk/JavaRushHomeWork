package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNum = bufferedReader.readLine();
        int num = Integer.parseInt(sNum);

        if (num == 1) {
            System.out.println("понедельник");
        }
        if (num == 2) {
            System.out.println("вторник");
        }
        if (num == 3) {
            System.out.println("среда");
        }
        if (num == 4) {
            System.out.println("чнтверг");
        }
        if (num == 5) {
            System.out.println("пятница");
        }
        if (num == 6) {
            System.out.println("суббота");
        }
        if (num == 7) {
            System.out.println("воскресенье");
        }
        if (num < 1 || num > 7) {
            System.out.println("такого дня недели не существует");
        }

    }

}