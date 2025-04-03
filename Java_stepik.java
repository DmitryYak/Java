
//Доработайте программу так, чтобы она выводила на печать имя, возраст и рост.
class Man {
    public static void main(String[] args) {
        String name = "Ivan";
        int age = 25;
        Double height = 1.85;
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

//Доработайте программу так, чтобы она выводила на печать имя "Ivan" (без кавычек).

class Man {
    public static void main(String[] args) {
        String name = "Ivan";
        System.out.println(name);
    }
}

//Присвойте переменной myVar значение 3.1415 и выведите на печать.
class Main {
    public static void main(String[] args) {
        Double myVar = 3.1415;
        System.out.print(myVar);
    }
}

//Напишите программу, выводящую на печать фразу "Я программирую на Java" (без кавычек).
class Main {
    public static void main(String[] args) {
        //put your code here
        String phrase = "Я программирую на Java";
        System.out.println(phrase);
    }
}

//Напишите программу, которая присваивает трем переменным значения 100, 200 и 300.
//
//Выведите на печать значения переменных в столбик, а затем в строку через пробел.
//
//Примечание 1. Вспомните о различии методов println() и print().
//
//Примечание 2. Пробел - это не пустота, а тоже символ.
class Main {
    public static void main(String[] args) {
        //put your code here
        Number first = 100;
        Number second = 200;
        Number third = 300;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.print(first + " " + second + " " + third);
        //System.out.println(first + " " + second + " " + third);
    }
}

//Создайте четыре переменных разного типа и выведите их на печать, каждое на новой строке. Присвойте переменным значения:
//
//1)  2021
//
//2)  3.1415
//
//3)  Java
//
//4) 5  < 10
//
//Выведите значения переменных столбиком в этом же порядке.
class Main {
    public static void main(String[] args) {
        //put your code here
        Number year = 2021;
        Double dub = 3.1415;
        String lang = "Java";
        Boolean trueFalse = 5  < 10;
        System.out.println(year);
        System.out.println(dub);
        System.out.println(lang);
        System.out.println(trueFalse);

    }
}