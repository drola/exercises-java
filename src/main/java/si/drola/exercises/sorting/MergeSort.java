package si.drola.exercises.sorting;

public class MergeSort extends IntegerSort {
	protected static void merge(int[] A, int p, int q, int r) {
		int n1 = q - p;
		int n2 = r - q;
		
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		
		for(int i = p; i < q; i++) {
			L[i-p] = A[i];
		}
		for(int i = q; i < r; i++) {
			R[i-q] = A[i];
		}
		
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		
		for(int k = p; k < r; k++) {
			if (L[i] < R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
		}
	}
	
	protected static void mergeSort(int[] A, int p, int r) {
		if ((p+1) < r) {
			int q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q, r);
			merge(A, p, q, r);
		}
	}
	
	public int[] sort(int[] in)  {
		mergeSort(in, 0, in.length);
		return in;
	}
}
