package myPcg4;

public class StackByArray {
	
	private int[] stack;
	private int top;
	/**
	 * 创建构造器，初始化数组的大小
	 * 并将指向指向-1
	 * @param stack_size
	 */
	public StackByArray(int stack_size) {
		stack = new int[stack_size];
		top = -1;
	}
	
	/**
	 * 先将指针加1，再将元素添加进去，最后返回为true
	 * @param data
	 * @return
	 */
	public boolean push(int data) {
		if(top >= stack.length) {
			System.err.println("堆栈已满，无法再加入");
			return false;
		}else {
			stack[++top] = data;
			return true;
		}
	}
	/**
	 * 根据指针来判断是否为空
	 * @return
	 */
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 先返回数组元素，再将指针减1
	 * @return
	 */
	public int pop() {
		if(isEmpty()) {
			return -1;
		}else {
			return stack[top--];
		}
	}

}
