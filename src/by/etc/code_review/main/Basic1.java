package by.etc.code_review.main;

import java.util.Scanner;

import static java.lang.Math.*;

public class Basic1 {
    public static void main(String[] args) {

        //line program

        //1. Find: z = ( (a – 3 ) * b / 2) + c.
        System.out.println("Task 1 line program: ");
        int a = 1;
        int b = 2;
        int c = 3;
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);

        //2. Find: (( 𝑏 + √𝑏^2+ 4𝑎𝑐)/2a)-a^3*c+b^-2
        System.out.println("Task 2 line program: ");
        System.out.println(((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - pow(a, 3) * c + pow(b, -2));

        //3. Find: ((sinX+cosY)/(cosX-sinY))*tg xy
        System.out.println("Task 3 line program: ");
        double degrees1 = 30.0;
        double radians1 = Math.toRadians(degrees1);
        double degrees2 = 45.0;
        double radians2 = Math.toRadians(degrees2);
        System.out.println(((sin(radians1) + cos(radians2)) / (cos(radians1) - sin(radians2))) * tan(radians1 + radians2));

        //4. R=nnn.ddd Find: R=ddd.nnn
        System.out.println("Task 4 line program: ");
        String number = "123.567";
        StringBuilder builder = new StringBuilder();

        int countIndex = number.indexOf('.');
        builder.append(number.substring(countIndex + 1, number.length()));
        builder.insert(number.length() - countIndex - 1, ".");
        builder.append(number.substring(0, countIndex));
        System.out.println("Task 4: ");
        System.out.println(builder.toString());

        //5. T = XXX sec. Print HH hr MM min SS sec
        System.out.println("Task 5 line program: ");
        int time = 389;
        System.out.printf("%02d %02d %02d", time / 3600, time % 3600 / 60, time % 60);
        System.out.println();


        //6. Для  данной  области  составить  линейную  программу,  которая  печатает  true,
        // если  точка  с  координатами  (х,  у) принадлежит закрашенной области, и false — в противном случае:
        System.out.println("Task 6 line program: ");
        int coordinateX = 4;
        int coordinateY = -3;
        if ((-4 <= coordinateX && coordinateX <= 4) && -3 <= coordinateY && coordinateY <= 0 || (-2 <= coordinateX && coordinateX <= 2) && 4 >= coordinateY) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //branching

        //1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
        System.out.println("Task 1 branching: ");
        int angel1 = 0;
        int angel2 = 0;
        if ((angel1 + angel2) < 180 && (angel1 != 0 || angel2 != 0)) {
            if (angel1 + angel2 == 90) {
                System.out.println("Right triangle");
            } else {
                System.out.println("The triangle exists");
            }
        } else {
            System.out.println("The triangle does not exist");
        }

        //2.Найти max{min(a, b), min(c, d)}
        System.out.println("Task 2 branching: ");
        int numberA = 3;
        int numberB = 6;
        int numberC = 4;
        int numberD = 2;
        int funcMin1;
        int funcMin2;
        int funcMax;

        funcMin1 = (numberA > numberB) ? numberB : numberA;
        System.out.println(funcMin1);
        funcMin2 = (numberC > numberD) ? numberD : numberC;
        System.out.println(funcMin2);
        funcMax = (funcMin1 > funcMin2) ? funcMin1 : funcMin2;
        System.out.println("Max value this function: " + funcMax);

        //3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
        System.out.println("Task 3 branching: ");
        int coordinateX1 = 0;
        int coordinateX2 = 1;
        int coordinateX3 = 2;
        int coordinateY1 = 0;
        int coordinateY2 = 1;
        int coordinateY3 = 2;
        if (coordinateX1 % coordinateX2 == 0 && coordinateX2 % coordinateX3 == 0 && coordinateX1 % coordinateX3 == 0 && coordinateY1 % coordinateY2 == 0 && coordinateY2 % coordinateY3 == 0 && coordinateY1 % coordinateY3 == 0) {
            System.out.println("These points will be on one straight line");
        } else {
            System.out.println("These points will not be on the same line");
        }

        //4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z  кирпича. Определить, пройдет ли кирпич через отверстие.
        System.out.println("Task 4 branching: ");
        int verticalSize = 40;
        int horizontalSize = 50;
        int sizeX = 45;
        int sizeY = 50;
        int sizeZ = 45;
        if (verticalSize >= sizeX && (horizontalSize >= sizeY || horizontalSize >= sizeZ)) {
            System.out.println("Brick will pass");
        } else if (verticalSize >= sizeY && (horizontalSize >= sizeX || horizontalSize >= sizeZ)) {
            System.out.println("Brick will pass");
        } else if (verticalSize >= sizeZ && (horizontalSize >= sizeY || horizontalSize >= sizeX)) {
            System.out.println("Brick will pass");
        } else {
            System.out.println("Brick will not pass");
        }

        //5. Вычислить значение функции: если х<=3 x^2-3x+9. если x>3 1/(x^3+6)
        System.out.println("Task 5 branching: ");
        int x = 3;
        if (x <= 3) {
            System.out.println(pow(x, 2) - 3 * x + 9);
        } else {
            System.out.println(1 / (pow(x, 3) + 6));
        }

        //loop
        //1.Напишите  программу,  где  пользователь  вводит любое  целое  положительное  число. А  программа  суммирует все числа от 1 до введенного пользователем числа.
        System.out.println("Task 1 loop: ");
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        int positiveNumber = 0;
        while (valid) {
            try {
                System.out.println("Input positive number: ");
                String readLine = scanner.nextLine();
                positiveNumber = Integer.parseInt(readLine);
            } catch (Exception e) {
                System.out.println("Sorry. Invalid input.");
            }
            if (positiveNumber > 0) {
                valid = false;
            } else {
                System.out.println("Sorry. Invalid input.");
            }
        }
        int resultTask1 = 0;
        for (int i = 1; i <= positiveNumber; i++) {
            resultTask1 += i;
        }
        System.out.println("The sum of all numbers from 1 to " + positiveNumber + ": " + resultTask1);

        //2.Вычислить значения функции на отрезке [а,b] c шагом h:  x, x>2; -x,x<=2
        System.out.println("Task 2 loop: ");
        int startSection = 0;
        int endSection = 15;
        int step = 3;
        System.out.println("Промежуток " + startSection + " - " + endSection + " шаг = " + step);
        for (int i = startSection; i <= endSection; i += step) {
            int result = i > 2 ? i : -i;
            System.out.println(" Result = " + result);
        }
        //3. Найти сумму квадратов первых ста чисел.
        System.out.println("Task 3 loop: ");
        int number3 = 100;
        System.out.println(calculatingSumSquaresNumber(number3));
        // alternative
        int resultTask3 = 0;
        for (int i = 1; i <= number3; i++) {
            resultTask3 += pow(i, 2);
        }
        System.out.println("alternative");
        System.out.println(resultTask3);

        //4. Составить программу нахождения произведения квадратов первых двухсот чисел.
        System.out.println("Task 4 loop: ");
        int number4 = 200;
        System.out.println(calculatingMultiplySquaresNumber(number4));
        // alternative
        long resultTask4 = 1;
        for (int i = 1; i <= number4; i++) {
            resultTask4 *= pow(i, 2);
        }
        System.out.println("alternative");
        System.out.println(resultTask4);

        //5. Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен заданному е. Общий член ряда имеет вид:
        System.out.println("Task 5 loop: ");
        float sum = 0;
        float numberE = 0.005f;
        int n = 5;
        for (int i = 0; i <= n; i++) {
            double result5 = ((Math.pow((Math.pow(2, i)), -1)) + (Math.pow((Math.pow(3, i)), -1)));

            if (Math.abs(result5) >= numberE)
                sum += result5;
        }
        System.out.println(sum);

        //6.  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
        // English small letter
        System.out.println("Task 6 loop: ");
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println("Letter: " + Character.valueOf((char) i) + ", his number: " + i);
        }
        // English capital letter
        System.out.println();
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println("Letter: " + Character.valueOf((char) i) + ", his number: " + i);
        }
        // Russian small letter
        System.out.println();
        for (int i = 'а'; i <= 'я'; i++) {
            System.out.println("Letter: " + Character.valueOf((char) i) + ", his number: " + i);
        }
        // Russian capital letter
        System.out.println();
        for (int i = 'А'; i <= 'Я'; i++) {
            System.out.println("Letter: " + Character.valueOf((char) i) + ", his number: " + i);
        }

        //7.  Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
        System.out.println("Task 7 loop: ");
        int start = 0;
        int end = 0;

        try {
            System.out.println("Введите начало промежутка: ");
            start = scanner.nextInt();
            System.out.println("Введите конец промежутка: ");
            end = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry. Try again.");
        }

        for (int i = start; i <= end; i++) {
            System.out.println("Для числа " + i + " существуют следующие делители: ");
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }

        //8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
        System.out.println("Task 8 loop: ");
        int firstNumber = 123567801;
        int secondNumber = 678901230;
        String stringNumber1 = String.valueOf(firstNumber);
        String stringNumber2 = String.valueOf(secondNumber);
        System.out.println("Digits included in the record as the first and second numbers: ");
        for (int i = 0; i < stringNumber1.length(); i++) {
            for (int j = 0; j < stringNumber2.length(); j++) {
                if (stringNumber1.charAt(i) == stringNumber2.charAt(j)) {
                    System.out.print(stringNumber1.charAt(i));
                }
            }
        }

    }

    private static long calculatingMultiplySquaresNumber(int number4) {
        long result = 1;
        if (number4 == 1 || number4 == 0) {
            return result;
        }
        result = (long) (pow(number4, 2) * calculatingMultiplySquaresNumber(number4 - 1));
        return result;
    }

    private static int calculatingSumSquaresNumber(int number3) {
        int result = 1;
        if (number3 == 1 || number3 == 0) {
            return result;
        }
        result = (int) (pow(number3, 2) + calculatingSumSquaresNumber(number3 - 1));
        return result;
    }
}