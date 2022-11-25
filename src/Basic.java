
public class Basic {

    public static void resolveCanBrickEnterTheHole(int a, int b, int x, int y, int z) {
        /**
         * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
         * Определить, пройдет ли кирпич через отверстие.
         */

        if ((a + b) >= (x + z) || (a + b) >= (x + y) || (a + b) >= (z + y)) {
            System.out.println("In");
        } else {
            System.out.println("NotIn");
        }

    }

    public static void isPointsOnLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        /**
         * x1 =1, y1 =1, x2 =2, y2 =2, x3 =3, y3 =3
         *  (x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)
         *   (3-1)*(2-1) == (3-1)*(2-1)
         *   2*1 == 2*1
         *   2==2
         */
        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("Точки принадлежат одной прямой");
        } else {
            System.out.println("Точки НЕ принадлежат одной прямой");
        }

    }

    public static void findMaxValueFromMin(int a, int b, int c, int d) {
        /**
         * Найти max(min(a, b), min(c, d))
         * a=5
         * b=3
         * c=8
         * d=4 - answer
         */

        int foundValue = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(foundValue);

    }

    public static void checkIfTriangleExistsAndRectangular(int a, int b) {
        /**
         * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
         * и если да, то будет ли он прямоугольным.
         */

        if (a + b < 180) {
            System.out.println("Треугольник существует");
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("Треугольник прямоугольный!");
            }
        } else {
            System.out.println("Треугольник НЕ существует");
        }
    }

    public static void findDigitsInFirstAndSecondNumbers(int numberOne, int numberTwo) {
        /**
         * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
         * 3456
         * 6578
         *
         * Попроовать поменять местами переменные дабы было волшебно. ( никаких массивов )
         * Решить проблему дупликации
         *
         * + Одномерные массивы
         */
//        int one = numberOne % 10; =6
//        int two = numberOne / 10; =345
//
//        int three = two % 10; =5
//        int forth = two / 10; =34
//
//        int five = forth % 10; =4
//        int six = forth / 10; =3
//
//        int seven = six % 10; =3
//        int eight = six / 10; =0

        int temp = numberTwo;

        while (numberOne > 0) {
            while (numberTwo > 0) {
                if (numberOne % 10 == numberTwo % 10)
                    System.out.println(numberTwo % 10);
                numberTwo = numberTwo / 10;
            }
            if (numberTwo == 0) {
                numberTwo = temp;
            }
            numberOne = numberOne / 10;

        }

    }

    public static void findDivisorsForNumbersInRangeExceptZeroAndItself(int m, int n) {
        /**
         * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
         * m и n вводятся с клавиатуры
         */

        for (int i = m; i <= n; i++) {
            if (i > 0) {
                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        System.out.println(j);
                    }
                }
            }
        }
    }

    public static void findSum(double e) {
        /**
         * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
         * заданному е. Общий член ряда имеет вид
         *
         */
        double sum = 0;
        int itemIndex = 0;
        double item = findItemModule(itemIndex);
        while (item >= e) {
            sum += item;
            itemIndex++;
            item = findItemModule(itemIndex);
        }
        System.out.println(sum);
    }

    private static double findItemModule(int itemIndex) {
        /**
         * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
         * заданному е. Общий член ряда имеет вид
         *
         */

        return Math.abs((1 / Math.pow(2, itemIndex)) + (1 / Math.pow(3, itemIndex)));
    }

    public static void findMultiplicationOfFirstTwoHundredSqrt() {
        /**
         * Составить программу нахождения произведения квадратов первых двухсот чисел.
         */
        long multiplication = 1;
        for (int i = 1; i <= 200; i++) {
            multiplication *= Math.pow(i, 2);
        }
        System.out.println(multiplication);

    }

    public static void findSumOfFirstHundredSqrt() {
        /**
         * Найти сумму квадратов первых ста чисел.
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }

    public static void sumNumbersFromOneToUserNumber(int userNumber) {
        /**
         * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
         * все числа от 1 до введенного пользователем числа.
         */
        if (userNumber < 1) {
            System.out.println("Лошара ввел неправильное число!");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= userNumber; i++) {

            sum += i;
        }

        System.out.println("Сумма чисел от 1 до введенного пользователем равна : " + sum);
    }

    public static void areaInXandY(int x, int y) {
        if (((x <= 2 && x >= -2) && (y >= 0 && y <= 4)) || ((x <= 4 && x >= -4) && (y >= -3 && y <= 0))) {
            if ((x == 0 & y == -1)) {
                System.out.println("FALSE");
                return;
            }
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static void findValueInHourMinuteSecond() {
        int t = 83540;
        int hours = t / 3600;
        int minutes = (t - hours * 3600) / 60;
        int seconds = t - hours * 3600 - minutes * 60;

        System.out.println("Time : " + hours + " hours " + minutes + " minutes " + seconds + " seconds ");

    }

    public static void changePlaceNumber() {
        double givenNumber = 123.456;
        double result = (givenNumber * 1000) % 1000 + (int) givenNumber / 1000.0;
        System.out.println(result);

    }

    public static void findValueExpressionUsingFormula(double x, double y) {

        /**
         * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
         * (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦 / 𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦
         */

        double sinX = Math.sin(x);
        double cosY = Math.cos(y);

        double cosX = Math.cos(x);
        double sinY = Math.sin(y);

        double tg = Math.tan(x * y);

        double sumSinCos = sinX + cosY;
        double subCosSin = cosX - sinY;

        double fraction = sumSinCos / subCosSin;

        double foundValue = fraction * tg;
        System.out.println(foundValue);
    }


    public static void findValueExpression(double a, double b, double c) {
        /**
         * Вычислить значение выражения по формуле  ((b + Sqrt(b^2 + 4 ac)) / 2a) - (a^3 * c + b^-2)
         * (все переменные принимают действительные значения):
         */
        System.out.println("Найти значение выражения : ((b + Sqrt(b^2 + 4ac)) / 2a) - (a^3 * c + b^-2)");

        double z = Math.pow(b, 2);
        double w = 4 * a * c;
        double k = Math.sqrt(z + w);
        double e = (b + k) / 2 * a; // Находим значение первой части

        double u = (Math.pow(a, 3) * c) + (Math.pow(b, -2)); // Находим значение второй части

        double endValue = e - u;

        System.out.println("Значение выражения равно : " + endValue);


    }

    public static void findValueFunction(int a, int b, int c) {
        // Найти значение функции : z = ((a-3) * b / 2) + c
        System.out.println("Найти значение функции z = ((a-3) * b / 2) + c");
        int z = 0;
        int q = (a - 3) * b;
        z = q / 2 + c;
        System.out.println("Значение функции z : " + z);
    }
}
