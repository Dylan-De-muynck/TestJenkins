import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Yo
 *
 */
@RunWith(Parameterized.class)
class CalculsTest2 {

	@Test
	void test() 
	{
		fail("Not yet implemented");
	}

    static Stream<Arguments> chargerMultiplication() throws Throwable 
    {
        return Stream.of(
        		Arguments.of(2,2,4), 
        		Arguments.of(6,6,36), 
        		Arguments.of(3,2,3)
        );
    }
    
    static Stream<Arguments> chargerDivision() throws Throwable 
    {
        return Stream.of(
        		Arguments.of(2,2,1), 
        		Arguments.of(6,6,1), 
        		Arguments.of(3,2,1)
        );
    }

	@ParameterizedTest(name="Multiplication numÈro {index}: nombre1={0}, nombre2={1}, rÈsultat attendu = {2}")
	@MethodSource("chargerMultiplication")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie param√©tr√©e
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test en Èchec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie ind√©pendante (les param√®tres peuvent ne servir qu'√† une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}
	
	@ParameterizedTest(name="Division numÈro {index}: nombre1={0}, nombre2={1}, rÈsultat attendu = {2}")
	@MethodSource("chargerDivision")
	void testDivision(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie param√©tr√©e
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.diviser(), "test en Èchec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie ind√©pendante (les param√®tres peuvent ne servir qu'√† une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}

}
