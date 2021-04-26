package com.company.lesson12;
/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
Примечание: Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Катя, пол: женский, возраст: 55
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
//решено

public class homeWork01 {

    public static class Human{
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;


        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            return  name  +
                    ", age=" + age +
                    ", father=" + ((father == null)?"" : father.name) +
                    ", mother=" + ((mother == null)?"" : mother.name) +
                    ", sex=" + ((sex == true)?"male" : "female");
        }

    }

    public static void main(String[] args) {

        Human grandMother1 = new Human("Lena",false,60,null,null);
        Human grandMother2 = new Human("Nat",false,60,null,null);
        Human grandFather1 = new Human("Zurab",true,60,null,null);
        Human grandFather2 = new Human("Vlad",true,60,null,null);
        Human mother = new Human("Inna",false,34,grandFather1,grandMother1);
        Human father = new Human("Ivan",true,30,grandFather2,grandMother2);
        Human son = new Human("Ubbi",true,0,father,mother);
        Human daughter = new Human("Leia",false,1,father,mother);

        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(daughter);
        System.out.println(son);

    }
}
