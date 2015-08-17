package si.drola.exercises.sorting;

public class InsertionSort {
	public static int[] sort(int[] in) {
		for(int i = 1; i < in.length; i++) {
			for(int j = i - 1; j >= 0 && in[j] > in[j+1]; j--) {
				int t = in[j];
				in[j] = in[j+1];
				in[j+1] = t;
			}
		}
		
		return in;
	}
}
