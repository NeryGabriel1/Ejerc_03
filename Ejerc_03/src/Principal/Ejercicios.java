package Principal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un texto para analizar:");
		String texto = scanner.nextLine();

		// Dividir el texto en palabras
		String[] palabras = texto.split("\\s+");

		// Crear un mapa para almacenar la frecuencia de cada palabra
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		int totalLongitud = 0;

		for (String palabra : palabras) {
			// Actualizar la frecuencia de la palabra
			frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);

			// Actualizar la longitud total de las palabras
			totalLongitud += palabra.length();
		}

		// Calcular la longitud promedio de las palabras
		double longitudPromedio = (double) totalLongitud / palabras.length;

		// Mostrar las estadísticas
		System.out.println("Número de palabras: " + palabras.length);
		System.out.println("Longitud promedio de las palabras: " + longitudPromedio);
		System.out.println("Frecuencia de cada palabra: " + frecuenciaPalabras);
		
		scanner.close();
	}
	
}
