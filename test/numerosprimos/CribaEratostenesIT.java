/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josem
 */
public class CribaEratostenesIT {

    /**
     * Test of generarPrimos method, of class CribaEratostenes.
     */

    @Test
    public void testGeneraPrimosConCero() {
        int max = 0;
        int expResult = 0;
        int[] result = CribaEratostenes.generarPrimos(max);
        assertEquals(expResult, result);
    }

    @Test
    public void testGeneraPrimosConDos() {
        int max = 2;
        int expResult = 2;
        int[] result = CribaEratostenes.generarPrimos(max);
        assertEquals(expResult, result);
    }

    @Test
    public void testGeneraPrimosConTres() {
        int max = 3;
        int[] expResult = {2, 3};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testGeneraPrimosConCien() {
        int max = 100;
        int[] expResult = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
    }

}
