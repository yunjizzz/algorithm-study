package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Test1 {
	
	
	public static void main(String[] args) {
		
		
		int[][] ints =  {{1,2},{4,2},{3,1},{4,5}};
		int size = 5;
		
		int[] result = solution(size,ints);
		int n = 0;
		while(n<5) {
			System.out.println(result[n]);
			n++;
		}
		
	}
	
	public static int[] solution(int N, int[][] relation) {
		int[][] relations = relation;
		int[] result = new int[N];
		int count = 0;
		int tmp = 0;
		int friends = 0;
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		HashMap<Integer,Integer> hash = new HashMap();
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<relation.length; i++) {

			tmp = relations[i][0];
			
			for(int j=0; j<2;j++) {
				if(tmp == relations[i][j]) {
					if(j == 0) {
						result[relations[i][1]-1] += 1;
					}else {
						result[relations[i][0]-1] += 1;
					}
				}
			}
		}
		
		for(int i=0; i<relation.length; i++) {

			tmp = relations[i][1];
			
			for(int j=0; j<2;j++) {
				if(tmp == relations[i][j]) {
					if(j == 0) {
						result[relations[i][1]-1] += 1;
					}else {
						result[relations[i][0]-1] += 1;
					}
				}
			}
		}
		
		
		
		
		
		return result;
	}

}
