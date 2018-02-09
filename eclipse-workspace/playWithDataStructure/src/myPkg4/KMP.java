package myPkg4;

public class KMP {
	
	public static void get_next(String T,int[] next) {
		int i = 1;
		int j = 0;
		next[1] = 0;
		while(i < T.length()) {
			if(j == 0 || T.charAt(i-1) == T.charAt(j-1)) {
				++i;
				++j;
				next[i-1] = j;
			}else {
				j = next[j-1];
			}
		}
	}
	
	public static int index_kmp(String S,String T,int pos) {
		int i = pos;
		int j = 0;
		int[] next = new int[255];
		get_next(S, next);
		while(i < S.length()&& j < T.length()) {
			if(S.charAt(i) == T.charAt(j)) {
				++i;
				++j;
			}else {
				if(j != 0) {
					j = next[j-1];
				}else{
					++i;
				}
			}
		}
		return i-T.length();
	}
	
//	public static int[] getNext(String b){  
//	    int j=0;  
//	    int next[]=new int[b.length()+1];
//	    next[0]=next[1]=0;  
//	          
//	    for(int i = 1 ; i < b.length() ; i++){  
//	        while(j > 0 && b.charAt(i)!=b.charAt(j)) {
//	        	j = next[j];  
//	        }
//	        if(b.charAt(i)==b.charAt(j)) {
//	        	j++;  
//	        }
//	        next[i+1]=j;
//	    }  
//	          
//	    return next;  
//	}  
	
	public static void main(String[] args) {
		int a = index_kmp("ababaaaba","aaba", 0);
		System.out.println(a);
	}
}
