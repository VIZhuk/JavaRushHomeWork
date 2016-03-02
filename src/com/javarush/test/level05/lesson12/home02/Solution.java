package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Vlad",32,"Dnepr");
        Man man2 = new Man("Vlad",32,"Dnepr");
        Woman woman1 = new Woman("Elena",28,"Dnepr");
        Woman woman2 = new Woman("Elena",28,"Dnepr");

        man1.getAll();
        man2.getAll();
        woman1.getAll();
        woman2.getAll();
    }

    public static class Man
    {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void getAll()
        {
            System.out.println(name + " " + age + " " + address);
        }

    }

    public static class Woman
    {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void getAll()
        {
            System.out.println(name + " " + age + " " + address);
        }
    }
}
