package sort1;

public class CH08_05 {
	
	public void shellSort(int[] arr) {
		int temp = 0;//�ݴ�����
		int jump = arr.length/2;//�趨���λ����
		
		while(jump != 0) {
			for(int i = jump; i < arr.length ;i++ ) {
				temp = arr[i];
				int j = i-jump;
				while(j >= 0 && temp < arr[j]) {
					arr[j+jump] = arr[j];
					j = j - jump;
				}
				arr[jump+j] = temp;
			}
			jump = jump/2;
		}
	}

}
