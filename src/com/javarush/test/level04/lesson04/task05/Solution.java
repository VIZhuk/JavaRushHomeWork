package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
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

        if ( num > 0) {
            System.out.println(num*2);
        } else if ( num < 0) {
            System.out.println(num+1);
        }
    }

}