package myPcg7;

public class CH05_02 {
	
	public static void main(String[] args) {
		
		Linked_List_Queue queue = new Linked_List_Queue();
		int temp;
		System.out.println("以链表来实现队列");
		System.out.println("=================");
		System.out.println("在队列前端加入第一个数据，此数据为1");
		queue.enqueue(1);
		System.out.println("在队列前端加入第一个数据，此数据为2");
		queue.enqueue(2);
		System.out.println("在队列前端加入第一个数据，此数据为3");
		queue.enqueue(3);
		System.out.println("在队列前端加入第一个数据，此数据为4");
		queue.enqueue(4);
		System.out.println("在队列前端加入第一个数据，此数据为5");
		queue.enqueue(5);
		
		while(true) {
			
			if(!(queue.front == null)) {
				temp = queue.dequeue();
				System.out.print("在队列前端依次取出的元素数据为："+temp);
			}else {
				break;
			}
			System.out.println();
		}
		
		
	}

}
