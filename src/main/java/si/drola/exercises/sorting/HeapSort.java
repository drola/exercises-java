package si.drola.exercises.sorting;

import si.drola.exercises.structures.MaxHeap;

public class HeapSort extends IntegerSort {

	@Override
	public int[] sort(int[] in) {
		MaxHeap heap = new MaxHeap(in);
		for (int i = heap.getLength() - 1; i > 0; i--) {
			int t = heap.data[0];
			heap.data[0] = heap.data[i];
			heap.data[i] = t;
			heap.setHeapSize(heap.getHeapSize() - 1);
			heap.maxHeapify(0);
		}
		
		return heap.data;
	}

}
