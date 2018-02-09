package myPcg14;

public class ThreadNode {

	int value;
	int leftThread;
	int rightThread;
	ThreadNode leftNode;
	ThreadNode rightNode;
	
	public ThreadNode(int value) {
		this.value = value;
		this.leftThread = 0;
		this.rightThread = 0;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	
	
}
