package study;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java
 */
public class Programmers120956 {

	public static void main(String[] args) {

		String[] arr1 = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] arr2 = {"aya", "yee", "u", "maa", "wyeoo"};
		

		System.out.println(solution(arr1));
	}

	public static int solution(String[] arr) {
		
		String[] blabla = {"aya", "ye", "woo", "ma"};
		int answer = 0;

		for(String str: arr){
			boolean isContinue = true;
			String tmp = "";
			for(String bla: blabla){
				tmp = bla;
				while(isContinue){
					if(str.contains(bla)){
						tmp = bla.split(str).toString();
						if(!tmp.equals("")){
							isContinue = true;
						}
					}else if(tmp.contains(str)){
						tmp = tmp.split(str).toString();
						System.out.println("tmp="+tmp);
						if(!tmp.equals("")){
							isContinue = true;
						}
					}else{
						isContinue = false;
					}
				}
				if(tmp.equals("")){
					answer++;
				}
			}
		}
		return answer;
	}
}
