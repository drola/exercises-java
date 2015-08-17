/**
 * 
 */
package si.drola.exercises.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author drola
 *
 */
public class InsertionSortTest {

	@Test
	public void testEmptyArray() {
		int[] in = new int[0];
		int[] out = InsertionSort.sort(in);
		int[] expected = new int[0];
		
		assertArrayEquals("result not correct", expected, out);
	}
	
	@Test
	public void testSortedArray() {
		int[] in = {1, 2, 3, 4, 5};
		int[] out = InsertionSort.sort(in);
		int[] expected = {1, 2, 3, 4, 5};
		
		assertArrayEquals("result not correct", expected, out);
	}
	
	@Test
	public void testReverseArray() {
		int[] in = {5, 4, 3, 2, 1};
		int[] out = InsertionSort.sort(in);
		int[] expected = {1, 2, 3, 4, 5};
		
		assertArrayEquals("result not correct", expected, out);
	}
	
	@Test
	public void testRandomArray() {
		int N = 30;
		int[] in = new int[N];
		java.util.Random rnd = new java.util.Random();
		for(int i = 0; i < N; i++) {
			in[i] = rnd.nextInt();
		}
		int[] expected = in.clone();
		Arrays.sort(expected);
		int[] out = InsertionSort.sort(in.clone());
		
		assertArrayEquals("result not correct", expected, out);
	}
}
