package basic_algorithm;

import java.util.Stack;

public class Yunji {

  
	public static void main(String[] args) {
		
		System.out.print("답은" + solution("ababcdcdababcdcd"));
	}
	
	
	public static int solution(String s) {
		  	int answer = 0;
	        Stack<Object> stackStr =  new Stack<Object>();
	        int cutCount = 1;
	        int equalsCount = 0;
	        int minCount =0;
	        String tmp = "";
	        
	      
	        	for(int i=0; i < s.length(); i++){
	        		for(int j=0; j < s.length(); j=j+cutCount) {
			            if(!stackStr.isEmpty()&& stackStr.peek().equals(s.substring(i,i+cutCount))) {
			                	System.out.println(stackStr.peek());
			                	stackStr.push(equalsCount++);
			             }else {
			            	 	String a = "";
			            	 	if(i+cutCount >= s.length()) {
			            	 		a = s.substring(i);
			            	 	}else {
			            	 		a = s.substring(i,i+cutCount);
			            	 	}
			                	stackStr.push(a);
			             }
			            System.out.println(stackStr.peek());
			            
			            tmp += stackStr.pop();
			            if(i == 0) {
			            	minCount = tmp.length();
			            }else {
			            	if(stackStr.size() < minCount) {
			            		minCount = tmp.length();
			            	}
			            }
			            stackStr.clear();
			        }
	        		 cutCount++;
	        		 tmp = "";
	        	}
	        	
	        return minCount;
	}
	

}
