package step2;

import java.util.Scanner;

public class Main06 {
	// 시작 시분, 걸리는시간
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		m += t;
		if(m > 59) {
			if((m / 60) >= 1) {
				t = m / 60;
				m -= 60 * t;
				h += t;
				if(h > 23) {
					h -= 24;
				}
			}
			
		}
		
		System.out.println(h + " " + m);
	}
	
}
