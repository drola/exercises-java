/**
 * 
 */
package si.drola.exercises.sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author drola
 *
 */
@RunWith(value = Parameterized.class)
public class IntegerSortTest {
	
	Class<?> implementingClass;
	IntegerSort implementation;
	
	public IntegerSortTest(Class<?> cl) {
		implementingClass = cl;
	}
	
	@Before
	public void setUp() throws InstantiationException, IllegalAccessException {
		implementation = (IntegerSort) implementingClass.newInstance();
	}

	@Test
	public void testEmptyArray() {
		int[] in = new int[0];
		int[] out = implementation.sort(in);
		int[] expected = new int[0];
		
		assertArrayEquals("result not correct", expected, out);
	}
	
	@Test
	public void testSortedArray() {
		int[] in = {1, 2, 3, 4, 5};
		int[] out = implementation.sort(in);
		int[] expected = {1, 2, 3, 4, 5};
		
		assertArrayEquals("result not correct", expected, out);
	}
	
	@Test
	public void testReverseArray() {
		int[] in = {5, 4, 3, 2, 1};
		int[] out = implementation.sort(in);
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
		int[] out = implementation.sort(in.clone());
		
		assertArrayEquals("result not correct", expected, out);
	}
	
	@Parameters(name = "{0}")
	public static Collection<Class<?>> implementationsList() {
		ArrayList<Class<?>> implementations = new ArrayList<Class<?>>();
		implementations.add(InsertionSort.class);
		implementations.add(MergeSort.class);
		implementations.add(BubbleSort.class);
		implementations.add(HeapSort.class);
		implementations.add(QuickSort.class);
		return implementations;
	}
}
