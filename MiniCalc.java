/* import java.util.Scanner;

/**
 * 1z,2z треугольноечисло, факториал
 */
/*public class DeltaFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число n: ");
        int n = sc.nextInt();
        sc.close();
        int deltasum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            deltasum += i;
            factorial *= i;
        }
        System.out.printf("Треугольное число %d (сумма чисел от 1 до %d) = %d\n", n, n, deltasum);
        System.out.printf("Факториал числа %d (произведение чисел от 1 до %d) = %d\n", n, n, factorial);

    }
}
 */
/**3z
 /**public class PrimeNums {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
*/

/**4z
/**import java.util.Scanner;

public class MiniCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double number_1 = sc.nextDouble();

        System.out.print("Введите второе число: ");
        double number_2 = sc.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        double result;

        switch(operator) {
            case '+':
                result = number_1 + number_2;
                break;
                
            case '-':
                result = number_1 - number_2;
                break;
            
            case '*':
                result = number_1 * number_2;
                break;
                
            case '/':
                result = number_2 / number_2;
                break;
                
            default:
                System.out.println("Некорректная операция.");
                return;
        }
        System.out.println(number_1 + " " + operator + " " + number_2 + " = " + result);
    }
}
*/
/**5z
Nesmog
Для решения этой задачи можно воспользоваться методом перебора. Начнем с замены знаков вопроса на все возможные цифры от 0 до 9 и будем проверять каждый вариант:

    Если полученное выражение верно, то мы нашли решение.
    Если полученное выражение неверно, то переходим к следующему варианту.

Применяя этот метод, мы можем получить несколько возможных решений. Вот один из таких вариантов:

28 + 37 = 65

При подстановке этих значений в уравнение q + w = e получаем:

q = 2, w = 8, e = 10

Таким образом, уравнение 28 + 37 = 65 является верным, а значения переменных q, w и e равны соответственно 2, 8 и 10.
*/