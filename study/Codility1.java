package study;

public class Codility1 {


	public static void main(String[] args) {
		
		
		String size = "baaabbabbb";
		
		int result = solution(size);

		System.out.println(result);
	}
		//������ ������.........�� Ǯ�̸�����.. ������....�� �ٽ�Ǯ�� �̰�
	    public static int solution(String N) {
	    	int end = 0 ,start =0;
	    	int b =0 , a=0;
	    	
	    	int count = 0;
	        char[] chars = N.toCharArray();
	        char before = ' ';
	        
	        for(int i=0; i<chars.length; i++) {
	        	if(i != 0) {
	        		before = chars[i-1];
	        		if(chars[i] == 'a' && before =='a') {
		        		a++;
		        	}else if(chars[i] == 'b' && before =='b'){
		        		b++;
		        	}
	        	}else {
	        		before = chars[0];
	        		if(before == 'a') {
	        			a++;
	        		}else {
	        			b++;
	        		}
	        	}
	        	if(a==3) {
	        		a--;
	        		count++;
	        	}else if(b==3) {
	        		b--;
	        		count++;
	        	}
	        	if(count > 1) {
        			end = i-1;
        		}else {
        			start = i-2;
        		}
	        }
	        return N.substring(start,end).length();
	    }
}
