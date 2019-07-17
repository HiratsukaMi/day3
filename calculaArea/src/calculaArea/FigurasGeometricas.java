package calculaArea;

import java.util.Locale;
import java.util.Scanner;

public class FigurasGeometricas {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println ("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println ("Digite o terceiro número: ");
		double n3 = sc.nextDouble();
		sc.nextLine();
		
		double triangulo = n1 * n3;
		double circulo = 3.14 * (n3 * n3);
		double trapezio = (n1 + n2) * n3 / 2;
		double quadrado = n2 * n2;
		double retangulo = n1 * n2;
		
		System.out.printf ("A área do triângulo é: %.2f.\n", triangulo);
		System.out.printf ("A área do círculo é: %.2f.\n", circulo);
		System.out.printf ("A área do trapézio é: %.2f.\n", trapezio);
		System.out.printf ("A área do quadrado é: %.2f.\n", quadrado);
		System.out.printf ("A área do retangulo é: %.2f.\n", retangulo);
		
		sc.close();

	}

}
