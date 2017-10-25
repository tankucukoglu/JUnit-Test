import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayOperationsNumZeroTest {

//	@Test
//	public void testNumZeroEmptyArray() {
//		int x[] = {}; // zero-sized array
//		int n = ArrayOperations.numZero(x);
//		assertEquals("0 zeros", 0, n);
//	}
//
//	@Test
//	public void testNumZeroArrayWithNoZeros() {
//		int[] x = { 1, 2, 3 };
//		int n = ArrayOperations.numZero(x);
//		assertEquals("0 zeros in an array with no zeros", 0, n);
//	}
	
	// Tan Kucukoglu
	
	@Test
	public void testFindLastWithYInFirstIndex() {
		int[] x = {1, 2, 3};
		int y = 1;
		int n = ArrayOperations.findLast(x, y);
		assertEquals("Last index of y in x", 0, n); // fails because loop doesn't check first index
	}
	
	@Test
	public void testFindLastWithYInNotFirstIndex() {
		int[] x = {1, 2, 3};
		int y = 2;
		int n = ArrayOperations.findLast(x, y);
		assertEquals("Last index of y in x", 1, n); // successful
	}
	@Test
	public void testCountPositiveWithZero() {
		int[] x = {-4, 2, 0, 2};
		int n = ArrayOperations.countPositive(x);
		assertEquals("Number of positive integers in x", 2, n); // fails because 0 is not a positive integer
	}
}