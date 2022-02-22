import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
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
class TriTableauTest {

	
    static Stream<Arguments> chargerCroissant() throws Throwable 
    {
    	int[] t = {5, 3, 2};
    	int[] t2 = {8, 4, 1};
    	int[] t3 = {7, 4, 5};
    	
    	int[] result = {2, 3, 5};
    	int[] result2 = {1, 4, 8};
    	int[] result3 = {5, 7, 4};
    	
        return Stream.of(
        		Arguments.of(t, result), 
        		Arguments.of(t2, result2), 
        		Arguments.of(t3, result3)
        );
    }
    
    static Stream<Arguments> chargerDecroissant() throws Throwable 
    {
    	int[] t = {2, 3, 5};
    	int[] t2 = {1, 4, 8};
    	int[] t3 = {5, 7, 4};
    	
    	int[] result = {5, 3, 2};
    	int[] result2 = {8, 4, 1};
    	int[] result3 = {7, 4, 5};
    	
        return Stream.of(
        		Arguments.of(t, result), 
        		Arguments.of(t2, result2), 
        		Arguments.of(t3, result3)
        );
    }

	@ParameterizedTest(name="Tri Croissant numéro {index}: tableau={0}, résultat attendu = {1}")
	@MethodSource("chargerCroissant")
	void testTriCroissant(int[] t, int[] expectedResult) 
	{
		// Partie paramétrée
		try {
			TriTableau monTri = new TriTableau();
	        
	        monTri.triCroissant(t);
            
		} catch(RuntimeException ex) {
			fail(" THROW EXCEPTION : " + ex.getMessage());
		}
	        
	        assertEquals(Arrays.toString(expectedResult), Arrays.toString(t), "test \"assertEquals\" en echec pour " + Arrays.toString(t) + " != " + Arrays.toString(expectedResult)); 

	        assertFalse(expectedResult == t, "test \"assertFalse\" en echec pour " + Arrays.toString(t) + " != " + Arrays.toString(expectedResult));
	        
	}
	
	@ParameterizedTest(name="Tri Decroissant numéro {index}: tableau={0}, résultat attendu = {1}")
	@MethodSource("chargerDecroissant")
	void testTriDecroissant(int[] t, int[] expectedResult) 
	{

		// Partie paramétrée
		try {
			TriTableau monTri = new TriTableau();
            
            monTri.triDecroissant(t);
            
		} catch(RuntimeException ex) {
			fail(" THROW EXCEPTION : " + ex.getMessage());
		}

        
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(t), "test en echec pour " + Arrays.toString(t) + " != " + Arrays.toString(expectedResult));
        
        assertFalse(expectedResult == t, "test \"assertFalse\" en echec pour " + Arrays.toString(t) + " != " + Arrays.toString(expectedResult));

	}

}
