package study;

import java.util.Arrays;
import java.util.Locale;

/*
 */
public class Programmers12951 {

	public static void main(String[] args) {

		String a = "3people  unFollowed me";
		String b = "for   the last week";

		System.out.println(solution(b));
	}

	public static String solution(String str) {
		str = str.toLowerCase();

		String[] strs = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s : strs){
			sb.append(Character.toUpperCase(s.charAt(0)));
			sb.append(s.substring(1));
			sb.append(" ");
		}

		return sb.toString().trim();
	}
}
