package si.drola.exercises.sorting;

import java.util.Random;

public class RandomizedQuickSort extends QuickSort {
	protected static Random rnd;
	static {
		rnd = new Random();
	}
	protected static int partition(int[] A, int p, int r) {
		int t = A[r-1];
		int i = rnd.nextInt(r - p - 1) + p;
		A[r-1] = A[i];
		A[i] = t;
		return QuickSort.partition(A, p, r);
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
