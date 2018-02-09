package sort1;

public class CH08_04 {
	
	public void insertSort(int[] data) {
		int temp = 0;
		for (int i = 1; i < data.length; i++) {
			temp = data[i];
			int j = i-1;
			while(j>=0 && temp < data[j]) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = temp;
		}
	}

}
