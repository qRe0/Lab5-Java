import java.util.Arrays;

public class RationalDemo {
    public static void main(String[] args) {
        Rational[] rationals = {
                new Rational(5, 7),
                new Rational(1, 3),
                new Rational(1, 9),
                new Rational(2, 5),
                new Rational(3, 4)
        };

        // Выводим несортированный массив
        System.out.println("Unsorted array:");
        for (Rational r : rationals) {
            System.out.println(r);
        }

        // Демонстрируем метод toString()
        System.out.println("\nDemonstration of toString():");
        System.out.println(rationals[0].toString());

        // Демонстрируем метод getNumerator() - получаем числитель 5
        System.out.println("\nDemonstration of getNumerator():");
        System.out.println(rationals[0].getNumerator());

        // Демонстрируем метод getDenominator() - получаем знаменатель 7
        System.out.println("\nDemonstration of getDenominator():");
        System.out.println(rationals[0].getDenominator());

        // Выполняем арифметические операции над дробями и выводим результаты
        Rational sum = rationals[0].add(rationals[1]);
        Rational difference = rationals[2].subtract(rationals[3]);
        Rational product = rationals[0].multiply(rationals[2]);
        Rational quotient = rationals[1].divide(rationals[3]);

        System.out.println("\nSum of first two fractions: " + sum);
        System.out.println("Difference of third and fourth fractions: " + difference);
        System.out.println("Product of first and third fractions: " + product);
        System.out.println("Quotient of second and fourth fractions: " + quotient);

        // Сортируем массив по числителям
        Arrays.sort(rationals);

        // Выводим отсортированный массив по числителям
        System.out.println("\nSorted array by numerators:");
        for (Rational r : rationals) {
            System.out.println(r);
        }

        // Сортируем массив по знаменателям
        Arrays.sort(rationals, new Rational(1, 1));

        // Выводим отсортированный массив по знаменателям
        System.out.println("\nSorted array by denominators:");
        for (Rational r : rationals) {
            System.out.println(r);
        }
        System.out.println("\n");
    }
}
