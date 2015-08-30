package si.drola.exercises.structures;

public class Heap {
	public int[] data;
	protected int heapSize;
	
	public Heap(int[] data) {
		this.data = data.clone();
		this.heapSize = getLength();
	}
	
	public int getLength() {
		return data.length;
	}
	
	public int getHeapSize() {
		return heapSize;
	}
	
	public void setHeapSize(int i) {
		heapSize = i;
	}
	
	public int root() {
		return 0;
	}
	
	public int left(int i) {
		return i*2 + 1;
	}
	
	public int right(int i) {
		return i*2 + 2;
	}
	
	public int parent(int i) {
		return (i-1)/2;
	}
	
	public int last() {
		return heapSize - 1;
	}
	
	public int rootValue() {
		return data[root()];
	}
	
	public int leftValue(int i) {
		return data[left(i)];
	}
	
	public int rightValue(int i) {
		return data[right(i)];
	}
	
	public int parentValue(int i) {
		return data[parent(i)];
	}
	
	public int lastValue() {
		return data[last()];
	}
}
