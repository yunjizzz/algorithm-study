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
		StringBuilder sb = new StringBuilder();
		boolean upperCaseMode = true;

		for(String a : str.toLowerCase().split("")){
			sb.append( upperCaseMode ? a.toUpperCase() : a);
			upperCaseMode = a.equals(" ");
		}

		return sb.toString();
	}
}
