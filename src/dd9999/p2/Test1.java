package dd9999.p2;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적 입력받은 뒤 이름 국어 영어 수학 총점 평균을 출력하는 프로그램짜기
		Scanner sc = new Scanner(System.in);
		String name;
		int[] score = new int[3];
		float tot = 0f;
		System.out.println("이름.");
		name = sc.next();
		System.out.println("국영수.");
		for(int i=0;i<score.length;i++) {
			score[i]=sc.nextInt();
			tot += score[i];
		}
		float avg = tot/score.length;
		System.out.println("성적");
		System.out.println(name+" 국"+score[0]+" 영"+score[1]+" 수"+score[2]+" 계"+tot+" 평"+avg);
		//출력방식변화
		System.out.println();
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t","이름","국","영","수","계","평");
		System.out.println();
		System.out.printf("%s\t",name);
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d\t",score[i]);
		}
		System.out.printf("%4.1f\t%4.1f\t",tot,avg);
		System.out.println();
	}

}