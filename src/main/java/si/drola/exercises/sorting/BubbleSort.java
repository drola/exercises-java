package si.drola.exercises.sorting;

public class BubbleSort extends IntegerSort {
	public int[] sort(int[] in) {
		for(int i = 0; i < in.length; i++) {
			for(int j = in.length - 1; j > i; j--) {
				if (in[j-1] > in[j]) {
					int t = in[j-1];
					in[j-1] = in[j];
					in[j] = t;
				}
			}
		}
		
		return in;
	}
}
