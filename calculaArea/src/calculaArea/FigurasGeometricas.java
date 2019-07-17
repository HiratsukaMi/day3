package calculaArea;

import java.util.Locale;
import java.util.Scanner;

public class FigurasGeometricas {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Digite o primeiro n�mero: ");
		double n1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println ("Digite o segundo n�mero: ");
		double n2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println ("Digite o terceiro n�mero: ");
		double n3 = sc.nextDouble();
		sc.nextLine();
		
		double triangulo = n1 * n3;
		double circulo = 3.14 * (n3 * n3);
		double trapezio = (n1 + n2) * n3 / 2;
		double quadrado = n2 * n2;
		double retangulo = n1 * n2;
		
		System.out.printf ("A �rea do tri�ngulo �: %.2f.\n", triangulo);
		System.out.printf ("A �rea do c�rculo �: %.2f.\n", circulo);
		System.out.printf ("A �rea do trap�zio �: %.2f.\n", trapezio);
		System.out.printf ("A �rea do quadrado �: %.2f.\n", quadrado);
		System.out.printf ("A �rea do retangulo �: %.2f.\n", retangulo);
		
		sc.close();

	}

}
