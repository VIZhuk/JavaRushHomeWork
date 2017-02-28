package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("Smith0", "Vasya1");
        names.put("Smith1", "Vasya1");
        names.put("Smith2", "Vasya2");
        names.put("Smith3", "Vasya1");
        names.put("Smith4", "Vasya4");
        names.put("Smith5", "Vasya1");
        names.put("Smith6", "Vasya3");
        names.put("Smith16", "Vasya3");
        names.put("Smith26", "Vasya3");
        names.put("Smith7", "Vasya1");

        return names;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashSet<String> namesUniq = new HashSet<String>();

        for (String name : copy.values()) {
            if (namesUniq.contains(name)) {
                removeItemFromMapByValue(map, name);
            } else {
                namesUniq.add(name);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

//    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        for (Map.Entry<String, String> pair: map.entrySet())
//        {
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
//
//        System.out.println("------------------------------------");
//
//        removeTheFirstNameDuplicates(map);
//
//        for (Map.Entry<String, String> pair: map.entrySet())
//        {
//            System.out.println(pair.getKey() + " : " + pair.getValue() + " !");
//        }
//    }
}
