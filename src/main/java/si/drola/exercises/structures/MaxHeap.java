package si.drola.exercises.structures;

public class MaxHeap extends Heap {

	public MaxHeap(int[] input) {
		super(input);
		
		//Construct a max heap from unordered data
		for(int i = parent(last()); i >= 0; i--) {
			maxHeapify(i);
		}
	}
	
	public void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest;
		if (l < heapSize && data[l] > data[i]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r < heapSize && data[r] > data[largest]) {
			largest = r;
		}
		if (largest != i) {
			int t = data[largest];
			data[largest] = data[i];
			data[i] = t;
			maxHeapify(largest);
		}
	}

}
