package si.drola.exercises.structures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HeapTest {
	private Heap heap;
	
	@Before
    public void setUp() {
        heap = new Heap(new int[] {1,2,3,4,5});
    }

	@Test
	public void testRootValue() {
		assertEquals(1, heap.rootValue());
	}
	
	@Test
	public void testLeftValue() {
		assertEquals(2, heap.leftValue(heap.root()));
	}
	
	@Test
	public void testRightValue() {
		assertEquals(3, heap.rightValue(heap.root()));
	}
	
	@Test
	public void testParentValue() {
		assertEquals(1, heap.parentValue(heap.left(heap.root())));
		assertEquals(1, heap.parentValue(heap.right(heap.root())));
	}

}
