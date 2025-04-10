
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

// Scanner as input values
//Доработайте программу так, чтобы она считывала строку, а затем выводила эту же строку на печать.
//
//Примечание. В этой задаче, как и в большинстве других, есть скрытые тесты с другими значениями ввода.
// Код не должен быть привязан к конкретным данным.

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);


    }
}

//Напишите программу, которая считывает имя пользователя и затем приветствует его.

import java.util.Scanner;
class MySolution {
    public static void main(String[] args) {
        //put your code here
        Scanner sc = new Scanner(System.in);
        String nameHi = "Привет, ";
        System.out.print(nameHi);
        System.out.println(sc.nextLine());
    }
}

//Напишите программу, которая считывает строку, а затем выводит эту же строку на печать 3 раза в столбик.
import java.util.Scanner;
class MySolution {
    public static void main(String[] args) {
        //put your code here
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        System.out.println(scString);
        System.out.println(scString);
        System.out.println(scString);
        sc.close();
    }
}

//Напишите программу, которая считывает строку, а затем выводит эту же строку на печать 2 раза в первой строке через пробел,
// а затем ещё два раза в столбик.
import java.util.Scanner;
class MySolution {
    public static void main(String[] args) {
        //put your code here
        Scanner sc = new Scanner(System.in);
        String scPrint = sc.nextLine();
        System.out.println(scPrint + " " + scPrint);
        System.out.println(scPrint);
        System.out.println(scPrint);


    }
}

//Напишите программу, которая считывает целое число t - температуру воздуха, и выводит фразу:
//
//Температура воздуха сегодня: t градусов.
import java.util.Scanner;
class MySolution {
    public static void main(String[] args) {
        //put your code here
        String myText_1 = "Температура воздуха сегодня: ";
        String myText_2 = " градусов.";
        Scanner sc = new Scanner(System.in);
        String degree = sc.nextLine();
        System.out.println(myText_1 + degree + myText_2);

    }
}

//Напишите программу, которая принимает три числа - год, месяц и день и выводит на печать фразу:
//
//DD:MM:YYYY.
//
//Проверять валидность даты не требуется.
import java.util.Scanner;
class MySolution {
    public static void main(String[] args) {
        //put your code here
        Scanner sc = new Scanner(System.in);
        String year = sc.nextLine();
        String month = sc.nextLine();
        String day = sc.nextLine();
        System.out.print(day + ":" + month + ":" + year);
    }
}

//Давайте напишем программу-помощника, которая сообщает, сколько у Вас новых сообщений на почте.
//
//Формат ввода. На первой строке вводится имя пользователя, на второй имя помощника, на третьей - количество сообщений.
//
//Формат вывода - в соответствии с образцом.Sample Output:
//
//Привет, Илон Маск, это твой помощник Рогозин.
//У тебя 19 новых писем.
import java.util.Scanner;
class HowMessages
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameUser = sc.nextLine();
        String nameHelper = sc.nextLine();
        String countMessages = sc.nextLine();

        System.out.println("Привет, " + nameUser + ", это твой помощник " + nameHelper + ".");
        System.out.println("У тебя " + countMessages + " новых писем.");
    }

}

//Operators
//Закончите программу таким образом, чтобы она выводила на печать целое число 5. Переменную можно назвать myVar.
class MyNumber {
    public static void main(String[] args) {
        // put your code here
        Number myVar = 5;
        System.out.print(myVar);
   }
}

//Завершите программу, которая выводит на печать сумму чисел 2 и 4. Переменную вывода можно назвать myVar.
class MyNumber {
    public static void main(String[] args) {
        int x = 2; int y = 4;
        // put your code here
        int myVar = x + y;
        System.out.print(myVar);
   }
}

//Напишите программу, которая получает два целых числа и выводит их сумму.
import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int firstNum = sc.nextInt();
    int secondNum = sc.nextInt();
    System.out.println(firstNum + secondNum);
   }
}

//На вход подаются два положительных действительных числа - стороны прямоугольника. Посчитайте его площадь и периметр и выведите на отдельных строках.
import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(x * y);
        System.out.println((x * 2) + (y * 2));
   }
}

import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double x = (sc.nextDouble());
        double y = (5 * (x * x)) + (2 * x) + 11;
        System.out.println(y);
   }
}

//На вход подаётся целое число n. Выведите в одной строке через пробел само число, его квадрат и куб.
import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " ");
        System.out.print(n * n + " ");
        System.out.print(n * n * n);

    }
}
//На вход подаётся три числа. Выведите на одной строке их среднее арифметическое.
import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       double x = sc.nextDouble();
        double y = sc.nextDouble();
        double i = sc.nextDouble();
        double result = ((x + y + i) / 3);
        System.out.println(result);
   }
}
