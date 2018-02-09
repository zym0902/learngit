package myPkg2;

public class LinkList {
	
	LinkList list;
	int maxSize = 100;
	int[] data = new int[maxSize];
	int length = listLength();
	
	public int getElement(int i) {
		int temp = 0;
		if(list.length == 0 || i<1 || i>list.length) {
			temp = -1;
		}else {
			temp = list.data[i];
		}
		return temp;
	}
	
	public boolean listInsert(int i,int element) {
		int k = 0;
		if(list.length == maxSize) {
			return false; 
		}
		if(i<1 || i>list.length-1) {
			return false;
		}
		if(i<list.length) {
			for (k=list.length-1;k>=i-1;k--) {
				list.data[k+1] = list.data[k];
			}
		}
		list.data[i-1] = element;
		return true;
	}
	
	public int listLength() {
		int temp = 0;
		for (int i = 0; i < data.length; i++) {
			++temp;
			if(data[i] == 0) {
				break;
			}
		}
		return temp;
	}
	
	public int listDelete(int i) {
		int temp = 0;
		if(list.listLength() == 0) {
			return -999;
		}
		if(i < 1 || i > list.listLength()) {
			return -999;
		}
		temp = list.data[i-1];
		if(i < list.listLength()) {
			for(int k = i ; k < list.listLength() ; k++) {
				list.data[k-1] = list.data[k];
			}
		}
		return temp;
	}

}
