package by.etc.code_review.main;

import java.lang.Math.*;

import static java.lang.Math.*;

public class Basic1 {
    public static void main(String[] args) {

        //line programm

        //1. Find: z = ( (a – 3 ) * b / 2) + c.
        int a = 1;
        int b = 2;
        int c = 3;
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);

        //2. Find: (( 𝑏 + √𝑏^2+ 4𝑎𝑐)/2a)-a^3*c+b^-2
        System.out.println(((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - pow(a, 3) * c + pow(b, -2));

        //3. Find: ((sinX+cosY)/(cosX-sinY))*tg xy
        int x = 30;
        int y = 45;
        System.out.println(((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x + y));

        //4. R=nnn.ddd Find: R=ddd.nnn
        String R = "123.567";
        StringBuilder builder = new StringBuilder();

        int countIndex = R.indexOf('.');
        builder.append(R.substring(countIndex + 1, R.length()));
        builder.insert(R.length() - countIndex - 1, ".");
        builder.append(R.substring(0, countIndex));
        System.out.println(builder.toString());

        //5. T = XXX sec. Print HH hr MM min SS sec
        int T = 389;
        System.out.printf("%02d %02d %02d", T / 3600, T % 3600 / 60, T % 60);
        System.out.println();

        //6. Для  данной  области  составить  линейную  программу,  которая  печатает  true,
        // если  точка  с  координатами  (х,  у) принадлежит закрашенной области, и false — в противном случае:
        x = 4;
        y = -3;
        if ((-4 <= x && x <= 4) && -3 <= y && y <= 0 || (-2 <= x && x <= 2) && 4 >= y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //branching

        //1. give angle 1 and angle 2. Determine whether such a triangle exists, and if so, rectangular whether.
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

        //4.
        int A = 40;
        int B = 50;
        x = 45;
        y = 50;
        z = 45;
        if (A >= x && (B >= y || B >= z)) {
            System.out.println("Brick will pass");
        } else if (A >= y && (B >= x || B >= z)) {
            System.out.println("Brick will pass");
        } else if (A >= z && (B >= y || B >= x)) {
            System.out.println("Brick will pass");
        } else {
            System.out.println("Brick will not pass");
        }


    }
}