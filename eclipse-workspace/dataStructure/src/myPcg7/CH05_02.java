package myPcg7;

public class CH05_02 {
	
	public static void main(String[] args) {
		
		Linked_List_Queue queue = new Linked_List_Queue();
		int temp;
		System.out.println("��������ʵ�ֶ���");
		System.out.println("=================");
		System.out.println("�ڶ���ǰ�˼����һ�����ݣ�������Ϊ1");
		queue.enqueue(1);
		System.out.println("�ڶ���ǰ�˼����һ�����ݣ�������Ϊ2");
		queue.enqueue(2);
		System.out.println("�ڶ���ǰ�˼����һ�����ݣ�������Ϊ3");
		queue.enqueue(3);
		System.out.println("�ڶ���ǰ�˼����һ�����ݣ�������Ϊ4");
		queue.enqueue(4);
		System.out.println("�ڶ���ǰ�˼����һ�����ݣ�������Ϊ5");
		queue.enqueue(5);
		
		while(true) {
			
			if(!(queue.front == null)) {
				temp = queue.dequeue();
				System.out.print("�ڶ���ǰ������ȡ����Ԫ������Ϊ��"+temp);
			}else {
				break;
			}
			System.out.println();
		}
		
		
	}

}
