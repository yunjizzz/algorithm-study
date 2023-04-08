package coding_test;

import java.util.HashMap;
import java.util.LinkedList;

public class ReadWriteExecute {

    static HashMap<String,Integer> map = new HashMap<>();
    static {
        map.put("r", 4);
        map.put("w", 2);
        map.put("x", 1);
        map.put("-", 0);
    }
    public static int symbolicToInt(String permString) {
        String[] blocks = permString.split("");
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i=0; i < blocks.length-2; i+=3){
           sum = map.get(blocks[i]) + map.get(blocks[i+1]) + map.get(blocks[i+2]);

           sb.append(sum);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        // Should write 752
        System.out.println(ReadWriteExecute.symbolicToInt("rwxr-x-w-"));
    }
}
