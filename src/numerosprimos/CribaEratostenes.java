/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 *
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin
 * tachar son números primos.
 */
package numerosprimos;

import java.util.Arrays;

public class CribaEratostenes {

    /**
     * Generar números primos de 1 a max
     *
     * @param max es el valor máximo
     * @return Vector de números primos
     */
    public static int[] generarPrimos(int max) {
        if (max < 2) {
            return new int[0]; // Vector vacío
        }

        boolean[] esPrimo = new boolean[max + 1];
        Arrays.fill(esPrimo, true); // Inicializar el array

        // Eliminar el 0 y el 1, que no son primos
        esPrimo[0] = esPrimo[1] = false;

        // Criba
        int cuenta = 0;
        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (int j = i * i; j <= max; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

        // ¿Cuántos primos hay?
        for (int i = 2; i <= max; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }

        // Rellenar el vector de números primos
        int[] primos = new int[cuenta];
        int j = 0;
        for (int i = 2; i <= max; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }

        return primos;
    }
}
