package si.drola.exercises.sorting;

public class QuickSort extends IntegerSort {
	protected static int partition(int[] A, int p, int r) {
		int pivot = A[r-1];
		int q = p - 1;
		int t;
		
		for(int j = p; j < r - 1; j++) {
			if(A[j] <= pivot) {
				q++;
				t = A[j];
				A[j] = A[q];
				A[q] = t;
			}
		}
		
		t = A[r-1];
		A[r-1] = A[q + 1];
		A[q + 1] = t;
		
		return q + 1;
	}
	
	protected static void quickSort(int[] A, int p, int r) {
		if (p < r - 1) {
			int q = partition(A, p, r);
			quickSort(A, p, q);
			quickSort(A, q + 1, r);
		}
	}

	@Override
	public int[] sort(int[] in) {
		quickSort(in, 0, in.length);
		return in;
	}

}
