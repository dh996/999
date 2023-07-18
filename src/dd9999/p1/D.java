package dd9999.p1;

import java.util.Scanner;
import java.util.Arrays;

public class D {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		if(1<=a.length() && a.length()<=10) {
		
			char[] array = a.toCharArray();
			for(int i =0; i<array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

}
