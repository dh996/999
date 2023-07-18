package dd9999.p2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇과목?");
		int sCount = sc.nextInt();
		
		System.out.println("몇명?");
		int nCount = sc.nextInt();
		
		String[] name = new String[nCount];
		String[] subject = new String[nCount];
		
		for (int i = 0; i < sCount; i++) {
			
			System.out.println("과목" + (i + 1) + "이름.");
			subject[i] = sc.next();
		}
		
		int[][] score = new int[nCount][sCount];
		float[] tot = new float[nCount];
		float[] avg = new float[nCount];
		
		for (int i = 0; i < nCount; i++) {
			
			System.out.println("학생" + (i + 1) + "이름.");
			name[i] = sc.next();
			
			for (int j = 0; j < sCount; j++) {
				
				System.out.println(name[i] + "의 " + subject[j] + "점수.");
				score[i][j] = sc.nextInt();
				tot[i] += score[i][j];
			}
			avg[i] = tot[i] / sCount;
		}
		
		System.out.println("결과");
		System.out.printf("%s\t", "이름");
		
		for (int i = 0; i < sCount; i++) {
			
			System.out.printf("%s\t", subject[i]);
		}
		
		System.out.printf("%s\t%s\t", "합계", "평균");
		System.out.println();
		
		for (int i = 0; i < nCount; i++) {
			
			System.out.printf("%s\t", name[i]);
			
			for (int j = 0; j < sCount; j++) {
				
				System.out.printf("%d\t", score[i][j]);
			}
			
			System.out.printf("%4.1f\t%4.1f\t", tot[i], avg[i]);
			System.out.println();
		}
		
		System.out.println();
	}

}
