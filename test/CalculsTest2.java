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
    
    static Stream<Arguments> chargerAddition() throws Throwable 
    {
        return Stream.of(
        		Arguments.of(2,2,4), 
        		Arguments.of(6,6,12), 
        		Arguments.of(3,2,5)
        );
    }
    
    static Stream<Arguments> chargerSoustraction() throws Throwable 
    {
        return Stream.of(
        		Arguments.of(2,2,0), 
        		Arguments.of(6,6,0), 
        		Arguments.of(3,2,1)
        );
    }

	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, r�sultat attendu = {2}")
	@MethodSource("chargerMultiplication")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test en echec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramétres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}
	
	@ParameterizedTest(name="Division numéro {index}: nombre1={0}, nombre2={1}, r�sultat attendu = {2}")
	@MethodSource("chargerDivision")
	void testDivision(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.diviser(), "test en echec pour " + firstNumber + " / " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramétres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}
	
	@ParameterizedTest(name="Addition numéro {index}: nombre1={0}, nombre2={1}, r�sultat attendu = {2}")
	@MethodSource("chargerAddition")
	void testAddition(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.additionner(), "test en echec pour " + firstNumber + " + " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramétres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}
	
	@ParameterizedTest(name="Soustraction numéro {index}: nombre1={0}, nombre2={1}, r�sultat attendu = {2}")
	@MethodSource("chargerSoustraction")
	void testSoustraction(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.soustraire(), "test en echec pour " + firstNumber + " - " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramétres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}

}
