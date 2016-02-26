import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * Напишете програма, която намира сбора на всичките четни елементи в
		 * масив.
		 */
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(sum);

		/*
		 * Напишете програма, която попълва числата на Фибоначи в масив.
		 * Потребител въвежда колко да е голям масива.
		 */
		int size = in.nextInt();
		int b[] = new int[size];
		b[0] = 1;
		b[1] = 1;
		for (int i = 2; i < b.length; i++) {
			b[i] = b[i - 1] + b[i - 2];
		}
		System.out.println(Arrays.toString(b));

		/*
		 * Напишете програма, която създава масив с 10 елемента от целочислен
		 * тип и инициализира елементите със стойност индекса умножен по 10.
		 */
		int c[] = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = i * 10;
		}
		System.out.println(Arrays.toString(c));

		/*
		 * Напишете програма, която търси число в масив от числа и връща индекса
		 * на първото четно намерено число. Забележка: Може да няма нито едно
		 * четно число, тогава се връща -1.
		 */
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
