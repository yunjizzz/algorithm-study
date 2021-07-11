package study;

import java.util.HashMap;

/*
*숫자 문자열과 영단어
문제 설명
img1.png

네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

숫자	영단어
0	zero
1	one
2	two
3	three
4	four
5	five
6	six
7	seven
8	eight
9	nine
제한사항
1 ≤ s의 길이 ≤ 50
s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
* */
public class Programmers81301 {

    public static void main(String[] args) {

        String s = "23four5six7";



        System.out.println(solution(s));
    }

    public static int solution(String s) {
        //hashmap setting
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("zero",0);
        maps.put("one",1);
        maps.put("two",2);
        maps.put("three",3);
        maps.put("four",4);
        maps.put("five",5);
        maps.put("six",6);
        maps.put("seven",7);
        maps.put("eight",8);
        maps.put("nine",9);

        String result = "";
        String[] strs = s.split("");
        StringBuffer sb = new StringBuffer();
        for(int i =0; i < strs.length; i++){
            try {
                if(Integer.parseInt(strs[i]) < 10)
                    result += strs[i];
            }catch(NumberFormatException e){
                sb.append(strs[i]);
                if(sb.length() >= 3 && maps.containsKey(sb.toString())){
                    result += maps.get(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        return Integer.parseInt(result);
    }
}
