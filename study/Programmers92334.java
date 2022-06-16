import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Consumer;

class Programmers92334{
    public static void main(String[] args) {
        String[] tmp = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        String[] user = {"muzi", "frodo", "apeach", "neo"};
        solution(tmp,user,2);
    }

    public static void solution(String[] report,String[] user,int s){
        HashSet<String> set = new HashSet<String>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String,Integer> resultMap = new HashMap<String,Integer>();
        ArrayList<String> list = new ArrayList<String>();
        int[] result = new int[user.length];

        for(String a: report){
            set.add(a);
        }

        for(String a: user){
            map.put(a, 0);
            resultMap.put(a, 0);
        }

        set.forEach(
            new Consumer<String>() {
                @Override
                public void accept(String i) {
                    String[] tmp = i.split(" ");
                    map.put(tmp[1], map.get(tmp[1])+1);
                }
            }
        );

        map.forEach((k, v) -> {
            if(v >= s){
                list.add(k);
            }
            System.out.println("key: " + k + ", value: " + v);
        });

        
        set.forEach(
            new Consumer<String>() {
                @Override
                public void accept(String i) {
                    String[] tmp = i.split(" ");
                    if(list.contains(tmp[1])){
                        resultMap.put(tmp[0], resultMap.get(tmp[0])+1);
                    }
                }
            }
        );

        
        for(int i=0; i<user.length; i++){
            result[i] = resultMap.get(user[i]);

            System.out.println(user[i] + " /// " + result[i]);
        }
        
        
    }
}
