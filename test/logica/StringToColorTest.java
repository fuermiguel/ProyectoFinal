/*Test unitario de la Clase que convierte un cadena con formato 
java.awt.Color[r=255,g=255,b=51] a rgb.

Con este test se ha comprobado funcionamiento correcto de la clase StringToColor
para cualquier valor de rgb pero con el formato java.awt.Color[r=,g=,b=].
 */

package logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class StringToColorTest {
     StringToColor stringToColor = null;
    public StringToColorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Se realizan test para cadena vacía, rgb negativos, 
     * cadena mal formada,rgb sin valores, cadena nula
     */
    @Before
    public void setUp() {
       //stringToColor = new StringToColor("sdfe[rferf");//cadena mal formada no se tiene encuenta en la clase
       stringToColor = new StringToColor("java.awt.Color[r=,g=,b=]");
       //stringToColor = new StringToColor("java.awt.Color[r=300,g=300,b=300]");
       //stringToColor = new StringToColor("java.awt.Color[r=-1,g=-1,b=-1]");
       //stringToColor = new StringToColor("");
       //stringToColor = new StringToColor(null);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getR method, of class StringToColor.
     */
    @Test
    public void testGetR() {
        System.out.println("getR");
       // StringToColor instance = null;
        int expResult = 0;
        int result = stringToColor.getR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getG method, of class StringToColor.
     */
    @Test
    public void testGetG() {
        System.out.println("getG");
        //StringToColor instance = null;
        int expResult = 0;
        int result = stringToColor.getG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getB method, of class StringToColor.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        //StringToColor instance = null;
        int expResult = 0;
        int result = stringToColor.getB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
