package dd9999.p1;

import java.util.Scanner;

public class E {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(1<=n && n<=1000) {
			if(n%2 == 1) {
				System.out.println(n+" is odd");
			}
			else {
				System.out.println(n+" is even");
			}
		}
	}

}
