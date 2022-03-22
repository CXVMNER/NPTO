package demoKlasa;
import java.util.Scanner;
import java.util.Random;

public class NowaKlasa {

	public static void main(String[] args) {
		Random rand = new Random();
		int random = (int) (rand.nextDouble() * 100);
		System.out.println("Odgadnij liczbe z przedialu od 1 do 100");
		Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		while(a != random)
		{
		if (a < random)
			System.out.println("Liczba jest zbyt mala");
		else
			System.out.println("Liczba jest zbyt wielka");
		a = scanner.nextInt();
		}
		System.out.println("Udalo ci sie");
		scanner.close();
		}
