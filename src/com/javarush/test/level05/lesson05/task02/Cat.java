package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        int ageW;
        int weightW;
        int strengthW;

        if (this.age > anotherCat.age) {
            ageW = 1;
        } else {
            ageW = 0;
        }
        if (this.weight > anotherCat.weight) {
            weightW = 1;
        } else {
            weightW = 0;
        }
        if (this.strength > anotherCat.strength) {
            strengthW = 1;
        } else {
            strengthW = 0;
        }

        int score = ageW + weightW + strengthW;
        if (score > 2) {
            return true;
        } else {
            return false;
        }

    }
}
