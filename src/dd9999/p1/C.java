package dd9999.p1;

import java.util.Scanner;

public class C {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if(a.length()<=10 && b.length()<=10) {
			System.out.println(a+b);
		}
	}

}
