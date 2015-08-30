package si.drola.exercises.sorting;

public class HoarePartitionQuickSort extends QuickSort {
	protected static int partition(int[] A, int p, int r) {
		int x = A[p];
		int i = p - 1;
		int j = r;
		
		while(true) {
			while(A[--j] > x) {
				;
			}
			while(A[++i] < x) {
				;
			}
			if (i < j) {
				int t = A[i];
				A[i] = A[j];
				A[j] = t;
			} else {
				return j;
			}
		}
	}
	protected static void quickSort(int[] A, int p, int r) {
		if (p < r - 1) {
			int q = partition(A, p, r);
			quickSort(A, p, q + 1);
			quickSort(A, q + 1, r);
		}
	}

	@Override
	public int[] sort(int[] in) {
		quickSort(in, 0, in.length);
		return in;
	}
}
