package study;

import java.util.HashMap;

//올바른 괄호 찾기~~~

public class ValidBrackets
{
    public static boolean isValid(String brackets) {
    	String[] arr = brackets.split("");
    	boolean flag = false;
    	HashMap<String, String> maps = new HashMap<String, String>();
    	maps.put("[","]");
    	maps.put("{","}");
    	maps.put("(",")");
    	
    	try {
	    	for(int i=0; i<(arr.length/2); i++) {
	    		if(maps.get(arr[i]).equals(arr[(arr.length-1)-i])){
	    			flag = true;
	    		}else {
	    			flag = false;
	    		}
	    	}
	    	return flag;
    	}catch(Exception e) {
    		 throw new UnsupportedOperationException("Unsupported Operation");
    	}
    }
    
    public static void main(String[] args) {
        System.out.println(ValidBrackets.isValid("[{()}]"));
    }
}

