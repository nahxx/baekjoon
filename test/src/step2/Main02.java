package step2;

import java.util.Scanner;

public class Main02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String result = "";
		if(score < 101 && score > 89) {
			result = "A";
		} else if (score < 90 && score > 79) {
			result = "B";
		} else if (score < 80 && score > 69) {
			result = "C";
		} else if (score < 70 && score > 59) {
			result = "D";
		} else if (score < 60) {
			result = "F";
		}
		System.out.println(result);
	}
	
}
