import java.util.Scanner;

public class Main {

    // Это комментарии

    /*
    И это тоже комментарии
     */

    /*И даже это комментарии*/

    // Дипазон значений для примитивных типов данных
    private static void Example_1() {
        System.out.println("\nПример 1\n");

        System.out.println("Целочисленные типы данных:");
        System.out.println("Диапазон для byte (8 бит): " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
        System.out.println("Диапазон для short (16 бит): " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
        System.out.println("Диапазон для int (32 бита): " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
        System.out.println("Диапазон для long (64 бита): " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
        System.out.println("Диапазон для char (16 бит): " + (int) Character.MIN_VALUE + " - " + (int) Character.MAX_VALUE);

        System.out.println("Вещественные типы данных:");
        System.out.println("Диапазон для float (32 бита): " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
        System.out.println("Диапазон для doulbe (64 бита) : " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);

        // Для boolean. Размер вне массива - 1 бит, размер в составе массива 32 бита, т.к. используется int
        System.out.println("Логический тип данных boolean(1 или 32 бита) : false-true");
    }

    // Инициализация переменных
    private static void Example_2() {
        System.out.println("\nПример 2\n");

        // Пример литералов : a, в, k, j, н, 1, 5, 0,

        //int a,b,c; - не делайте так
        int a = 0, b = 0, c = 0;

        // -------Целочисленные типы данных
        byte var_byte = 2;
        short var_short = 3000;
        int var_int = 50000;
        long var_long = 1000000L;

        // ------Вещественные типы данных
        // Вещественное число с одинарной точностью
        float var_float = 0.21f;
        // Вещественное число с двойной точностью
        double var_double = 0.21D;

        // ------Логический тип данных
        boolean var_boolean = true;

        // ------Символьный тип данных
        char var_char = 'h';

        // ------Строка
        String var_string = "Hello!";

        //byte a_byte = 256; - ошибка компиляции

        // Пример неявного(безопасного каста)
        byte x = 20;
        int y = x;

        // Пример явного (опасного каста)
        int x2 = 5421;
        byte y2 = (byte) x2;

        // Шестнадцатеричное представление
        int X = 0xff; // 0x
        // Восьмеричное представление
        int Y = 0255; // 0

        System.out.println(X);
        System.out.println(Y);
    }

    // Работа с константой
    private static void Example_3() {
        // В Java принято для констант писать идентификаторы большими буквами
        final int LOG_TAG = 20;
        //LOG_TAG = 12; - ошибка компиляции
    }

    // Арифметические операции
    private static void Example_4() {
        System.out.println("\nПример 4\n");

        int opr1 = 30;
        int opr2 = 20;
        // Динамическая инициализация переменной
        int sum = opr1 + opr2;

        System.out.println("Сложение " + opr1 + "+" + opr2 + "=" + sum);
        System.out.println("Вычитание " + opr1 + "-" + opr2 + "=" + (opr1 - opr2));
        System.out.println("Умножение " + opr1 + "*" + opr2 + "=" + (opr1 * opr2));
        // Отбросит вещественную часть, т.к. оба операнда целочисленные
        System.out.println("Деление (неправильное) " + opr1 + "/" + opr2 + "=" + (opr1 / opr2));
        // Сохранит вещественную часть, т.к. один из операндов вещественный
        System.out.println("Деление (правильное) " + opr1 + "/" + opr2 + "=" + ((double) opr1 / opr2));
        System.out.println("Остаток от деления для int  " + opr1 + "%" + opr2 + "=" + (opr1 % opr2));
        System.out.println("Остаток от деления для double  " + opr1 + "%" + opr2 + "=" + ((double) opr1 % opr2));

        // Важное правило. Если при делении, Вы используете только целочисленные переменные, то обязательно приведите один из них к вещественному типу.
        // Или, если в выражении есть литералы, то запишите их так : 21.
        System.out.println("Результат выполнения операции 30/20=" + 30 / 20); // 1
        System.out.println("Результат выполнения операции 30./20=" + 30. / 20); // 1.5
        System.out.println("Результат выполнения операции (double)30/20=" + (double) 30 / 20); // 1.5

        // В Java, как и во многих других языках программировния нельзя делить на целочисленный ноль
        //System.out.println(20/0); // Этот фрагмент кода вызовет исключение
        System.out.println("Результат выполнения операции 20/0.=" + 20 / 0.); // infinity
        System.out.println("Результат выполнения операции -20/0.=" + -20 / 0.); // -infinity
    }

    // Сокращенная запись арифметических операций
    private static void Example_5() {
        System.out.println("\nПример 5\n");

        double a = 100;

        System.out.println("Переменная изначально : a = " + a);

        // a = a + 20;
        a += 20;
        System.out.println("a+=20  = " + a);
        //a = a - 20;
        a -= 20;
        System.out.println("a-=20  = " + a);
        a /= 3;
        System.out.println("a/=3  = " + a);
        a *= 7;
        System.out.println("a*=7  = " + a);
        a %= 3;
        System.out.println("a%3  = " + a);
    }

    // Инкремент, декремент
    private static void Example_6() {
        // Достаточно часто, при написании программ, необходимо увеличивать или уменьшать значение переменной на 1
        // Т.е. мы можем записать это действие, как :
        // x = x + 1; x = x - 1 ; или
        // x+=1; x-=1; но в Java для этого предусмотрены специацльный операторы, которые упрощают эти действия

        // ++x - префиксный инкремент, сначала увеличиваем - потом используем
        // x++ - постфиксный инкремент, сначала используем - потом увеличиваем

        // --x - префиксный декремент, сначала уменьшаем - потом используем
        // x++ - постфиксный декремент, сначала используем - потом уменьшаем

        System.out.println("\nПример 6\n");

        int x = 0;

        System.out.println("Использовали постфиксный инкремент (x++) : " + x++);
        System.out.println("Перешли к следующей команде : " + x);
        System.out.println("Использовали префиксный инкремент (++x) : " + ++x);

        // Для декремента всё аналогично
    }

    // Класc для работы с математикой Math
    private static void Example_7() {
        // Для различных задач, связанных с математикой в Java предусмотрен класс Math
        // Далее рассмотрим класс Math, содержащий различные математически функции. Рассмотрим некоторые из них:

        // Math.abs(n) — возвращает модуль числа n.
        // Math.round(n) — возвращает целое число, ближайшее к вещественному числу n (округляет n).
        // Math.ceil(n) — возвращает ближайшее к числу n справа число с нулевой дробной частью (например, Math.ceil(3.4) в результате вернёт 4.0).
        // Math.cos(n), Math.sin(n), Math.tan(n) — тригонометрические функции sin, cos и tg от аргумента n, указанного в радианах.
        // Math.acos(n), Math.asin(n), Math.atan(n) — обратные тригонометрические функции, возвращают угол в радианах.
        // Math.toDegrees(n) — возвращает градусную меру угла в n радианов.
        // Math.toRadians(n) — возвращает радианную меру угла в n градусов.
        // Math.sqrt(n) — возвращает квадратный корень из n.
        // Math.pow(n, b) — возвращает значение степенной функции n в степени b, основание и показатель степени могут быть вещественными.
        // Math.log(n) — возвращает значение натурального логарифма числа n.
        // Math.log10(n) — возвращает значение десятичного логарифма числа n.

        // Большинство из этих функций принимает и возвращает значание типа double

        // Кроме функций в рассматриваемом классе имеются две часто используемых константы:
        // Math.PI — число «пи», с точностью в 15 десятичных знаков.
        // Math.E — число Неппера (основание экспоненциальной функции), с точностью в 15 десятичных знаков.

        // Примеры использования:

        System.out.println("\nПример 7\n");

        System.out.println(Math.abs(-2.33)); // выведет 2.33
        System.out.println(Math.round(Math.PI)); // выведет 3
        System.out.println(Math.round(9.5)); // выведет 10
        System.out.println(Math.round(9.5 - 0.001)); // выведет 9
        System.out.println(Math.ceil(9.4)); // выведет 10.0
        // Находим гипотенузу треугольника с катетами 3 и 4
        double c = Math.sqrt(3 * 3 + 4 * 4);
        System.out.println(c); // выведет гипотенузу треугольника с катетами 3 и 4
        double s1 = Math.cos(Math.toRadians(60));
        System.out.println(s1); // выведет косинус угла в 60 градусов

        // Также, класс Math позволяет получить псевдослучайное значение
        // Примеры:

        System.out.println(Math.random()); // вещественное число из [0;1)
        System.out.println(Math.random() + 3); // вещественное число из [3;4)
        System.out.println(Math.random() * 5); // вещественное число из [0;5)
        System.out.println((int) (Math.random() * 5)); // целое число из [0;4]
        System.out.println(Math.random() * 5 + 3); // вещественное число из [3;8)
        System.out.println ((int) (Math.random() * 5 + 3)); // целое число из [3;7]
        System.out.println((int) (Math.random() * 11) - 5); // целое число из [-5;5]
    }

    // Ввод данных в консоль
    private static void Example_8() {
        // Создаём экземпляр класса Scanner для считывания данных, введенных пользователем
        System.out.println("\nПример 8\n");

        Scanner scanner = new Scanner(System.in);

        byte var_byte = 0;
        short var_short = 0;
        int var_int = 0;
        long var_long = 0L;

        char var_char = '\0'; // \0 - символ окончания строки

        float var_float = 0f;
        double var_double = 0D;

        String string = "";

        var_byte = scanner.nextByte();
        var_short = scanner.nextShort();
        var_int = scanner.nextInt();
        var_long = scanner.nextLong();

        var_char = (char) scanner.nextShort();

        var_float = scanner.nextFloat();
        var_double = scanner.nextDouble();

        string = scanner.next();
    }

    // Главная функция - с неё начинается выполнение программы, в ней и заканчивается, если программа отработала успешно
    public static void main(String[] args) {

        //System.out.println("Hello world !");

        // Уберите комментарий, чтобы запустить пример
        //Example_1();
        //Example_2();
        //Example_3();
        //Example_4();
        //Example_5();
        //Example_6();
        //Example_7();
        //Example_8();
    }
}

