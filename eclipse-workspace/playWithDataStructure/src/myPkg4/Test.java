package myPkg4;

public class Test {
	/**
	 * �����Ӵ�T������S�е�pos���ַ����λ��
	 * @param S
	 * @param T
	 * @param pos
	 * @return
	 */
	public static int index(String S,String T,int pos) {
		int i = pos;
		int j = 0;
		boolean flag = false;
		while(i < S.length() && j < T.length()) {
			if(S.charAt(i) == T.charAt(j)) {
				++i;
				++j;
				flag = true;
			}else {
				i = i-j+1;
				j = 0;
				flag = false;
			}
			System.out.println("i="+i+" j="+j+" "+flag);
		}
		if(flag) {
			return i-j;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		String S = "000000000000001";
		String T = "0001";
		int i = index(S,T,0);
		System.out.println(i);
	}

}
